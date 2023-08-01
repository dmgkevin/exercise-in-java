package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resposta;
		do {
			System.out.println("Informe a temperatura em Celcius:");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.println("Deseja repetir o comando ? (s/n)");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');

		sc.close();
	}

}
