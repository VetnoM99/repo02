package general;
import java.util.Random;

public class Cliente extends persona{
	
	String categoria;
	String codigo;

	 public String generarCodigoAleatorio() {
	        Random random = new Random();
	        
	        // Generar un número entero aleatorio entre 0 y 999999
	        int numeroAleatorio = random.nextInt(1000000);
	        
	        // Formatear el número para que siempre tenga 6 dígitos, rellenando con ceros a la izquierda si es necesario
	        return String.format("%06d", numeroAleatorio);
	        
	    }
	 public  String generarDNIAleatorio() {
		    Random random = new Random();
		    
		    // Generar un número aleatorio de 8 dígitos
		    int numeroDNI = random.nextInt(90000000) + 10000000; // Para asegurar que sea un número de 8 dígitos
		    
		    // Calcular la letra correspondiente al número de DNI
		    char letraDNI = calcularLetraDNI(numeroDNI);
		    
		    // Formar el DNI completo
		    return String.format("%08d", numeroDNI) + letraDNI;
		}

		public  char calcularLetraDNI(int numeroDNI) {
		    // Array de letras posibles
		    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		    
		    // Calcular el índice de la letra
		    int indice = numeroDNI % 23;
		    
		    // Devolver la letra correspondiente
		    return letras[indice];
		}
	
}
