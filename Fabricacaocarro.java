package exercicio;

import java.util.Scanner;

public class Fabricacaocarro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float custofabrica;
		
		System.out.println("Digite o valor de custo de f�brica��o do carro : ");
		custofabrica= sc.nextFloat();
		
		Double custofinal = (custofabrica*0.28) + (custofabrica*0.45) +custofabrica;
		System.out.println("o valor do carro para o consumidor �: " + custofinal);
		
		sc.close();
	}
}
