import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nombre;
		Scanner sc = new Scanner(System.in);
		 do {
	            // Mostrar cuadro de diálogo de entrada
	            nombre = JOptionPane.showInputDialog(null, "Por favor, ingrese su nombre:");

	            // Verificar si el usuario canceló la entrada
	            if (nombre == null) {
	                JOptionPane.showMessageDialog(null,"Operación cancelada. Por favor, intente de nuevo.");
	            } else {
	                // Verificar si la entrada contiene números o espacios en blanco
	                if (contieneNumeros(nombre) || contieneEspacios(nombre)) {
	                    JOptionPane.showMessageDialog(null,"La entrada no puede contener números ni espacios en blanco. Por favor, intente de nuevo.");
	                    nombre = null; // Reiniciar userInput para solicitar nuevamente la entrada
	                }
	            }
	        } while (nombre == null);	}
	private static boolean contieneNumeros(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar si la cadena contiene espacios en blanco
    private static boolean contieneEspacios(String input) {
        return input.contains(" ");
    }
}
