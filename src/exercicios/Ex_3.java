package exercicios;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite a senha:");
		x = sc.nextInt();
		
		while(x != 2002) {
			System.out.println("Senha invalida!");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();

	}

}
