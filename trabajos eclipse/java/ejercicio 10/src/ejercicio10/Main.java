package ejercicio10;

public class Main {
    public static void main(String[] args) {
        int valorInicial = 0;
        int valorIncrementado = incrementar(valorInicial);
        
        System.out.println("Valor inicial: " + valorInicial);
        System.out.println("Valor incrementado: " + valorIncrementado);
        System.out.println("valor decrementado 2 veces "+ decrementar(valorInicial));
    }

    public static int incrementar(int valor) {
        valor++;
        return valor;
    }
    
    public static int decrementar (int valor) {
    	valor--;
    	valor--;
    	return valor;
    }
}