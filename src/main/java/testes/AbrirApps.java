package testes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AbrirApps {
	
	public static void main(String[] args) throws IOException{
		Scanner entrada = new Scanner(System.in);
		int i;
		int n;
		
		System.out.println("Informe o numero para tabuada");
		n = entrada.nextInt();
		
		FileWriter arq = new FileWriter("C:\teste\teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.println("+-------Resultado--------+");
		for (i=1; i<10; i++){
			gravarArq.println();
		}
		gravarArq.println("+------------------------+");
		
		arq.close();
		
		System.out.println("Tabuada gerada com sucesso em "+arq);
	}
}
