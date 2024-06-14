import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    private JPanel panel;
    private final int SIZE = 9;

    public Main() {
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();

        // Agrega los botones al panel
        for (int i = 0; i < SIZE; i++) {
            JButton button = new JButton("Botón " + (i + 1));
            cons.gridx = i % 3;
            cons.gridy = i / 3;
            panel.add(button, cons);
            button.add(Box.createRigidArea(new Dimension(100, 100)));
        }

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500,500);
    }

    public static void main(String[] args) {
        new Main();
    }
}