package exercicio;

import java.util.Scanner;

public class Macas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quant;
		
		System.out.println("Digite a quantidade de maçãs compradas : ");
		quant = sc.nextInt();
		if(quant<12) {
			 double total = quant * 1.3;
		System.out.println(" o valor é de: " + total);
		}
		else {
			int total = quant * 1;
			System.out.println("O valor é de :" + total);
		}
		sc.close();
	}
}
