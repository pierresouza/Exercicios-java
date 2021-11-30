package exercicio;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		System.out.println("Digite um valor :");
		valor1 = sc.nextInt();
		
		System.out.println("Digite um valor :");
		valor2 = sc.nextInt();
		
		if (valor1<valor2) {
			System.out.println("A ordem crescente é :" + valor1 + " , " + valor2);
		}
		else {
			System.out.println("A ordem crescente é :" + valor2 + " , " + valor1);
		}
		sc.close();
	}
}
