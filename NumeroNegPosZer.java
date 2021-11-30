package exercicio;

import java.util.Scanner;

public class NumeroNegPosZer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		if(numero>0) {
			System.out.println("Positivo");
		}
		else  if(numero<0){
			System.out.println("Negativo");
		}
		else{
			System.out.println("Zero");
		}
	sc.close();
	}
}
