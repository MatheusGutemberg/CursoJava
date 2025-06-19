package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		double conta = (numero - 100) * 2 + 50;
		
		
		if (numero <= 100) {
			System.out.println("Valor a pagar: R$ 50.00");
		} else {
			System.out.println("Valor a pagar: R$ " + conta);
		}
		
	}

}
