
public class Main {

	public static void main(String[] args) {
		double valorDouble = 123.456;
	System.out.println("desde double a byte");
		System.out.println("numero double "+ valorDouble);
		System.out.println("pasar a float "+ (float)valorDouble);
		System.out.println("pasar a long "+ (long)valorDouble);
		System.out.println("pasar a Int "+ (int)valorDouble);
		System.out.println("pasar a short "+ (short)valorDouble);
		System.out.println("pasar a byte "+ (byte)valorDouble);

		System.out.println("\ndesde byte a double");
		byte valorByte= 125;
		System.out.println("numero byte "+ valorByte);
		System.out.println("pasar a short "+ (short)valorByte);
		System.out.println("pasar a int "+ (int)valorByte);
		System.out.println("pasar a long "+ (long)valorByte);
		System.out.println("pasar a float "+ (float)valorByte);
		System.out.println("pasar a double "+ (double)valorByte);

		byte valorByte2=100;
		int valorByte3= valorByte2 *2;
		System.out.println("con memoria "+valorByte3);
		System.out.println("con casteo "+ (int)valorByte2*2);
	}

}
