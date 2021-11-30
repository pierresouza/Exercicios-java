package exercicio;

import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quant_estoque;
		int quant_max_estoque;
		int quant_min_estoque;
		
		System.out.println("Qual a quantidade em estoque : ");
		quant_estoque = sc.nextInt();
		
		System.out.println("Qual a quantidade máxima em estoque : ");
		quant_max_estoque = sc.nextInt();
		
		System.out.println("Qual a quantidade minima em estoque:");
		quant_min_estoque = sc.nextInt();
		
		float quant_media = (quant_max_estoque + quant_min_estoque)/2;
		
		if (quant_estoque>=quant_media){
			System.out.println("Não efetuar a compra !");
		}
		else {
			System.out.println("Efetuar a compra");
		}
		sc.close();
	}
}
