
public class Main {

	public static void main(String[] args) {
		Byte numbyte= 0;
		System.out.println("el tipo de dato: "+ numbyte.TYPE);
		System.out.println("Esta formado por: "+ numbyte.BYTES);
		System.out.println("un byte esta fomrado por :" +numbyte.SIZE);
		System.out.println("su rango va del: "+ numbyte.MIN_VALUE +" a "+ numbyte.MAX_VALUE +"\n");
		
		System.out.println("\trango "+ numbyte.TYPE +" desde "+ numbyte.MIN_VALUE +" hasta "+ numbyte.MAX_VALUE);
		System.out.println("\t-------------------------------------------------------------");
		Short numShort =0;
		System.out.println("\trango "+ numShort.TYPE +" desde "+ numShort.MIN_VALUE +" hasta "+ numShort.MAX_VALUE);
		System.out.println("\t-------------------------------------------------------------");
		Integer numInt=0;
		System.out.println("\trango "+ numInt.TYPE +" desde "+ numInt.MIN_VALUE +" hasta "+ numInt.MAX_VALUE);
		System.out.println("\t-------------------------------------------------------------");
		Long numLong =0l;
		System.out.println("\trango "+ numLong.TYPE +" desde "+ numLong.MIN_VALUE +" hasta "+ numLong.MAX_VALUE);
		System.out.println("\t-------------------------------------------------------------");
		Float numFloat=0f;
		System.out.println("\trango "+ numFloat.TYPE +" desde "+ numFloat.MIN_VALUE +" hasta "+ numFloat.MAX_VALUE);
		System.out.println("\t-------------------------------------------------------------");
		Double numDouble=0d;
		System.out.println("\trango "+ numDouble.TYPE +" desde "+ numDouble.MIN_VALUE +" hasta "+ numDouble.MAX_VALUE);
		System.out.println("\t-------------------------------------------------------------");
	}

}
