package exercicio;

import java.util.Scanner;

public class TabelasTraingulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o valor de A : ");
		a= sc.nextInt();
		
		System.out.println("Digite o valor de B : ");
		b=sc.nextInt();
		
		System.out.println("Digite o valor de C : ");
		c=sc.nextInt();
		
		if(a<b+c && b<a+c && c<a+b) {
			if(a==b && b==c) {
				System.out.println("Triangulo Equil�tero");
			}
		}
		
		else if(a==b || b==c || a==c) {
			System.out.println("Triangulo Is�sceles");
		}
		
		else {
			System.out.println("Tri�ngulo Escaleno");
		}
			
		sc.close();
	}
}
