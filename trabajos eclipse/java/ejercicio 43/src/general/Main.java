package general;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombreFinal = null;
		String apellidoFinal = null;
		RecitarPoema poema = new RecitarPoema();
		NotAutorized a = new NotAutorized();
	
	var bandera=1;
	  do {
		  System.out.println("porfavor ingrese un nombre ");

          try {
            String  nombre = sc.nextLine();

              if (contieneNumeros(nombre)) {
                  throw new InputMismatchException("Se esperaban solo letras.");
              }

              System.out.println("El string ingresado sin números es: " + nombre);
              nombreFinal = nombre;
              bandera=1;

          } catch (InputMismatchException e) {
              System.out.println("Error: " + e.getMessage());
              bandera = 0; // Restablece el valor de input para que se solicite nuevamente
          }
          

     

      } while (bandera == 0); // Repetir hasta que se proporcione un valor válido
	  
	  do {
		  System.out.println("porfavor ingrese un Apellido ");

          try {
            String  apellido = sc.nextLine();

              if (contieneNumeros(apellido)) {
                  throw new InputMismatchException("Se esperaban solo letras.");
              }

              System.out.println("El string ingresado sin números es: " + apellido);
              apellidoFinal=apellido;
              bandera=1;

          } catch (InputMismatchException e) {
              System.out.println("Error: " + e.getMessage());
              bandera = 0; // Restablece el valor de input para que se solicite nuevamente
          }

        

      } while (bandera == 0); // Repetir hasta que se proporcione un valor válido
	  
	  
	  if (nombreFinal.equalsIgnoreCase("Federico")&&apellidoFinal.equalsIgnoreCase("Garcia")) {
		  poema.Poema();
	  }else {
		  a.No();
	  }
  }
	 
	   private static boolean contieneNumeros(String input) {
	        for (char c : input.toCharArray()) {
	            if (Character.isDigit(c)) {
	                return true;
	            }
	        }
	        return false;
	    }

	}


