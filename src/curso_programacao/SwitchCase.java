package curso_programacao;

import java.util.Scanner;

/**
 * Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).
 * Escrever na tela o dia da semana correspondente, conforme exemlos.
 */

public class SwitchCase {

	public static void main(String[] args) {
		
		//Da forma que eu sei
		
		Scanner sc = new Scanner(System.in);
		int dia = sc.nextInt();
		
		if (dia == 1) {
			System.out.println("Dia da semana: domingo");
		} else if (dia == 2) {
			System.out.println("Dia da semana: segunda");
		} else if (dia == 3) {
			System.out.println("Dia da semana: terça");
		} else if (dia == 4) {
			System.out.println("Dia da semana: quarta");
		}else if (dia == 5) {
			System.out.println("Dia da semana: quinta");
		}else if (dia == 6) {
			System.out.println("Dia da semana: sexta");
		} else if (dia == 7) {
			System.out.println("Dia da semana: sábado");
		} else {
			System.out.println("Dia da semana: valor inválido");
		}
		
		//Agora com o Switch Case
		
		String diaSemana;
		
		switch (dia) {
		case 1:
			diaSemana = "domingo";
			break;
		case 2:
			diaSemana = "segunda";
			break;
		case 3:
			diaSemana = "terça";
			break;
		case 4:
			diaSemana = "quarta";
			break;
		case 5:
			diaSemana = "quinta";
			break;
		case 6:
			diaSemana = "sexta";
			break;
		case 7:
			diaSemana = "sábado";
			break;
		default:
			diaSemana = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + diaSemana);

	}

}
