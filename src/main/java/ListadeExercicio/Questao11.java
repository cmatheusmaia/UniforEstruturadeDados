//A padaria PãoPão vende uma certa quantidade de pães franceses
//e uma quantidade de broas a cada dia. Cada pãozinho custa
//R$ 0,42 e a broa custa R$ 2,50. Ao final do dia,
//o dono quer saber quanto arrecadou com a venda dos pães e 
//broas (juntos), e quanto' deve guardar numa conta de poupança 
//(10% do total arrecadado). Você foi contratado para fazer
//os cálculos para o dono. Com base nestes fatos, faça um
//algoritmo para ler as quantidades de pães e de broas
//e depois calcular os dados solicitados. 

package ListadeExercicio;

import java.util.Scanner;

public class Questao11 {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		Double pPao = 0.42;
		Double pBroa = 2.50;
		Double qPao;
		Double qBroa;
		
			System.out.println("Digite a quantidade de pão?");
				qPao = entrada.nextDouble();
			System.out.println("Digite a quantidade de Broa?");
				qBroa = entrada.nextDouble();
		
		Double resultPao = qPao * pPao;
		Double resultBroa = qBroa * pBroa;
		Double totalVenda = resultPao + resultBroa;
				
			System.out.println("Venda total "+totalVenda);
			System.out.println("Venda em pão: "+resultPao);
			System.out.println("Venda em broa: "+resultBroa);
			System.out.println("A depositar na Poupança: R$"+ (0.10 * totalVenda)+" reais.");
		
		
	}
}
