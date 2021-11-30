package exercicio;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int valor1;
		
		System.out.println("Digite o primeiro valor :");
		valor = sc.nextInt();
		
		System.out.println("Digite o segundo valor");
		valor1 = sc.nextInt();
		
		if(valor>valor1) {
			System.out.println("o maior valor é : " + valor);
		}
		else {
			System.out.println("o maior valor é : " + valor1);
		}
		sc.close();
	}
}
