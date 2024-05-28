import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Especificar el ancho y el largo de la bandera
        int ancho = 30;
        int largo = 9;
        String texto = "Hola Mundo";
        String colorFondo = "azul";
        String colorTexto = "limpio";

        // Generar un número aleatorio entre 0 y 5
        Random rand = new Random();
        int numero = rand.nextInt(6);

        // Imprimir la bandera correspondiente al número aleatorio generado
        switch (numero) {
            case 0:
                imprimirBanderaFrancia(ancho, largo);
                break;
            case 1:
                imprimirBanderaItalia(ancho, largo);
                break;
            case 2:
                imprimirBanderaAlemania(ancho, largo);
                break;
            case 3:
                imprimirBanderaEspaña(ancho, largo);
                break;
            case 4:
                imprimirBanderaCataluña(ancho, largo);
                break;
            case 5:
                imprimirBanderaArgentina(ancho, largo);
                break;
            default:
                imprimirBanderaDefault(ancho, largo);
                break;
        }
        
        imprimirTextoColoreado(texto,colorFondo,colorTexto);

    }

    public static void imprimirBanderaFrancia(int ancho, int largo) {
        // Imprimir el nombre de la bandera en negrita y subrayado
        System.out.println("\u001B[1m\u001B[4mBandera de Francia:\u001B[0m");
        // Imprimir la bandera de Francia
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (j < ancho / 3) {
                    System.out.print("\u001B[44m "); // Azul
                } else if (j < (2 * ancho / 3)) {
                    System.out.print("\u001B[47m "); // Blanco
                } else {
                    System.out.print("\u001B[41m "); // Rojo
                }
            }
            System.out.println();
        }
        System.out.print("\u001B[0m"); // Reset color
    }

    public static void imprimirBanderaItalia(int ancho, int largo) {
        // Imprimir el nombre de la bandera en negrita y subrayado
        System.out.println("\u001B[1m\u001B[4mBandera de Italia:\u001B[0m");
        // Imprimir la bandera de Italia
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (j < ancho / 3) {
                    System.out.print("\u001B[42m "); // Verde
                } else if (j < (2 * ancho / 3)) {
                    System.out.print("\u001B[47m "); // Blanco
                } else {
                    System.out.print("\u001B[41m "); // Rojo
                }
            }
            System.out.println();
        }
        System.out.print("\u001B[0m"); // Reset color
    }

    public static void imprimirBanderaAlemania(int ancho, int largo) {
        // Imprimir el nombre de la bandera en negrita y subrayado
        System.out.println("\u001B[1m\u001B[4mBandera de Alemania:\u001B[0m");
        // Imprimir la bandera de Alemania
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[40m "); // Negro
            }
            System.out.println();
        }
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[43m "); // Amarillo
            }
            System.out.println();
        }
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[41m "); // Rojo
            }
            System.out.println();
        }
        System.out.print("\u001B[0m"); // Reset color
    }

    public static void imprimirBanderaEspaña(int ancho, int largo) {
        // Imprimir el nombre de la bandera en negrita y subrayado
        System.out.println("\u001B[1m\u001B[4mBandera de España:\u001B[0m");
        // Imprimir la bandera de España
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[41m "); // Rojo
            }
            System.out.println();
        }
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[43m "); // Amarillo
            }
            System.out.println();
        }
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[41m "); // Rojo
            }
            System.out.println();
        }
        System.out.print("\u001B[0m"); // Reset color
    }

    public static void imprimirBanderaCataluña(int ancho, int largo) {
        // Imprimir el nombre de la bandera en negrita y subrayado
        System.out.println("\u001B[1m\u001B[4mBandera de Cataluña:\u001B[0m");
        // Imprimir la bandera de Cataluña
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i % 2 == 0) {
                    System.out.print("\u001B[41m "); // Rojo
                } else {
                    System.out.print("\u001B[43m "); // Amarillo
                }
            }
            System.out.println();
        }
        System.out.print("\u001B[0m"); // Reset color
    }

    public static void imprimirBanderaArgentina(int ancho, int largo) {
        // Imprimir el nombre de la bandera en negrita y subrayado
        System.out.println("\u001B[1m\u001B[4mBandera de Argentina:\u001B[0m");
        // Imprimir la bandera de Argentina
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[46m "); // Celeste
            }
            System.out.println();
        }
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                if (j == ancho / 2 || j == (ancho / 2) - 1 || j == (ancho / 2) + 1) {
                    System.out.print("\u001B[43m "); // Sol simplificado
                } else {
                    System.out.print("\u001B[47m "); // Blanco
                }
            }
            System.out.println();
        }
        for (int i = 0; i < largo / 3; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("\u001B[46m "); // Celeste
            }
            System.out.println();
        }
        System.out.print("\u001B[0m"); // Reset color
    }
    public static void imprimirBanderaDefault(int ancho, int largo) {
        // Si el número aleatorio no corresponde a ninguna bandera conocida, imprimir un mensaje predeterminado
        System.out.println("\u001B[1m\u001B[4mBandera no reconocida:\u001B[0m");
    }



        // Función para imprimir el texto con los colores especificados
        public static void imprimirTextoColoreado(String texto, String colorFondo, String colorTexto) {
            // Obtener los códigos de color ANSI para el fondo y el texto
            String codigoColorFondo = obtenerCodigoColorFondo(colorFondo);
            String codigoColorTexto = obtenerCodigoColorTexto(colorTexto);
            if (colorFondo.equalsIgnoreCase("limpio") || colorTexto.equalsIgnoreCase("limpio")) {
                System.out.println("\u001B[0m" + texto + "\u001B[0m");
            }

            // Imprimir el texto con los colores especificados
            System.out.println(codigoColorFondo + codigoColorTexto + texto + "\u001B[0m");
        }

        // Método para obtener el código de color de fondo ANSI
        public static String obtenerCodigoColorFondo(String color) {
            switch (color.toLowerCase()) {
                case "negro":
                    return "\u001B[40m";
                case "rojo":
                    return "\u001B[41m";
                case "verde":
                    return "\u001B[42m";
                case "amarillo":
                    return "\u001B[43m";
                case "azul":
                    return "\u001B[44m";
                case "magenta":
                    return "\u001B[45m";
                case "cian":
                    return "\u001B[46m";
                case "blanco":
                    return "\u001B[47m";
                default:
                    return "\u001B[0m"; // Reset color
            }
        }

        // Método para obtener el código de color de texto ANSI
        public static String obtenerCodigoColorTexto(String color) {
            switch (color.toLowerCase()) {
                case "negro":
                    return "\u001B[30m";
                case "rojo":
                    return "\u001B[31m";
                case "verde":
                    return "\u001B[32m";
                case "amarillo":
                    return "\u001B[33m";
                case "azul":
                    return "\u001B[34m";
                case "magenta":
                    return "\u001B[35m";
                case "cian":
                    return "\u001B[36m";
                case "blanco":
                    return "\u001B[37m";
                default:
                    return "\u001B[0m"; // Reset color
            }
        }
    }




