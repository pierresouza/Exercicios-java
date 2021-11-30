package exercicio;

import java.util.Scanner;

public class MadiaAproveitamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota1,nota2,nota3,exercicios,nfinal;
		
		System.out.println("Entre com a nota 1 : ");
		nota1 = sc.nextFloat();
		
		System.out.println("Entre com a nota 2 : ");
		nota2 = sc.nextFloat();
		
		System.out.println("Entre com a nota 3 : ");
		nota3 = sc.nextFloat();
		
		System.out.println("Entre com a média de exercícios : ");
		exercicios = sc.nextFloat();
		
		nfinal= nota1+nota2*2+nota3*3+exercicios/7;
		
		if(nfinal>=9) {
			System.out.println("Conceito A");
		}
		
		else if(nfinal>=7.5 && nfinal<9) {
			System.out.println("Conceito B");
		}
		
		else if(nfinal>=6 && nfinal<7.5) {
			System.out.println("Conceito C");
		}
		
		else {
			System.out.println("Conceito D");
		}
		
		sc.close();
	}
}
