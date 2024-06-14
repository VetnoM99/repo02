import java.util.Random;

public class Main {

    // Colores del arcoíris
    private static final String[] NOMBRES_COLORES = {
        "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Índigo", "Violeta"
    };

    // Códigos ANSI para colores de texto
    private static final String[] COLORES_TEXTO = {
        "\u001B[31m", // Rojo
        "\u001B[33m", // Naranja
        "\u001B[93m", // Amarillo
        "\u001B[32m", // Verde
        "\u001B[34m", // Azul
        "\u001B[94m", // Índigo
        "\u001B[35m"  // Violeta
    };

    // Longitud de la barra de color
    private static final int LONGITUD_BARRA = 20;

    // Longitud fija del espacio después del nombre del color
    private static final int ESPACIO_NOMBRE = 10;

    public static void main(String[] args) {
        // Generar y mostrar el arcoíris con colores aleatorios
        generarArcoirisAleatorio();
    }

    // Método para generar el arcoíris aleatorio
    public static void generarArcoirisAleatorio() {
        Random rand = new Random();

        // Calcular la longitud máxima del nombre del color para alinear las barras
        int longitudMaximaNombre = calcularLongitudMaxima(NOMBRES_COLORES) + ESPACIO_NOMBRE;

        // Generar un índice aleatorio para el orden de los colores
        int[] ordenColores = generarOrdenAleatorio(NOMBRES_COLORES.length);

        // Mostrar cada color del arcoíris en el orden aleatorio
        for (int i = 0; i < NOMBRES_COLORES.length; i++) {
            int indice = ordenColores[i];
            String nombreColor = NOMBRES_COLORES[indice];
            String colorTexto = COLORES_TEXTO[indice];

            // Mostrar el nombre del color con espacio fijo
            System.out.print(colorTexto + nombreColor + ":");
            for (int j = 0; j < longitudMaximaNombre - nombreColor.length(); j++) {
                System.out.print(" ");
            }

            // Mostrar la barra de color
            for (int j = 0; j < LONGITUD_BARRA; j++) {
                System.out.print("█");
            }

            System.out.println("\u001B[0m"); // Resetear colores ANSI
        }
    }

    // Método para calcular la longitud máxima de una lista de cadenas
    private static int calcularLongitudMaxima(String[] lista) {
        int maximo = 0;
        for (String cadena : lista) {
            if (cadena.length() > maximo) {
                maximo = cadena.length();
            }
        }
        return maximo;
    }

    // Método para generar un orden aleatorio de índices
    private static int[] generarOrdenAleatorio(int longitud) {
        Random rand = new Random();
        int[] orden = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            orden[i] = i;
        }
        for (int i = longitud - 1; i > 0; i--) {
            int indice = rand.nextInt(i + 1);
            int temp = orden[indice];
            orden[indice] = orden[i];
            orden[i] = temp;
        }
        return orden;
    }
}
