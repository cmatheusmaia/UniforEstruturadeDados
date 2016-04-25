// 1 -verificar se uma palavra é palíndroma

package TrabalhoEstrutura;

import java.util.Scanner;

public class Questao01 {

	    public static void main(String...args) {
	    	ChamarMetodos.AvisoAppQ1();
	    	
	       String palavra;
	       String checar="";
	       @SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
	       System.out.println("Informe a palavra");
	       palavra = entrada.next();
	        for(int x=palavra.length()-1;x>=0;x--){
	        	checar+= palavra.charAt(x);
	        }
	        if(checar.equals(palavra)){
	            System.out.println("A palavra "+palavra.toUpperCase()+ " é um PALINDROMO");
	        }else{
	            System.out.println("A palavra "+palavra.toUpperCase()+ " NÃO é um PALINDROMO");;
	        }
	    }
}
