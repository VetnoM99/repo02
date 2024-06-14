package primerpakage;
import segundoPakage.*;
public class Main {

	public static void main(String[] args) {
		Saludar saludar = new Saludar();
		HastaNunqui hastaNunqui = new HastaNunqui();
		saludar.saludar();
		System.out.println(hastaNunqui.patada());
	}



}
