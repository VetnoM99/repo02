
public class Main {

	public static void main(String[] args) {
		
		int num = 25;
		
		System.out.println("suma combinada 25 + 5 = " + SumaCombinada(num));
		System.out.println("resta combinada 25 + 15 = " + RestaCombinada(num));
		System.out.println("Multiplicacion combinada 25 * 2 = " + Multiplicacion(num));
		System.out.println("Dividir combinada 25 / 2 = " + Dividir(num));
		System.out.println("Resto combinada 25 % 3 = " + Resto(num));

	}
public static int SumaCombinada(int valor) {
	valor += 5;
	return valor;
}

public static int RestaCombinada (int valor) {
	valor -=15;
	return valor;
}

public static int Multiplicacion (int valor) {
	valor *= 2;
	return valor;
}

public static int Dividir (int valor) {
	valor /= 2;
	return valor;
}

public static int Resto (int valor) {
	valor %= 3;
	return valor;
}
}
