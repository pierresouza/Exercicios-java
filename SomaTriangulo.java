package exercicio;

import java.util.Scanner;

public class SomaTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, valor3;
		
		System.out.println("Digite o primeiro valor : ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o se valor : ");
		valor2 = sc.nextInt();
		
		System.out.println("Digite o terceiro valor : ");
		valor3 = sc.nextInt();
		
		if(valor1<valor2 + valor3 && valor2<valor1 + valor3 && valor3< valor2 + valor1) {
			System.out.println("é um triangulo");
		}
		else {
			System.out.println("Não é um triângulo");
		}
		
	sc.close();
	}
	
}
