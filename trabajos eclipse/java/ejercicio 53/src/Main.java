import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear el marco
            JFrame frame = new JFrame("FlowLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Crear panel con FlowLayout y orientación horizontal
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20)); // Alineación a la izquierda con espacio entre componentes
            
            // Crear y agregar botones al panel
            for (int i = 1; i <= 10; i++) {
                JButton button = new JButton("Botón " + i);
                panel.add(button);
            }
            
            // Agregar el panel al marco
            frame.add(panel);
            
//             Establecer tamaño preferido de la ventana
            frame.setPreferredSize(new Dimension(600, 300));
            
            // Mostrar el marco
            frame.pack();
            frame.setVisible(true);
            Derecha d = new Derecha();
            Centro c = new Centro();
        });
    }
}
