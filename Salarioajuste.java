package exercicio;

import java.util.Scanner;

public class Salarioajuste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioatual;
		float reajuste;
		
		System.out.println("Digite o sal�rio mensal atual de um funcion�rio :");
		salarioatual = sc.nextInt();
		
		System.out.println("Digite o percentual de reajuste : ");
		reajuste = sc.nextInt();
		
		float salariofinal = (salarioatual*reajuste/100)+salarioatual;
		
		System.out.println("o sal�rio final com reajuste � : R$ " + salariofinal);
		sc.close();
	}
}
