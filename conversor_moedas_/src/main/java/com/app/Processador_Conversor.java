package com.app;

public class Processador_Conversor {
  public Processador_Conversor() {
  }

  public void Processador(String input, String output, Conversion_json json, String value) {
    Request_Https request = new Request_Https();
    request.Create_url_(input, output, value);
    request.Conversion_Https_search(request.getUrl());
    json.Convesion_json_Obj(request.getResponse());
    System.out.println(json.getConversor());
  }
}
