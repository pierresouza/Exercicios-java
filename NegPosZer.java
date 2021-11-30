package exercicio;

import java.util.Scanner;

public class NegPosZer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor : ");
		valor = sc.nextInt();
		
		if (valor>=0) {
			System.out.println("positivo");
		}
		else {
			System.out.println("Negativo");
		}
		sc.close();
	}
}
