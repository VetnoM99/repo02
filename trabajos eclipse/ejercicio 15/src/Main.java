
public class Main {

	public static void main(String[] args) {
		int num =0, contador=0;

		num = (int) random2();
		System.out.println("temperatura = "+ num);
		if (num <10) {
			System.out.println("la temperatura "+num+" esta dentro de la categoria de climas frios");
			System.out.println((num <= 10)? "es de tipo clima polar ": " es de tipo de alta montaña ");
		}if (num>=10&&num<20) {
			System.out.println("la temperatura "+num+" esta dentro de la categoria de climas templados");
			System.out.println((num>=10&&num<13.5)?"es de tipo Oceanico":(num>=13.5&&num<=16.5)?" es de tipo Mediteraneo":(num>=16.5&&num<=20)?"Es de tipo Continental":"fuera del rango");
		}if (num>=20) {
			System.out.println("la temperatura "+num+" esta dentro de la categoria de climas calidos");
			System.out.println((num>=20&&num<23.5)?"es de tipo Ecuatorial":(num>=23.5&&num<=26.5)?" es de tipo Tropical":(num>=26.5)?"Es de tipo Desertico":"fuera del rango");
		}
		
		
	}
//public static double random(double valor) {
//	return  valor = Math.floor(Math.random()*20)*2;
//}

public static double random2() {
	System.out.println(Math.random()*20);
	return Math.random()*25;
}

}

//System.out.println("ifs unidireccional");
//while(contador <5) {
//	num = random(num);
//	contador++;
//	if (num ==0) {
//		System.out.println("rojo");
//	}
//	if (num == 1) {
//		System.out.println("negro");
//	}
//}
//System.out.println("bidireccional");
//while(contador<10) {
//	num = random (num);
//	contador++;
//	if(num == 0) {
//		System.out.println("rojo");
//	}else {
//		System.out.println("negro");
//	}
//}
//
//System.out.println("if ternario");
//
//while(contador <15) {
//	num= random(num);
//	contador++;
//	System.out.println((num==0)? "rojo" : "negro");
//	
//}