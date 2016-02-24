//Calcule a dívida do cheque especial ao ser quitada 6 meses depois a uma taxa
//de 5% de juros ao mês. O valor do empréstimo deve ser informado. (D = E*(1+j)^t)

package ListadeExercicio;

import java.util.Scanner;

public class Questao03 {
	
	public static void main (String...arg){
		
		Scanner entrada = new Scanner (System.in);
		Integer valorEmprestimo;
		Integer valorFinal;
		Integer meses = null;
		Float juros = (float) 0.05;

		System.out.println("Informe o valor do emprestimo");
			valorEmprestimo = entrada.nextInt();
		System.out.println("Quantos meses contratou esse cheque especial e não pagou?");
			meses = entrada.nextInt();	

		valorFinal = (int) (valorEmprestimo *juros)*meses;	
		System.out.println("O valor a ser pago é de R$"+(valorFinal + valorEmprestimo));
	}

}
