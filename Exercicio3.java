package ExerciciosLacosRepeticao;
/*Função: Exercício 3 Laço de Repetição While
 * Autora: Talu - Turma 25
 * Data: 04.06.2021
*/
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade = 0, jovem = 0, maior50 = 0;
		
		while (idade != -99) {
		System.out.println("Quantos anos você tem?");
		idade = entrada.nextInt();
		
		if (idade <= 21 && idade >=0) {
		jovem++;
		}
		else if (idade >50) {
		maior50++;
		}
	}
	System.out.println("Menores de 21 anos: " + jovem);
	System.out.println("Maiores de 50 anos: " + maior50);
	entrada.close();
	}
}