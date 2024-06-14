import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

	   public static void main(String[] args) {
	        // Mostrar cuadro de diálogo de confirmación
	        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar esta acción?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);

	        // Verificar la opción seleccionada por el usuario
	        switch (opcion) {
	            case JOptionPane.YES_OPTION:
	                JOptionPane.showMessageDialog(null, "El usuario seleccionó Aceptar.");
	                break;
	            case JOptionPane.NO_OPTION:
	                JOptionPane.showMessageDialog(null, "El usuario seleccionó Cancelar.");
	                break;
	            case JOptionPane.CANCEL_OPTION:
	                JOptionPane.showMessageDialog(null, "El usuario seleccionó Opción.");
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "El usuario cerró el cuadro de diálogo.");
	        }

	        Object[] opcionesPersonalizadas = {"KHE", "KEEEE", "No se", "Opción Personalizada"};

	        // Mostrar cuadro de diálogo de confirmación
	        int opcion2 = JOptionPane.showOptionDialog(null, "¿Desea realizar esta acción?",
	                "Confirmación", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
	                null, opcionesPersonalizadas, opcionesPersonalizadas[0]);
	        // Verificar la opción seleccionada por el usuario
	        switch (opcion2) {
	            case JOptionPane.YES_OPTION:
	                JOptionPane.showMessageDialog(null, "El usuario seleccionó Aceptar.");
	                break;
	            case JOptionPane.NO_OPTION:
	                JOptionPane.showMessageDialog(null, "El usuario seleccionó Cancelar.");
	                break;
	            case JOptionPane.CANCEL_OPTION:
	                JOptionPane.showMessageDialog(null, "El usuario seleccionó Opción.");
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "El usuario cerró el cuadro de diálogo.");
	        }
	    }
}
