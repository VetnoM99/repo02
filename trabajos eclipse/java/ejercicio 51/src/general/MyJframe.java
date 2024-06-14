package general;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyJframe extends JFrame {
	private static final long serialVersionUID = 1L;

	MyJframe(int w, int h, boolean visible, boolean visible1) {
		setSize(w, h);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Fundacion Esplai");
		getContentPane().setBackground(Color.gray);
		setIconImage(Toolkit.getDefaultToolkit().getImage("./metal.png"));
	}
}
