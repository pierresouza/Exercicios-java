package exercicio;

import java.util.Scanner;

public class CartaoCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cliente;
		float saldo;
		float debito;
		float credito;
		
		System.out.println("Digite o número da sua conta");
		cliente = sc.nextInt();
		
		System.out.println("Digite o seu saldo bancário : ");
		saldo = sc.nextInt();
		
		System.out.println("Digite  seu débito : ");
		debito = sc.nextFloat();
		
		System.out.println("Digite seu crédito : ");
		credito = sc.nextFloat();

		float saldoatual = saldo - debito + credito;
		System.out.println("Olá cliente " + cliente + " seu saldo atual é :" + saldoatual);
		sc.close();
	}

}
