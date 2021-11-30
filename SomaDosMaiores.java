package exercicio;

import java.util.Scanner;

public class SomaDosMaiores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Digite um número");
		n1 = sc.nextInt();

		System.out.println("Digite um número");
		n2 = sc.nextInt();

		System.out.println("Digite um número");
		n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3 && n2 > n3) {
			int resultado = n1 + n2;
			System.out.println("A soma dos dois maiores valores é :" + resultado);
			
		}

		else if (n1 > n2 && n1 > n3 && n3 > n2) {
			int resultado = n1 + n3;
			System.out.println("A soma dos dois valores é : " + resultado);
		} 
		
		else if (n2 > n1 && n2 > n3 && n1 > n3) {
			int resultado = n1 + n2;
			System.out.println("A soma dos dois valores é : " + resultado);
		} 
		
		else if (n2 > n1 && n2 > n3 && n3 > n1) {
			int resultado = n2 + n3;
			System.out.println("A soma dos dois valores é : " + resultado);
		} 
		
		else if (n3 > n1 && n3 > n2 && n1 > n2) {
			int resultado = n1 + n3;
			System.out.println("A soma dos dois valores é : " + resultado);
		}
		
		else {
			int resultado = n2 + n3;
			System.out.println("A soma dos valores é : " + resultado);
		}
		sc.close();
	}

}
