package exercicio;

import java.util.Scanner;

public class CartaoCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cliente;
		float saldo;
		float debito;
		float credito;
		
		System.out.println("Digite o n�mero da sua conta");
		cliente = sc.nextInt();
		
		System.out.println("Digite o seu saldo banc�rio : ");
		saldo = sc.nextInt();
		
		System.out.println("Digite  seu d�bito : ");
		debito = sc.nextFloat();
		
		System.out.println("Digite seu cr�dito : ");
		credito = sc.nextFloat();

		float saldoatual = saldo - debito + credito;
		System.out.println("Ol� cliente " + cliente + " seu saldo atual � :" + saldoatual);
		sc.close();
	}

}
