package ExerciciosLacosRepeticao;
/*Função: Exercício 5 Laço de Repetição Do...While
 * Autora: Talu - Turma 25
 * Data: 04.06.2021
*/
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);	
		int n, soma = 0;

		System.out.println("Insira quaisquer valores para soma. Insira 0 para ver o resultado.");
		
		do {
			n = entrada.nextInt();
			soma+= n;
			
		} while(n != 0); {
			 System.out.println("A soma dos valores é: " + soma);
			 entrada.close();
		 }
	}
}