package exercicio;

import java.util.Scanner;

public class TimeFutebol {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o nome do primeiro time: ");
		var time1 = sc.next();
		System.out.print("Quantos gols esse time fez? ");
		int gol1 = sc.nextInt();
		System.out.print("Digite o nome do segundo time: ");
		var time2 = sc.next();
		System.out.print("Quantos gols esse time fez? ");
		int gol2 = sc.nextInt();
		
		if (gol1 > gol2) {
			System.out.print("O time vencedor foi: " + time1);
		} else if (gol2 > gol1){
			System.out.print("O time vencedor foi: " + time2);
		} else {
			System.out.print("EMPATE!");
		}
		sc.close();
	}
}
