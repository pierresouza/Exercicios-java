package exercicio;

import java.util.Scanner;

public class OrdemCrescente3Valores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Digite um n�mero");
		n1 = sc.nextInt();

		System.out.println("Digite um n�mero");
		n2 = sc.nextInt();

		System.out.println("Digite um n�mero");
		n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3 && n2 > n3) {
			System.out.println("A ordem crescente � :" +  n1 + "," + n2 + ","+ n3);			
		}

		else if (n1 > n2 && n1 > n3 && n3 > n2) {
			System.out.println("A ordem crescente � : " + n2 + "," + n3 + "," + n1 );
		}
		
		else if (n2 > n1 && n2 > n3 && n1 > n3) {
			System.out.println("A ordem crescente � : " + n2 + "," + n1 + "," + n3 );
		} 
		
		else if (n2 > n1 && n2 > n3 && n3 > n1) {
			System.out.println("A ordem crescente � : " + n2 + "," + n3 + "," + n1);
		} 
		
		else if (n3 > n1 && n3 > n2 && n1 > n2) {
			System.out.println("A ordem crescente � : " + n2 + "," + n1 + "," + n3);
		}
		
		else {
			System.out.println("A ordem crescente � : " +  n1 + "," + n2 + "," + n3);
		}
		sc.close();
	}
}
