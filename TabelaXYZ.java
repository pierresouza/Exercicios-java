package exercicio;

import java.util.Scanner;

public class TabelaXYZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y,z;
		char resposta;
		
		System.out.println("Digite o valor de X : ");
		x = sc.nextInt();
		
		System.out.println("Digite o valor de Y : ");
		y = sc.nextInt();
		
		z = x*y + 5;
		
		if(z<=0) {
			 resposta = 'A';
			System.out.println("A respota � : " + resposta);
			System.out.println("O valor de Z � : "+z+" a resposta � : " + resposta);
		}
		else if(z<=100) {
			 resposta = 'B';
			System.out.println("A resposta � : " + resposta);
			System.out.println("O valor de Z � : "+z+" a resposta � : " + resposta);
		}
		else {
			resposta = 'C';
			System.out.println("A resposta � : " + resposta);
			System.out.println("O valor de Z � : "+z+" a resposta � : " + resposta);
		}
		sc.close();
	}
}

//(" ------------------------------------------------")
//("|                   VARI�VEIS                   |")
//("|-----------------------------------------------|")
//("|  x  |  y  | z  |         Resposta            |")
//("|-----------------------------------------------|")
//("|  3  | 2   | 11 |  B                         |")
//("|-----------------------------------------------|")
//("|  150| 3   |455 |  C                         |")
//("|-----------------------------------------------|")
//("|   7 |  -1 | -2 |  A                        |")
//("|-----------------------------------------------|")
//("|  -2 |   5 | -5 |  A                        |")
//("|-----------------------------------------------|")
//("|  50 |  3  |155 |  C                         |")
//("|-----------------------------------------------|")