package ExerciciosLacosRepeticao;
/*Função: Exercício 4 Laço de Repetição While
 * Autora: Talu - Turma 25
 * Data: 04.06.2021
*/
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int idade, sexo, humor = 0, nervmaior40 = 0, contador = 0;
		int calms = 0, mnervs = 0, hagressivs = 0, ocalms = 0, cmenor18 = 0;
		
		while (contador <150) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			System.out.println("Digite seu sexo:\n1 - Feminino; \n2 - Masculino; \n3 Outros. ");
			sexo = entrada.nextInt();
			
			System.out.println("Classifique seu humor:\n1 - Calma(o); \n2 - Nervosa(o); \n3 - Agressiva(o).");
			humor = entrada.nextInt();
			if (humor == 1) {
				calms++;
			}
			if (sexo == 1 && humor ==2){
				mnervs++;
			}
			if (sexo == 2 && humor ==3){
				hagressivs++;
			}
			if (sexo == 3 && humor ==1){
				ocalms++;
			}
			if (idade >=40 && humor ==2){
				nervmaior40++;
			}
			if (idade <18 && humor ==1){
				cmenor18++;
			}
		contador++;
	}
	System.out.println("Total de pessoas calmas: " + calms);
	System.out.println("Total de mulheres nervosas: " + mnervs);
	System.out.println("Total de homens agressivos: " + hagressivs);
	System.out.println("Total de calmos na categoria 'Outros': " + ocalms);
	System.out.println("Total de pessoas nervosas e com mais de 40 anos: " + nervmaior40);
	System.out.println("Total de pessoas calmas e com menos de 18 anos: " + cmenor18);
	
	entrada.close();
	}
}