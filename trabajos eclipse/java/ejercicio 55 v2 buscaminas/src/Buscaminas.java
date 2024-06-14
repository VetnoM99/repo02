import javax.swing.*;

public class Buscaminas extends JFrame {

    public Buscaminas(int dificultad) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 800);

        PanelJuego panelJuego = new PanelJuego(dificultad);
        add(panelJuego);

        setVisible(true);
    }

    public static void main(String[] args) {
        Object[] dificultades = {"Fácil", "Medio", "Difícil"};
        String dificultadSeleccionada = (String) JOptionPane.showInputDialog(null, "Elige la dificultad", "Buscaminas", JOptionPane.QUESTION_MESSAGE, null, dificultades, dificultades[0]);
        int dificultad = 10; // Fácil por defecto
        if (dificultadSeleccionada != null) {
            if (dificultadSeleccionada.equals("Medio")) {
                dificultad = 15;
            } else if (dificultadSeleccionada.equals("Difícil")) {
                dificultad = 20;
            }
            new Buscaminas(dificultad);
        } else {
            System.exit(0);
        }
    }
}