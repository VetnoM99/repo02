import java.util.jar.Attributes.Name;

public class Main {

	public static void main(String[] args) {
	
		Long numLong = 0l;
		byte numbyte=0;
		Byte wrapperbyte = numbyte;
		short numShort=0;
		Short wrapperShort= numShort;
		Integer numInteger =0;
		short num =0;
		
		System.out.println(((Object)numbyte).getClass());
		System.out.println("wrapper byte "+ wrapperbyte.getClass());
		System.out.println(((Object)numShort).getClass());
		System.out.println("wrapper Short "+wrapperShort.getClass());
		System.out.println(numLong.getClass());
		System.out.println(numInteger.getClass());
		System.out.println(" identificar el tipo "+ adivinar(num));

	}
public static Class<? extends Object> adivinar(Object valor) {
	
	return ((Object)valor).getClass();
}
}
