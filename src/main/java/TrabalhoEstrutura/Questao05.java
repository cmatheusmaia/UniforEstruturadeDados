/*
 * solicitar como entrada um texto e exibir como resultado:
 * qtd de letras
 * qtd de caracteres
 * qtd de vogais
 * qtd de consoantes
 */
package TrabalhoEstrutura;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questao05 {
	public static void main(String[] args) {

		String vogais = "aeiou";
        String consoantes = "bcdfghjklmnpqrstvxwyz";
        int totalVogais = 0, totalConsoantes = 0;

        
		String nome = "Meu nome e Matheus Maia";
		System.out.println(nome+". Tamanho de caractere: "+nome.length());
		String nome2 = nome.replaceAll(" ", "");
		System.out.println("Quantidade de letras de: "+nome2 + ", tamanho: "+nome2.length());

        
		int NumeroLetras = nome2.length();
        for(int i = 0; i < NumeroLetras; i++){
            if(vogais.indexOf(nome2) >= 0){
            	System.out.println(totalVogais);
                 totalVogais++;
            } else if(consoantes.indexOf(nome2) >= 0){
            	totalConsoantes++;
            }
		}
	}
}

