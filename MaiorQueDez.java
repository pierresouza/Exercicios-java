package exercicio;

import java.util.Scanner;

public class MaiorQueDez {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor");
		valor = sc.nextInt();
		
		if(valor>10) { 
			System.out.println("� maior que 10 !");
			// if = se
	}
		else { 
			System.out.println("N�o � maior que 10 !");
			// else = sen�o
		}
	sc.close();			
	}
}