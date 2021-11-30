package exercicio;

import java.util.Scanner;

public class ComissaoCarro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salariofixo;
		float comissaocarro;
		float valortotalcarros;
		int quantcarros;
		
		System.out.println("Digite o salario fixo do vendedor: ");
		salariofixo = sc.nextInt();
		
		System.out.println("Digite a comissão por carro vendido: ");
		comissaocarro = sc.nextInt();
		
		System.out.println("Digite a quantidade de carros vendidos: ");
		quantcarros = sc.nextInt();
		
		System.out.println("Digite a soma total do valores dos carros: ");
		valortotalcarros = sc.nextInt();
		
		float salario_final = salariofixo + comissaocarro * quantcarros + 5 * valortotalcarros/100/2;
		System.out.println("O salário final do vendedor equivale a :" + salario_final);
		
		sc.close();
	}
}
