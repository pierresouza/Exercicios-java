package exercicio;

import java.util.Scanner;

public class IdadeVotacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anonascimento;
		int anoatual;
		
		System.out.println("Informe seu ano de nascimento : ");
		anonascimento = sc.nextInt();
		
		System.out.println("Informe o ano atual : ");
		anoatual = sc.nextInt();
		
		int idade = anoatual - anonascimento;
		
		if(idade>=16) {
			System.out.println("Pode votar");
		}
		
		else {
			System.out.println("Não pode votar");
		}
		sc.close();
	}
}
