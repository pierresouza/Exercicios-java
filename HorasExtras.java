package exercicio;

import java.util.Scanner;

public class HorasExtras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horastrabalhadas;
		int horasextras;
		float salariohora;
		double valorhorasextras;
		
		
		System.out.println("Digite as horas trabalhadas no m�s : ");
		horastrabalhadas = sc.nextInt();
		
		System.out.println("Digite seu sal�rio por hora : ");
		salariohora = sc.nextInt();
		
		if(horastrabalhadas<=160) {
			float salariofinal = horastrabalhadas * salariohora; 
			System.out.println("O sal�rio final � de :" + salariofinal);
		}
		
		else {
			horasextras = horastrabalhadas - 160;
			valorhorasextras = horasextras*salariohora*1.5;
			double salariofinal = valorhorasextras+160*salariohora;
			System.out.println("O sal�rio final � de :" + salariofinal);			
		}
		sc.close();
	}
}
