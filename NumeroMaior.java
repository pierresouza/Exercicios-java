package exercicio;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		System.out.println("Digite o primeiro valor : ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor : ");
		valor2 = sc.nextInt();
		
		if(valor1>valor2) {
			System.out.println("o primeiro valor é maior");
		}
		else {
			System.out.println("O segundo valor é maior");
		}
		sc.close();
	}
}
