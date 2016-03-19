package ListaRepeticao;

public class Questao01 {

	public static void main(String...arg){
		
		Double polegadas = 2.54;
		for(int i =1; i <=20; i++){
			double conversaoPolegadas = i * polegadas;
			System.out.println(i+"cm - convertido para "+conversaoPolegadas+" polegadas");
		}
	}
}
