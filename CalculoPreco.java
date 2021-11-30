package exercicio;

import java.util.Scanner;

public class CalculoPreco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int quant;
		char nome;
		double preco_unidade,total_pagar,desconto;
		
		System.out.println("Digite o nome do produto : ");
		nome=sc.next().charAt(0);
		
		System.out.println("Digite a quantidade adquirida do produto : ");
		quant=sc.nextInt();
		
		System.out.println("Digite o valor unitário : ");
		preco_unidade=sc.nextDouble();
		
		if(quant<=5) {
		
		total_pagar=quant*preco_unidade;
		desconto=total_pagar*0.2;
		total_pagar=total_pagar-desconto;
		System.out.println("O valor do produto" + nome + " , " + "a ser pago é  R$ : " + total_pagar);
		}
		
		else if(quant>5 && quant <=10) {
			total_pagar=quant*preco_unidade;
			desconto=total_pagar*0.3;
			total_pagar=total_pagar-desconto;
			System.out.println("O valor do produto" + nome + " , " + "a ser pago é R$ : " + total_pagar);
		}
		
		else {
			total_pagar=quant*preco_unidade;
			desconto=total_pagar*0.5;
			total_pagar=total_pagar-desconto;
			System.out.println("O valor do produto" + nome + " , " + "a ser pago é R$ : " + total_pagar);
		}
		
		sc.close();
	}
}
