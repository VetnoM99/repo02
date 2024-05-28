
public class Main {

	public static void main(String[] args) {
	      String abecedario = "abcdefghijklmnopqrstuvwxyz";
	        for (int i = 0; i < abecedario.length(); i++) {
	            String abecedarioReducido = abecedario.substring(0, abecedario.length() - i);
	            System.out.println(abecedarioReducido); // Mostrar el abecedario con una letra menos
	        }
	    }
	}


