package ejercicio7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean
		boolean bandera = false;
		System.out.println("Tipo de dato boolean");
		System.out.println("el valor por defecto de boolean es" + bandera);
		System.out.println("el tamaño en memoria es" + 1 +" bit es decir que tiene 2 posibilidades true o false");
		
		//caracter
		int bits =	Character.SIZE ;
		int minValue = Character.MIN_VALUE;
		int maxValue = (int) (Math.pow(2, bits) - 1);
		System.out.println("El valor mínimo de un char es: " + minValue);
		System.out.println("El valor máximo de un char es: " + maxValue);

		//byte
		int numerobyte = Byte.SIZE;
		System.out.println("Tipo de dato byte");
		int rangonumbyte = 2 *(int) Math.pow(numerobyte, 2);
		int byteMinimo = (int) -Math.pow(2, numerobyte-1);
	    int byteMaximo = (int) (Math.pow(2, numerobyte-1) - 1);
		System.out.println("El Byte tiene " + numerobyte + " bytes en memoria");
		System.out.println(rangonumbyte+" bytes es en memoria");
		System.out.println("su rango en negativo es "+ byteMinimo +" y su rango positivo es " + byteMaximo);
			
			
					//short
					int numeroShort = Short.SIZE;
					System.out.println("Tipo de dato Short");
			        int ShortMinimo = (int) -Math.pow(2, numeroShort-1);
		            int ShortMaximo = (int) (Math.pow(2, numeroShort-1) - 1);
					System.out.println("El Short tiene " + numeroShort + " bits en memoria");
					System.out.println(Short.BYTES +" bytes es en memoria");
					System.out.println("su rango en negativo es "+ ShortMinimo +" y su rango positivo es " + ShortMaximo);
				// Integer
				    int numeroInt = Integer.SIZE;
					System.out.println("Tipo de dato Int");
				    int IntMinimo = (int) -Math.pow(2, numeroInt-1);
			        int IntMaximo = (int) (Math.pow(2, numeroInt-1) - 1);
					System.out.println("El Short tiene " + numeroInt + " bits en memoria");
					System.out.println(Integer.BYTES +" bytes es en memoria");
					System.out.println("su rango en negativo es "+ IntMinimo +" y su rango positivo es " + IntMaximo);
					
					//Long
					int numeroLong = Long.SIZE;
					System.out.println("Tipo de dato Long");
					  int LongMinimo = (int) -Math.pow(2, numeroLong-1);
				      int LongMaximo = (int) (Math.pow(2, numeroLong-1) - 1);
				    System.out.println("El Short tiene " + numeroLong + " bits en memoria");
					System.out.println(Long.BYTES +" bytes es en memoria");
					System.out.println("su rango en negativo es "+ LongMinimo +" y su rango positivo es " + LongMaximo);
						
					//float
					int numeroFloat = Float.SIZE;
					System.out.println("Tipo de dato Float");
						 int FloatMinimo = (int) -Math.pow(2, numeroFloat-1);
					     int FloatMaximo = (int) (Math.pow(2, numeroFloat-1) - 1);
					System.out.println("El Short tiene " + numeroFloat + " bits en memoria");
					System.out.println(Float.BYTES +" bytes es en memoria");
					System.out.println("su rango en negativo es "+ FloatMinimo +" y su rango positivo es " + FloatMaximo);
							
					//Double
					int numeroDouble = Double.SIZE;
					System.out.println("Tipo de dato Double");
						int DoubleMinimo = (int) -Math.pow(2, numeroDouble-1);
						int DoubleMaximo = (int) (Math.pow(2, numeroDouble-1) - 1);
					System.out.println("El Short tiene " + numeroDouble + " bits en memoria");
					System.out.println(Double.BYTES +" bytes es en memoria");
					System.out.println("su rango en negativo es "+ DoubleMinimo +" y su rango positivo es " + DoubleMaximo);
	}

}
