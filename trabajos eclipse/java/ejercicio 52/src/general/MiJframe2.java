package general;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiJframe2 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiJframe2() {
		setVisible(true);
        // Configurar el marco
        setTitle("BorderLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);

        // Crear botones
        JButton northButton = new JButton("Norte");
        JButton southButton = new JButton("Sur");

        // Configurar layout del marco
        setLayout(new BorderLayout());

        // Agregar los botones al marco en sus respectivas posiciones
        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        northButton.setBackground(Color.RED);
        southButton.setBackground(Color.RED);

        // Crear botones del centro
        JButton centerButton1 = new JButton("Centro 1");
        JButton centerButton2 = new JButton("Centro 2");
        JButton centerButton3 = new JButton("Centro 3");
        centerButton1.setBackground(Color.BLUE);
        centerButton2.setBackground(Color.YELLOW);
        centerButton3.setBackground(Color.BLUE);

        // Agregar los botones al marco en la región del centro
        add(centerButton1, BorderLayout.WEST);
        add(centerButton2, BorderLayout.CENTER);
        add(centerButton3, BorderLayout.EAST);
        centerButton1.add(Box.createRigidArea(new Dimension(200, 0))); // Espacio horizontal de 10 píxeles
        centerButton2.add(Box.createRigidArea(new Dimension(200, 0))); // Espacio horizontal de 10 píxeles
        centerButton3.add(Box.createRigidArea(new Dimension(220, 0))); // Espacio horizontal de 10 píxeles


        // Agregar acciones a los botones
        northButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has presionado el botón en el norte.");
            }
        });

        centerButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has presionado el botón en el Este.");
            }
        });

        centerButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has presionado el botón en el centro .");
            }
        });

        centerButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has presionado el botón en el Oeste");
            }
        });

        southButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has presionado el botón en el sur.");
            }
        });
    }


}
