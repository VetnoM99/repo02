import java.util.MissingResourceException;
import java.util.Scanner;
import java.util.Locale;



public class Main {

	public static void main(String[] args) {
//try {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("numero int");
//		int num1 = sc.nextInt();
//		System.out.println("String");
//		String frace = sc.next();
//		System.out.println("double");
//		double doble = sc.nextDouble();
//		System.out.println("booleano");
//		boolean bandera = sc.nextBoolean();
//		System.out.println("valores introducidos\n"+"Integer: "+num1+"\n"+"String: "+frace+"\n"+"Double: "+doble+"\n"+"booleano: "+bandera);
//		}catch (Exception e) {
//			System.out.println("valor invalido "+e.getMessage());
//		}
////int[] array = new int[Integer.MAX_VALUE];
////try {
////    int result = 10 / 0; // Esto generará una ArithmeticException
////} catch (ArithmeticException e) {
////    // Manejar la excepción
////    e.printStackTrace();
////}

try {
	System.out.println("argumento1");
	String text = "me la pela tu null";
	throw new NullPointerException(text);
} catch (Exception e) {
	System.out.println(e);
}

Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

System.out.print("Introduce un número real: ");
double numeroReal = scanner.nextDouble();

System.out.println("Número introducido: " + numeroReal);
}

	}
	
		
		
