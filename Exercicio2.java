package ExerciciosLacosRepeticao;
/*Fun��o: Exerc�cio 2 La�o de Repeti��o For
 * Autora: Talu - Turma 25
 * Data: 04.06.2021
*/
import java.util.*; //o * chama todas as bibliotecas do java.

public class Exercicio2 {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		int n, i, par = 0, impar = 0;
		
		for (i = 0;i <=10;i++) {
		System.out.println("Insira um n�mero: ");
		n = entrada.nextInt();

		if (n%2 == 0) {
		par++; //incremento
		}
		else{
		impar++; //incremento
		}
	}
		System.out.println("Voc� inseriu: " + par + " n�meros pares.");
		System.out.println("Voc� inseriu: " + impar + " n�meros �mpares.");
	}
}