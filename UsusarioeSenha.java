package exercicio;

import java.util.Scanner;

public class UsusarioeSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int usuario,senha = 0;
		
		System.out.println("Digite seu c�digo de usu�rio");
		usuario=sc.nextInt();
		
		if(usuario!=1234) {
			System.out.println("Usu�rio n�o reconhecido !");
		}
		else {
			System.out.println("Usu�rio reconhecido, Digite sua senha para prosseguir :");
			senha=sc.nextInt();
		}
		if(senha!=9999) {
			System.out.println("Senha incorreta, Digite novamente !");
		}
		
		else {
			System.out.println("Senha correta, Acesso permitido");
		}
		
		
		sc.close();
	}
}
