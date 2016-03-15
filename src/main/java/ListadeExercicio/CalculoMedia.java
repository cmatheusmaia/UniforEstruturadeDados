package ListadeExercicio;

import java.util.Scanner;

public class CalculoMedia {
	    public static void main(String[] args) {
	        
	        int opcaoEscolha;
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.println("Informe a nota 1");
	        int n1 = entrada.nextInt();
	        System.out.println("Informe a nota 2");
	        int n2 = entrada.nextInt();
	        System.out.println("Informe a nota 3");
	        int n3 = entrada.nextInt();
	        
	        System.out.println("Dada opção,");
	        System.out.println("1 - Media aritmetica");
	        System.out.println("2 - Media ponderada");
	        System.out.println("3 - Media harmonica");
	        opcaoEscolha = (int) entrada.nextFloat();
	        
	        switch( opcaoEscolha )
	        {
	            case 3:
	                System.out.println("MÉDIA HARMONICA ");
	                int mediaHarmonica = (3 / (1 / n1) + (1 /n2) + (1 / n3));
	            	System.out.println("A media aritmetica é de: "+mediaHarmonica);
	            case 2:
	                System.out.println("MÉDIA PONDERADA");
	            	System.out.println("Informe a P1");
	            	int p1 = entrada.nextInt();
	            	System.out.println("Informe a P2");
	            	int p2 = entrada.nextInt();
	            	System.out.println("Informe a P3");
	            	int p3 = entrada.nextInt();
	                int mediaPonderada1 = ((n1 * p1)+(n2 * p2) + (n3 * p3) / (p1 + p2 + p3));
	                System.out.println("A media ponderada é de: "+mediaPonderada1);

	            case 1:

				int medAritmetica = (n1 + n2 + n3) /3;
	            	System.out.println("A media aritmetica é de: "+medAritmetica);
	            	
	            default:
	                System.out.println("Esolheu uma opção inválida");
	            
	        }

	    }
}
