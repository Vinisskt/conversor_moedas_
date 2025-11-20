package com.app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Objetos instanciados;
		Scanner scanner = new Scanner(System.in);
		Conversor conversor = new Conversor("base_code", "target_code", "convesion_rate", "conversion_result");
		Conversion_json json = new Conversion_json(conversor);
		Processador_Conversor processador = new Processador_Conversor();
		Menu menu = new Menu();

		// execulsão do programa;
		while (true) {
			System.out.println(menu.getMenu());

			// solicitar a entrada do usuario referente ao menu
			System.out.println("\nescolha qual opçao deseja\n");
			char entrada = scanner.next().charAt(0);

			// validando entrada do usuario
			if (menu.validaçaoEntrada(entrada, scanner) == false) {
				continue;
			}

			if (entrada == '7') {
				scanner.close();
				System.out.println("\nprograma finalizado\n");
				break;
			}

			// solicitar o valor a ser convertido
			System.out.println("\ndigite qual o valor a ser convertido\n");
			String value = scanner.next();

			// interaçao com o usuario
			switch (entrada) {
				case '1':
					processador.Processador("BRL", "EUR", json, value);
					break;
				case '2':
					processador.Processador("EUR", "BRL", json, value);
					break;
				case '3':
					processador.Processador("USD", "EUR", json, value);
					break;
				case '4':
					processador.Processador("BRL", "USD", json, value);
					break;
				case '5':
					processador.Processador("EUR", "USD", json, value);
					break;
				case '6':
					processador.Processador("USD", "BRL", json, value);
					break;

			}
		}
	}
}
