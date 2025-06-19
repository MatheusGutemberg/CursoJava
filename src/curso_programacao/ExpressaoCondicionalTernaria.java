package curso_programacao;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		/** Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.
		 * Sintaxe:
		 * (condição) ? valor_se_verdadeiro : valor_se_falso
		 */
		
		//Com if e else
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.5;
		}
		System.out.println(desconto);
		 
		//Com condição ternária
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
		System.out.println(desconto);

	}

}
