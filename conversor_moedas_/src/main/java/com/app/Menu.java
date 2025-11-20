package com.app;

import java.util.Scanner;

public class Menu {
	private String menu;

	public Menu() {
		this.menu = menu();
	}

	private String menu() {
		String menu = String.format("""

					  digite o numero para acessar as
					             conversoes

					#####################################
					##     ##            ##            ##
					##  1  ##   real     ##   euro     ##
					##  2  ##   euro     ##   real     ##
					##  3  ##   dolar    ##   euro     ##
					##  4  ##   real     ##   dolar    ##
					##  5  ##   euro     ##   dolar    ##
					##  6  ##   dolar    ##   real     ##
					##  7  ##            ##   sair     ##
					##     ##            ##            ##
					#####################################
				\n""");

		return menu;
	}

	public boolean validaçaoEntrada(char entrada, Scanner scanner) {

		// verificando entrada valida.
		if (entrada == '0' || entrada == '8' || entrada == '9') {
			System.out.println("\nvalor invalido, tente novamente com numeros de 1 a 7\n");
			return false;
		}

		boolean isDigit = Character.isDigit(entrada);
		if (isDigit == false) {
			System.out.println("\nvalor invalido, tente novamente com numeros de 1 a 7\n");
			return false;
		}
		return true;
	}

	public String getMenu() {
		return menu;
	}
}
