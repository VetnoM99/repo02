import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		  int altura = 12; // Altura del árbol

	        // Imprimir el árbol
	        imprimirArbol(altura);
	    }

	    public static void imprimirArbol(int altura) {
	        // Iterar sobre cada nivel del árbol
	        for (int nivel = 0; nivel < altura; nivel++) {
	            // Imprimir espacios en blanco para alinear el árbol
	            for (int espacio = altura - nivel; espacio > 1; espacio--) {
	                System.out.print(" ");
	            }
	            // Imprimir asteriscos
	            for (int i = 0; i < 2 * nivel + 1; i++) {
	                System.out.print("*");
	            }
	            // Nueva línea después de cada nivel
	            System.out.println();
	        }

	        // Imprimir el tronco del árbol
	        for (int i = 0; i < altura - 1; i++) {
	            System.out.print(" ");
	        }
	        System.out.println("*");
	    }
	
			
		

	}


