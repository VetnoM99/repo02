
public class Main {

	public static void main(String[] args) {
		System.out.println("bucle for \n");
		for(int i=1 ;i<6;i++) {
			
			System.out.println("iteracion "+i+"º");
			if(i==3) {
				break;
			}
			
		}
		int cont=0;
		System.out.println("\nbucle while\n");
		while(cont <10) {
			cont+=1;
			System.out.println("iteracion "+cont+"º");
			if (cont==3) {
				break;
			}
		}
		
		System.out.println("\niteracion sin mostrar texto\n");
		cont=0;
		
		while(cont <7) {
			cont+=1;
			
			if (cont%2==0) {
				continue;
			}else {
				System.out.println("iteracion "+cont+"º");
			}
		}
	}

}
