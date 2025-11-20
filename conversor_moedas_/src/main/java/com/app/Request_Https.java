package com.app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import io.github.cdimascio.dotenv.Dotenv;

public class Request_Https {
	private String url;
	private String response;

	public Request_Https() {
	}

	public String getUrl() {
		return url;
	}

	public String getResponse() {
		return response;
	}

	public void Create_url_(String input, String output, String value) {
		Dotenv dotenv = Dotenv.load();
		String key_api = dotenv.get("API_KEY");
		String url = "https://v6.exchangerate-api.com/v6/" + key_api + "/pair/" + input + "/" + output + "/"
				+ value;
		this.url = url;
	}

	public void Conversion_Https_search(String url) {
		try {
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create(url))
					.build();

			HttpResponse<String> response = client
					.send(request, BodyHandlers.ofString());
			this.response = response.body();

		} catch (MalformedURLException | InterruptedException e) {
			System.out.println("Argumento invalido, necessario url valida");
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
