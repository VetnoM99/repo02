import javax.swing.JOptionPane;

public class Main {

	 public static void main(String[] args) {
		 String input;
		 int numero;
	        // Solicitar al usuario que ingrese un número del 1 al 4
		 do {
	        input = JOptionPane.showInputDialog(null, "Manu de Operaciones\n" +"1. informacion\n"+"2. Error\n"+"3. Warning\n"+"4. pregunta\n"+"5. salir", "input", JOptionPane.QUESTION_MESSAGE);

	        // Verificar si el usuario canceló la entrada
	        if (input == null) {
	            System.out.println("Operación cancelada.");
	            return;
	        }

	        // Convertir la entrada del usuario a un número entero
	         numero = Integer.parseInt(input);

	        // Mostrar el mensaje correspondiente según el número ingresado
	        switch (numero) {
	            case 1:
	                JOptionPane.showMessageDialog(null, "Este es un mensaje de información.", "Información", JOptionPane.INFORMATION_MESSAGE);
	                break;
	            case 2:
	                JOptionPane.showMessageDialog(null, "Este es un mensaje de advertencia.", "Advertencia", JOptionPane.WARNING_MESSAGE);
	                break;
	            case 3:
	                JOptionPane.showMessageDialog(null, "Este es un mensaje de error.", "Error", JOptionPane.ERROR_MESSAGE);
	                break;
	            case 4:
	                JOptionPane.showMessageDialog(null, "Este es un mensaje de pregunta.", "Pregunta", JOptionPane.QUESTION_MESSAGE);
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Gracias por su atencion adios ;3", "Gracias", JOptionPane.INFORMATION_MESSAGE);
	        }
		 }while (numero != 5);
	    }
	 }
