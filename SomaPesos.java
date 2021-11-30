package exercicio;

import java.util.Scanner;

public class SomaPesos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade_homen1,idade_homen2,idade_mulher1,idade_mulher2;
		
		System.out.println("Digite a idade do homen 1 : ");
		idade_homen1=sc.nextInt();
		
		System.out.println("Digite a idade do homen 2 : ");
		idade_homen2=sc.nextInt();
		
		System.out.println("Digite a idade da mulher 1 : ");
		idade_mulher1=sc.nextInt();
		
		System.out.println("Digite a idade da mulher 2 : ");
		idade_mulher2=sc.nextInt();
		
		if (idade_homen1>idade_homen2 && idade_mulher1>idade_mulher2) {
			int soma1 = idade_homen1 + idade_mulher2;
			int soma2 = idade_homen2 + idade_mulher1;
			System.out.println("A soma do homem mais velho com a mulher mais nova é : "+ soma1);
			System.out.println("A soma do homem mais novo com a mulher mais velha é : " + soma2 );
		}
		
		else if (idade_homen1<idade_homen2 && idade_mulher1<idade_mulher2) {
			int soma1 = idade_homen2 + idade_mulher1;
			int soma2 = idade_homen1 + idade_mulher2;
			System.out.println("A soma do homem mais velho com a mulher mais nova é : "+ soma1);
			System.out.println("A soma do homem mais novo com a mulher mais velha é : " + soma2 );
		}	
		
		else if (idade_homen1<idade_homen2 && idade_mulher1>idade_mulher2) {
			int soma1 = idade_homen2 + idade_mulher1;
			int soma2 = idade_homen1 + idade_mulher2;
			System.out.println("A soma do homem mais velho com a mulher mais nova é : "+ soma1);
			System.out.println("A soma do homem mais novo com a mulher mais velha é : " + soma2 );
		}	
		else {
			int soma1 = idade_homen1 + idade_mulher2;
			int soma2 = idade_homen2 + idade_mulher1;
			System.out.println("A soma do homem mais velho com a mulher mais nova é : "+ soma1);
			System.out.println("A soma do homem mais novo com a mulher mais velha é : " + soma2 );
		}		
		
		sc.close();
	}
}
