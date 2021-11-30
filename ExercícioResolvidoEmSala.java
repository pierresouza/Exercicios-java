package exercicio;
 
public class ExercícioResolvidoEmSala {

	public static void main(String[] args) {
		
		int valor = 0;
		int contador;
		
		for(contador=1; contador<=500; contador++) {
			if (contador%2==0) {
				valor=valor+contador;
			}
		}
		System.out.println("O somatório dos primeiros pares dentre os 500 números são : " +  valor);
			
	}
}
