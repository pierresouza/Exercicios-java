package exercicio;

import java.util.Scanner;

public class AprovadoOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1;
		float nota2;
		
		System.out.println("Digite a nota 1 :");
		nota1 = sc.nextFloat();
		
		System.out.println("Digite a nota 2 :");
		nota2 = sc.nextFloat();
		
		float notafinal = (nota1 + nota2)/2;
		if(notafinal>6) {
			System.out.println("Aprovado(a), média final :" + notafinal);
		}
		else {
			System.out.println("Reprovado, média final :" + notafinal);
		}
		sc.close();
	}
}
