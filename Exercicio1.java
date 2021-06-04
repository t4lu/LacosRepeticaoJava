package ExerciciosLacosRepeticao;
/*Função: Exercício 1 Laço de Repetição For
 * Autora: Talu - Turma 25
 * Data: 04.06.2021
*/
public class Exercicio1 {

	public static void main(String[] args) {
		int i = 1000;
		
		for (i=1000; i<= 1999;i++) {
		
		if(i%11==5) {
			System.out.println("Contagem: " + i);
			}	
		}
	}
}