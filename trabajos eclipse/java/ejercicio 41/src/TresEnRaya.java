import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TresEnRaya {
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static Set<Integer> movimientosRealizados = new HashSet<>();

    public static void main(String[] args) {
        inicializarTablero();
        mostrarTablero();
        while (true) {
            if (jugadorActual == 'X') {
                pedirMovimientoJugador();
            } else {
                pedirMovimientoOrdenador();
            }
            mostrarTablero();
            if (hayGanador()) {
                System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                break;
            }
            if (esEmpate()) {
                System.out.println("¡Es un empate!");
                break;
            }
            cambiarJugador();
        }
    }

    private static void inicializarTablero() {
        char contador = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = contador++;
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("Tablero actual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             
                char c = tablero[i][j];
                if (c == 'X') {
                    System.out.print("\u001B[31m" + c + "\u001B[0m ");
                } else if (c == 'O') {
                    System.out.print("\u001B[34m" + c + "\u001B[0m ");
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
   
        }
        
          
        

    private static void pedirMovimientoJugador() {
        int movimiento;
        while (true) {
            System.out.println("Jugador " + jugadorActual + ", introduce tu movimiento (1-9): ");
            movimiento = scanner.nextInt();
            if (movimiento >= 1 && movimiento <= 9 && esMovimientoValido(movimiento)) {
                realizarMovimiento(movimiento);
                break;
            } else {
                System.out.println("Este movimiento no es válido. Inténtalo de nuevo.");
            }
        }
    }

    private static void pedirMovimientoOrdenador() {
        int movimiento;
        while (true) {
            movimiento = random.nextInt(9) + 1;
            if (esMovimientoValido(movimiento)) {
                System.out.println("El ordenador ha elegido la posición: " + movimiento);
                realizarMovimiento(movimiento);
                break;
            }
        }
    }

    private static boolean esMovimientoValido(int movimiento) {
        int fila = (movimiento - 1) / 3;
        int columna = (movimiento - 1) % 3;
        return tablero[fila][columna] != 'X' && tablero[fila][columna] != 'O' && !movimientosRealizados.contains(movimiento);
    }

    private static void realizarMovimiento(int movimiento) {
        int fila = (movimiento - 1) / 3;
        int columna = (movimiento - 1) % 3;
        tablero[fila][columna] = jugadorActual;
        movimientosRealizados.add(movimiento);
    }

    private static boolean hayGanador() {
        // Comprobar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true;
            }
        }
        // Comprobar diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }
        return false;
    }

    private static boolean esEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] != 'X' && tablero[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }
}
