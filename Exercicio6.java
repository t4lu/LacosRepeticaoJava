package ExerciciosLacosRepeticao;
/*Fun��o: Exerc�cio 6 La�o de Repeti��o Do...While
 * Autora: Talu - Turma 25
 * Data: 04.06.2021
*/
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
		int n, soma = 0, c = 0;
		double media;

		System.out.println("Insira quaisquer valores. O programa calcular� a m�dia dos valores m�ltiplos de 3. \n(Insira 0 para exibir o resultado.)");
		do {
			n = entrada.nextInt();
			//media+= n;
		if (n %3 == 0) {
			soma +=n;
			c++;
		}			
			}while(n!= 0); {
				media = soma / c;
				System.out.println("A m�dia dos valores m�ltiplos de 3 �: " + media);
				 entrada.close();
		}
	}
}