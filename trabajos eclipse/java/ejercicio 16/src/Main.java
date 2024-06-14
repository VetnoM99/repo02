
public class Main {

	public static void main(String[] args) {
//		int numero = 4;
//	    String resultado;
//        switch (numero) {
//            case 1:
//                resultado = "uno";
//                break;
//            case 2:
//                resultado = "dos";
//                break;
//            case 3:
//                resultado = "tres";
//                break;
//            case 4:
//                resultado = "cuatro";
//                break;
//            case 5:
//                resultado = "cinco";
//                break;
//            case 6:
//                resultado = "seis";
//                break;
//            case 7:
//                resultado = "siete";
//                break;
//            case 8:
//                resultado = "ocho";
//                break;
//            case 9:
//                resultado = "nueve";
//                break;
//            default:
//                resultado = "Número fuera de rango";
//                break;
//        }
//       System.out.println(resultado);

     System.out.println(pasarif());
	
	}
	
	
    
    public static  String pasarif() {
  	  
  	  double number= Math.random()*100;
  			  double number2= Math.random()*-200;
  	  System.out.println("numerp 1 "+(int)number);
  	  System.out.println("numero 2 "+(int)number2);
  	int resul = (int)number + (int)number2;
  	System.out.println("resultado "+resul);
  	  return (resul>0)? "es positivo":(resul<0)?"es negativo":"es cero, na de na";
  	  
    }

}
