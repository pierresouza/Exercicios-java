package exercicio;

import java.util.Scanner;

public class Aposentadoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nascimento,ingresso,ano_atual,idade,anos_trabalhados;
		
		System.out.println("Digite seu ano de nascimento ");
		nascimento=sc.nextInt();
		
		System.out.println("Digite seu ano de ingresso na empresa ");
		ingresso=sc.nextInt();
		
		System.out.println("Digite o ano atual ");
		ano_atual=sc.nextInt();
		
		idade=ano_atual-nascimento;
		anos_trabalhados=ano_atual-ingresso;
		
		if(idade>=65 || anos_trabalhados>=25) {
			System.out.println("Já pode se aposentar!");
		}
		
		else if(idade>=60 || anos_trabalhados>=25) {
			System.out.println("Já pode aposentar!");
		}
		
		else {
			System.out.println("Não pode se aposentar");
		}
		sc.close();
	}
	
}
