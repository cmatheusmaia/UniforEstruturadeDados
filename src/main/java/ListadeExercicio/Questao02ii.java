package ListadeExercicio;

public class Questao02ii {
	
	public static void main (String...arg){
		
		Integer a = 10;
		Integer b = 15;
		Integer c = 3;
		
		Integer resultado = a + b / c;
		
		if (resultado >= 5){
			resultado  = resultado - 5;
			System.out.println(resultado);
		} else {
			if (resultado * 3 >= 15 ){
				resultado = resultado - 15;
				System.out.println(resultado);
			}
		}
	}
	
//public static void funcaodois (String...arg){
//		
//		Integer a = 10;
//		Integer b = 15;
//		Integer c = 3;
//		
//		Integer resultado = a + b / c;
//		
//		if (resultado >= 5){
//			resultado  = resultado - 5;
//			System.out.println(resultado);
//		} else {
//			if (resultado * 3 >= 15 ){
//				resultado = resultado - 15;
//				System.out.println(resultado);
//			}
//		}
//	}

}
