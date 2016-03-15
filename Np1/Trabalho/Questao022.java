// Indique o resultado da variável X dos trechos de algoritmos abaixo.
//Considere os valores A = primeiro digito da sua matricula B = o último dígito da sua matrícula
//C = soma de A+B e D = A+B+C
// A = 1, B = 4, C = A+B, D= A+B+C;

package Trabalho;

public class Questao022 {
	public static void main (String...arg){
		Integer a = 1;
		Integer b = 4;
		Integer c = a + b;
		Integer d = a + b + c;
		Integer x;
		
		if (!(d > 5)){
			x = ((a+b)*d);
			System.out.println(x);
		} else {
			x = ((a - b)/c);
			System.out.println(x);
		}
		
		if (( a > 2) && (b < 7)){
			x = ((a + 2) * (b-2));
			System.out.println(x);
		} else {
			x = ((a + b)/2 * (c+d));
			System.out.println(x);
		}
//		
//		if ((a = 2 ) && (b < 7)){
//			x = (a + 2 ) * (b - 2);
//			System.out.println(x);
//		} else {
//			x = (( a + b )/ d * (c+d));
//		}
//		
//		if (!((a > 2) || ( b < 7)){
//			x = a + b -2;
//			System.out.println(x);
//		} else {
//			x = a - b;
//			System.out.println(x);
//		}
	}
}
