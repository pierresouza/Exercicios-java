package exercicio;
 
public class Exerc�cioResolvidoEmSala {

	public static void main(String[] args) {
		
		int valor = 0;
		int contador;
		
		for(contador=1; contador<=500; contador++) {
			if (contador%2==0) {
				valor=valor+contador;
			}
		}
		System.out.println("O somat�rio dos primeiros pares dentre os 500 n�meros s�o : " +  valor);
			
	}
}
