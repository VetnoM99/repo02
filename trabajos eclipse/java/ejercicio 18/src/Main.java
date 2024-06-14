
public class Main {

	public static void main(String[] args) {
		Main m= new Main();
		double num =  Math.random()*20;
		System.out.println(m.Esdivisiblepor2(num));
		
		System.out.println("numeros generados automaticamente\n");
	      int cantidadNumeros = 5;
	        double[] numerosAleatorios = meterArray(cantidadNumeros);

	        // Generar números aleatorios y almacenarlos en el array
	     

	        // Imprimir los números aleatorios generados
	        System.out.println("Números aleatorios generados:");
	        for (int i = 0; i < cantidadNumeros; i++) {
	            System.out.println("el numero "+ (int)numerosAleatorios[i]);
	            System.out.println(((int)numerosAleatorios[i]%3==0)?"es divisible por 3\n":"no es divisible por 3\n");
	        }
	        boolean bandera= true;
do {
	System.out.println("hola con do while");
	bandera= false;
} while (bandera);
	        
	        int iterar =3;
	        
	        for (int i =0;i<iterar;i++){
	        System.out.println("hola con for");
	        System.out.println("hola con for");
	        System.out.println("hola con for\n");
	        } 
	        
	        
    }
	
	

	
	public String Esdivisiblepor2(double num) {
		
		System.out.println("el numero "+(int) num);
		return ((int)num % 2==0)? "es divisible por 2": "no es divisible por 2";
		

	}
	
	public static double[] meterArray(int valor) {
		
		double[] numerosAleatorios = new double[valor];
		   for (int i = 0; i < valor; i++) {
	            numerosAleatorios[i] = Math.random()*30;
	         
	        }
		   return numerosAleatorios;
		
	}

}
