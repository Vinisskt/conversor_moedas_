package com.app;

public record Conversor(String base_code, String target_code, String conversion_rate, String conversion_result) {

	@Override
	public String toString() {
		return "\nmoeda original -> " + base_code + "\n" +
				"moeda a ser convertida -> " + target_code + "\n" +
				"taxa de conversao -> " + conversion_rate + "\n" +
				"resultado conversao -> " + conversion_result + "\n";
	}
}
