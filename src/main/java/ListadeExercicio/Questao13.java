// João tem um cofre com muitas moedas, e deseja
// saber quantos reais conseguiu poupar. Faça um
// algoritmo para ler a quantidade de cada tipo de
// moeda, e imprimir o valor total economizado, em
// reais. Considere que existam moedas de 1, 5, 10,
// 25 e 50 centavos, e ainda moedas de 1 real. Não
// havendo moeda de um tipo, a quantidade respectiva é zero. 

package ListadeExercicio;

import java.util.Scanner;

public class Questao13 {

	public static void main (String...arg){
		
		Scanner entrada = new Scanner(System.in);
		Integer moeda1real;
		Integer moeda1centavo;
		Integer moeda5centavo;
		Integer moeda10centavo;
		Integer moeda25centavo;
		Integer moeda50centavo;
		Integer totalEmMoeda;
		
		System.out.println("Digite a quantidade de moedas de 1 real");
		moeda1real = entrada.nextInt();
		
		System.out.println("Digite a quantidade de moedas de 1 centavos");
		moeda1centavo = entrada.nextInt();
		
		System.out.println("Digite a quantidade de moedas de 5 centavos");
		moeda5centavo = entrada.nextInt();
		
		System.out.println("Digite a quantidade de moedas de 10 centavos");
		moeda10centavo = entrada.nextInt();
		
		System.out.println("Digite a quantidade de moedas de 25 centavos");
		moeda25centavo = entrada.nextInt();
		
		System.out.println("Digite a quantidade de moedas de 50 centavos");
		moeda50centavo = entrada.nextInt();
		
		totalEmMoeda = moeda1real + moeda5centavo + moeda10centavo + moeda25centavo
				+moeda50centavo + moeda1centavo;
		
		moeda1real = moeda1real*1;
		moeda1centavo = moeda1centavo * 1;
		moeda5centavo = (int) (moeda5centavo * 0.5);
		moeda10centavo = (int) (moeda10centavo * 0.10);
		moeda25centavo = (int) ((moeda25centavo) * 0.25);
		moeda50centavo = (int) ((moeda50centavo) * 0.50);
		
		System.out.println(moeda50centavo);
	}
	
}
