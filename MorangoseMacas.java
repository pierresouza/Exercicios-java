package exercicio;

import java.util.Scanner;

public class MorangoseMacas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int macas, morangos;
		double sub_total;

		System.out.println("Digite a quantidade de maçãs (em Kg) : ");
		macas = sc.nextInt();

		System.out.println("Digite a quantidade de morangos(em Kg) : ");
		morangos = sc.nextInt();

		if (macas <= 5 && morangos <= 5) {
			double kg_macas = macas * 1 + 80;
			double kg_morangos = morangos * 2.50;
			sub_total = kg_macas + kg_morangos;
			System.out.println("o valor total sem desconto é : " + sub_total);
		}

		else if (macas > 5 && morangos > 5) {
			double kg_macas = macas * 1.50;
			double kg_morangos = morangos * 2.20;
			sub_total = kg_macas + kg_morangos;
			System.out.println("O valor total sem desconto é : " + sub_total);
		}

		else if (macas > 5 && morangos <= 5) {
			double kg_macas = macas * 1.80;
			double kg_morangos = morangos * 2.50;
			sub_total = kg_macas + kg_morangos;
			System.out.println("O valor total sem desconto é : " + sub_total);
		}
		
		else  {
			double kg_macas=macas*1.80;
			double kg_morangos=morangos*2.20;
			sub_total = kg_macas + kg_morangos;
			 System.out.println("O valor total sem desconto é : " + sub_total);
		}
		
		
		
		double kg_total = macas+morangos;
		if(sub_total>25 || kg_total>8) {
			double desconto = sub_total*0.1;
			double valor_final=sub_total-desconto;
			System.out.println("O valor final com desconto é : " + valor_final);
		}
		else if (sub_total<25 && kg_total<8){
			System.out.println("Desconto não aplicado por falta de requisitos");
		}
		sc.close();
	}
}
