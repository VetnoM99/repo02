
public class Main {

	public static void main(String[] args) {
		
		int num = 0;
		boolean bandera = true;
		
		while (bandera = true) {
			
			num = (int) (Math.random()*100);
			System.out.println((num%2 ==0)? "El numero "+num+" es par" : "El numero "+num+" inpar " );
			if (num ==50) {
				bandera=false;
				break;
			}
			
		}
		int contador = 0;
		bandera = true;
while (bandera = true) {
			
			num = (int) (Math.random()*100);
			System.out.println((num%2 ==0)? "El numero "+num+" es blanco"  : "El numero "+num+" negro "  );
			contador++;
			if (contador == 20) {
				bandera=false;
				break;
			}
			
		}
		
		
		
	}

}
