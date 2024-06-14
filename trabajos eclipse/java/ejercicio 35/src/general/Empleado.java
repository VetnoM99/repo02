package general;

import java.util.Random;

public class Empleado extends persona{
String tipoContrato;
Double sueldoburto;
int horasTrabajadas;
double comisiones;


public  double calcularSueldo(String tipoContrato, double sueldoBase, int horasTrabajadas, double comisiones) {
    double sueldoTotal = 0.0;

    switch (tipoContrato.toLowerCase()) {
        case "fijo":
            // Para contrato fijo, el sueldo es simplemente el sueldo base
            sueldoTotal = sueldoBase;
            break;

        case "horas":
            // Para contrato por horas, se asume que sueldoBase es la tarifa por hora
            sueldoTotal = sueldoBase * horasTrabajadas;
            break;

        case "comision":
            // Para contrato con comisión, el sueldo es el sueldo base más las comisiones
            sueldoTotal = sueldoBase + comisiones;
            break;

        default:
            System.out.println("Tipo de contrato no reconocido.");
            break;
    }

    return sueldoTotal;
    
}
public  String generarDNIAleatorio() {
    Random random = new Random();
    
    // Generar un número aleatorio de 8 dígitos
    int numeroDNI = random.nextInt(90000000) + 10000000; // Para asegurar que sea un número de 8 dígitos
    
    // Calcular la letra correspondiente al número de DNI
    char letraDNI = calcularLetraDNI(numeroDNI);
    
    // Formar el DNI completo
    return String.format("%08d", numeroDNI) + letraDNI;
}

public  char calcularLetraDNI(int numeroDNI) {
    // Array de letras posibles
    char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    // Calcular el índice de la letra
    int indice = numeroDNI % 23;
    
    // Devolver la letra correspondiente
    return letras[indice];
}
}
