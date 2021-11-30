package exercicio;

import java.util.Scanner;
public class Porcentagemdeeleitores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int votostotais;
		int votosbrancos;
		int votosnulos;
		int votosvalidos;
		
		
		System.out.println("Digite a quantidade de eleitores no município :");
		votostotais = sc.nextInt();
		System.out.println("Digite a quantidade total de votos brancos :");
		votosbrancos = sc.nextInt();
		System.out.println("Digite a quantidade total de votos nulos :");
		votosnulos = sc.nextInt();
		System.out.println("Digite a quantidade total de votos validos :");
		votosvalidos = sc.nextInt();
		
		
		float porvotosbrancos = (votosbrancos * 100)/votostotais;
		float porvotosnulos   = (votosnulos * 100)/votostotais;
		float porvotosvalidos = (votosvalidos * 100)/votostotais;

		
		System.out.println("A porcentagem de votos nulos é:" + porvotosnulos + "%");
		System.out.println("A porcentagem de votos brancos é:" + porvotosbrancos + "%");
		System.out.println("A porcentagem de votos validos é:" + porvotosvalidos + "%");
		sc.close();

	}
}
