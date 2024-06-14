package general;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Buscaminas extends JFrame {
    private JButton[][] botones;
    private int[][] minas;
    private int dificultad;
    private int minasAColocar;
    private ImageIcon iconoMina;
    private int victorias = 0;
    private int derrotas = 0;
    private int botonesRevelados = 0;

    public Buscaminas(int dificultad) {
        this.dificultad = dificultad;
        this.setLayout(new GridLayout(dificultad, dificultad));
        botones = new JButton[dificultad][dificultad];
        minas = new int[dificultad][dificultad];
        iconoMina = new ImageIcon("mina.png"); // Cambia esto a la ruta de tu imagen
        iniciarBotones();
        colocarMinas();
    }

    private void iniciarBotones() {
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                botones[i][j] = new JButton();
                botones[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        verificarBoton(e);
                    }
                });
                this.add(botones[i][j]);
            }
        }
    }

    private void colocarMinas() {
        Random rand = new Random();
        switch (dificultad) {
            case 10:
                minasAColocar = 10; // Fácil
                break;
            case 15:
                minasAColocar = 30; // Medio
                break;
            case 20:
                minasAColocar = 60; // Difícil
                break;
        }
        while (minasAColocar > 0) {
            int x = rand.nextInt(dificultad);
            int y = rand.nextInt(dificultad);
            if (minas[x][y] != -1) {
                minas[x][y] = -1;
                minasAColocar--;
            }
        }
    }

    private void verificarBoton(ActionEvent e) {
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                if (e.getSource() == botones[i][j]) {
                    if (minas[i][j] == -1) {
                        botones[i][j].setIcon(iconoMina);
                        gameOver();
                    } else {
                        mostrarNumeros(i, j);
                        verificarVictoria();
                    }
                }
            }
        }
    }

    private void mostrarNumeros(int x, int y) {
        int minasCercanas = contarMinasCercanas(x, y);
        botones[x][y].setText(String.valueOf(minasCercanas));
        botones[x][y].setEnabled(false);
        botonesRevelados++;
        actualizarAparienciaNumeros(x, y); // Llamada a la función para actualizar la apariencia de los números
    }

    private void actualizarAparienciaNumeros(int x, int y) {
        int minasCercanas = contarMinasCercanas(x, y);
        if (minasCercanas > 0) {
            botones[x][y].setForeground(getColorForNumber(minasCercanas));
        }
    }

    private Color getColorForNumber(int num) {
        switch (num) {
            case 1: return Color.blue;
            case 2: return Color.green;
            case 3: return Color.red;
            case 4: return Color.magenta;
            case 5: return Color.orange;
            case 6: return Color.cyan;
            case 7: return Color.black;
            case 8: return Color.gray;
            default: return Color.white;
        }
    }

    private int contarMinasCercanas(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (x + i >= 0 && x + i < dificultad && y + j >= 0 && y + j < dificultad) {
                    if (minas[x + i][y + j] == -1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void verificarVictoria() {
        if (botonesRevelados == dificultad * dificultad - minasAColocar) {
            int option = JOptionPane.showConfirmDialog(this, "¡Felicidades! Has ganado. ¿Quieres jugar de nuevo?", "Victoria", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                reiniciarJuego();
            } else {
                System.exit(0);
            }
        }
    }

    private void gameOver() {
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                if (minas[i][j] == -1) {
                    botones[i][j].setIcon(iconoMina);
                }
                botones[i][j].setEnabled(false);
            }
        }
        int option = JOptionPane.showConfirmDialog(this, "¡Game Over! ¿Quieres jugar de nuevo?", "Game Over", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            reiniciarJuego();
        } else {
            System.exit(0); // O cualquier otra acción que desees tomar al salir del juego
        }
    }

    private void reiniciarJuego() {
        minasAColocar = 0;
        minas = new int[dificultad][dificultad];
        botonesRevelados = 0;
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                botones[i][j].setText("");
                botones[i][j].setIcon(null);
                botones[i][j].setEnabled(true);
            }
        }
        colocarMinas();
    }

    public static void main(String[] args) {
        Object[] dificultades = { "Fácil", "Medio", "Difícil" };
        String dificultadSeleccionada = (String) JOptionPane.showInputDialog(null, "Elige la dificultad", "Buscaminas", JOptionPane.QUESTION_MESSAGE, null, dificultades, dificultades[0]);
        int dificultad = 10; // Fácil por defecto
        if (dificultadSeleccionada.equals("Medio")) {
            dificultad = 15;
        } else if (dificultadSeleccionada.equals("Difícil")) {
            dificultad = 20;
        }
        Buscaminas buscaminas = new Buscaminas(dificultad);
        buscaminas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buscaminas.setSize(900, 800);
        buscaminas.setVisible(true);
    }
}
