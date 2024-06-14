import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	 public static void main(String[] args) {
	        // Arreglo de opciones para el desplegable
	        Object[] opciones = {"Lobo", "León", "Tigre"};

	        // Mostrar cuadro de diálogo de entrada con desplegable
	        String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione un animal:", "Selección de Animal", JOptionPane.PLAIN_MESSAGE, null, opciones, "Lobo");

	        // Verificar si el usuario canceló la selección
	        if (seleccion == null) {
	            System.out.println("Selección cancelada.");
	            return;
	        }

	        // Mostrar imagen según la selección
	        switch (seleccion) {
	            case "Lobo":
	                mostrarImagen("lobo.jpg");
	                break;
	            case "León":
	                mostrarImagen("leon.jpg");
	                break;
	            case "Tigre":
	                mostrarImagen("tigre.jpg");
	                break;
	            default:
	                System.out.println("Animal no reconocido.");
	        }
	    }

	    // Método para mostrar una imagen
	    private static void mostrarImagen(String nombreImagen) {
	        // Crear un objeto ImageIcon para la imagen
	        ImageIcon icono = new ImageIcon(nombreImagen);

	        // Mostrar un cuadro de diálogo con la imagen
	        JOptionPane.showMessageDialog(null, icono, "Imagen del Animal", JOptionPane.PLAIN_MESSAGE);
	    }
	}


