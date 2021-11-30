package exercicio;

import java.util.Scanner;

public class Salarioajuste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioatual;
		float reajuste;
		
		System.out.println("Digite o salário mensal atual de um funcionário :");
		salarioatual = sc.nextInt();
		
		System.out.println("Digite o percentual de reajuste : ");
		reajuste = sc.nextInt();
		
		float salariofinal = (salarioatual*reajuste/100)+salarioatual;
		
		System.out.println("o salário final com reajuste é : R$ " + salariofinal);
		sc.close();
	}
}
