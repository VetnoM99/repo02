import javax.swing.*;
import java.awt.*;

public class Centro extends JFrame {
    public Centro() {
        // Configurar el marco
        setTitle("FlowLayout Center Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,500);
        
        // Crear panel con FlowLayout y orientación centrada
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Alineación al centro con espacio entre componentes
        
        // Crear y agregar botones al panel
        for (int i = 1; i <= 6; i++) {
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
            new Centro();
        });
    }
}
