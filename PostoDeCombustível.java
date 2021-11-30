package exercicio;

import java.util.Scanner;

public class PostoDeCombustível {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float litros;
		char combustível;
		
		System.out.println("Qual combústivel o carro foi abastecido, A para álcool e G para gasolina: ");
		combustível = sc.next().charAt(0);
		
		System.out.println("Quantos litros foram abastecidos : ");
		litros = sc.nextInt();
		
		if (combustível == 'G' && litros<=20) {
			double litros_sem_desc = litros*3.30;
			double valor_desc = litros_sem_desc * 0.04;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago é de:" + valor_total);
		}
		else if  (combustível == 'G' && litros>20){ 
			double litros_sem_desc = litros*3.30;
			double valor_desc = litros_sem_desc * 0.06;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago é de:" + valor_total);
		}
		else if  (combustível == 'A' && litros<=20){ 
			double litros_sem_desc = litros*2.90;
			double valor_desc = litros_sem_desc * 0.03;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago é de:" + valor_total);
		}
		else { 
			double litros_sem_desc = litros*2.90;
			double valor_desc = litros_sem_desc * 0.05;
			double valor_total = litros_sem_desc - valor_desc;
			System.out.println("O valor total a ser pago é de:" + valor_total);
		}
		sc.close();
	}
}
