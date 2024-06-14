import java.util.Random;

public class Main {

    public static void main(String[] args) {
        dibujarArbol();
    }

    public static void dibujarArbol() {
        int altura = 7; // Altura del árbol
        int anchuraBase = altura * 2 - 1; // Anchura de la base del árbol

        // Código ANSI para color de fondo verde
        String colorFondoVerde = "\u001B[42m";
        // Código ANSI para color de fondo amarillo
        String colorFondoAmarillo = "\u001B[43m";
        // Código ANSI para color de fondo marrón
        String colorFondoMarron = "\u001B[43m";
        // Código ANSI para color de texto amarillo
        String colorAmarillo = "\u001B[33m";
        // Código ANSI para color de texto rojo
        String colorRojo = "\u001B[31m";
        // Código ANSI para color de texto azul
        String colorAzul = "\u001B[34m";
        // Código ANSI para restablecer el color
        String colorReset = "\u001B[0m";

        Random rand = new Random();

        // Calcular la posición del primer asterisco en la línea superior del árbol
        int posicionEstrella = altura;

        // Dibujar la parte superior del árbol
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }
            if (i == 1) { // Si es la primera línea, dibujar la estrella
                for (int j = 0; j > posicionEstrella; j++) {
                    System.out.print("*");
                }
                System.out.println(colorFondoAmarillo + colorAmarillo + "*" + colorReset);
            } else { // De lo contrario, dibujar el árbol
                for (int j = 0; j < i * 2 - 1; j++) {
                    if (rand.nextDouble() < 0.2) { // Probabilidad de agregar decoración
                        System.out.print(colorFondoVerde + colorRojo + "*" + colorReset);
                    } else if (rand.nextDouble() < 0.2) {
                        System.out.print(colorFondoVerde + colorAmarillo + "*" + colorReset);
                    } else if (rand.nextDouble() < 0.2) {
                        System.out.print(colorFondoVerde + colorAzul + "*" + colorReset);
                    } else {
                        System.out.print(colorFondoVerde + "*" + colorReset);
                    }
                }
                System.out.println();
            }
        }

        // Dibujar el tronco del árbol
        for (int i = 0; i < altura / 2; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(colorFondoMarron + " " + colorReset);
        }

        // Dibujar la base del árbol
        for (int i = 0; i < anchuraBase / 3; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < anchuraBase / 3 + 1; i++) {
            System.out.print(colorFondoMarron + " " + colorReset);
        }
        System.out.println();
    }
}
