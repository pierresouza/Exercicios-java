package exercicio;

import java.util.Scanner;

public class PartidaDeXadrez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horainicio;
		int horafinal;
		
		System.out.println("Digite o horario de início :");
		horainicio = sc.nextInt();
		
		System.out.println("Digite a hora do término :");
		horafinal = sc.nextInt();
		
		int duracao = horafinal - horainicio ;
		
		if(duracao>0) {
			System.out.println("A partida teve " + duracao + " horas de duração");
		}
		else {
			duracao = duracao + 24;
		}
		sc.close();
	}
}
