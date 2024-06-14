
import javax.swing.*;
import java.awt.*;

public class Derecha extends JFrame {
    public Derecha() {
        // Configurar el marco
        setTitle("FlowLayout Right Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(600,200);
        
        // Crear panel con FlowLayout y orientación hacia la derecha
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10)); // Alineación a la derecha con espacio entre componentes
        
        // Crear y agregar botones al panel
     
        for (int i = 1; i <= 10; i++) {
     
            JButton button = new JButton("Botón " + i);
           
            panel.add(button);
        }
        
        // Agregar el panel al marco
        add(panel);
        
        // Establecer tamaño preferido de la ventana
        setPreferredSize(new Dimension(600, 200));
        
        // Mostrar el marco
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Derecha();
        });
    }
}
