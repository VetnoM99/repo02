import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PanelJuego extends JPanel {
    private JButton[][] botones;
    private int[][] minas;
    private boolean[][] revelado;
    private boolean[][] marcado;
    private int dificultad;
    private int minasAColocar;
    private ImageIcon iconoMina;
    private ImageIcon iconoBandera;
    private int botonesRevelados = 0;

    public PanelJuego(int dificultad) {
        this.dificultad = dificultad;
        setLayout(new GridLayout(dificultad, dificultad));
        botones = new JButton[dificultad][dificultad];
        minas = new int[dificultad][dificultad];
        revelado = new boolean[dificultad][dificultad];
        marcado = new boolean[dificultad][dificultad];
        iconoMina = new ImageIcon("./mina.png"); // Cambia esto a la ruta de tu imagen
        iconoBandera = new ImageIcon("bandera.png"); // Cambia esto a la ruta de tu imagen
        iniciarBotones();
        colocarMinas();
    }

    private void iniciarBotones() {
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                botones[i][j] = new JButton();
                botones[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (SwingUtilities.isRightMouseButton(e)) {
                            marcarBoton(e);
                        } else {
                            verificarBoton(e);
                        }
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

    private void verificarBoton(MouseEvent e) {
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                if (e.getSource() == botones[i][j] && !marcado[i][j]) {
                    if (minas[i][j] == -1) {
                        botones[i][j].setIcon(iconoMina);
                        gameOver();
                    } else {
                        revelarBoton(i, j);
                        verificarVictoria();
                    }
                }
            }
        }
    }


    private void marcarBoton(MouseEvent e) {
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                if (e.getSource() == botones[i][j] && !revelado[i][j]) {
                    if (!marcado[i][j]) {
                        botones[i][j].setIcon(iconoBandera);
                        marcado[i][j] = true;
                    } else {
                        botones[i][j].setIcon(null);
                        marcado[i][j] = false;
                    }
                }
            }
        }
    }

    private void revelarBoton(int x, int y) {
        if (revelado[x][y] || marcado[x][y] || minas[x][y] == -1) {
            return;
        }
        revelado[x][y] = true;
        botonesRevelados++;
        int minasCercanas = contarMinasCercanas(x, y);
        if (minasCercanas > 0) {
            botones[x][y].setText(String.valueOf(minasCercanas));
            botones[x][y].setForeground(getColorForNumber(minasCercanas));
        } else {
            botones[x][y].setText("");
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newX = x + i;
                    int newY = y + j;
                    if (newX >= 0 && newX < dificultad && newY >= 0 && newY < dificultad && !revelado[newX][newY]) {
                        revelarBoton(newX, newY);
                    }
                }
            }
        }
        botones[x][y].setEnabled(false);
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
                // Verificar si la celda adyacente está dentro de los límites del tablero
                if (x + i >= 0 && x + i < dificultad && y + j >= 0 && y + j < dificultad) {
                    if (minas[x + i][y + j] == -1) {
                        count++;
                    }
                }
            }
        }
        // Restar 1 si la celda actual contiene una mina, ya que fue contada innecesariamente en el bucle
        if (minas[x][y] == -1) {
            count--;
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
        revelado = new boolean[dificultad][dificultad];
        marcado = new boolean[dificultad][dificultad];
        botonesRevelados = 0;
        for (int i = 0; i < dificultad; i++) {
            for (int j = 0; j < dificultad; j++) {
                botones[i][j].setText("");
                botones[i][j].setIcon(null);
                botones[i][j].setEnabled(true);
                revelado[i][j] = false;
                marcado[i][j] = false;
            }
        }
        colocarMinas();
    }
}