package exercicio;

import java.util.Scanner;

public class PostoDeCombust�vel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float litros;
		char combust�vel;
		
		System.out.println("Qual comb�stivel o carro foi abastecido, A para �lcool e G para gasolina: ");
		combust�vel = sc.next().charAt(0);
		
		System.out.println("Quantos litros foram abastecidos : ");
		litros = sc.nextInt();
		
		if (combust�vel == 'G' && litros<=20) {
			double litros_sem_desc = litros*3.30;
			double valor_desc = litros_sem_desc * 0.04;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago � de:" + valor_total);
		}
		else if  (combust�vel == 'G' && litros>20){ 
			double litros_sem_desc = litros*3.30;
			double valor_desc = litros_sem_desc * 0.06;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago � de:" + valor_total);
		}
		else if  (combust�vel == 'A' && litros<=20){ 
			double litros_sem_desc = litros*2.90;
			double valor_desc = litros_sem_desc * 0.03;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago � de:" + valor_total);
		}
		else { 
			double litros_sem_desc = litros*2.90;
			double valor_desc = litros_sem_desc * 0.05;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago � de:" + valor_total);
		}
		sc.close();
	}
}
