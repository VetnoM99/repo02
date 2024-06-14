
public class Main {

	public static void main(String[] args) {
	System.out.printf("%s%s%s","\tNOMBRE "," \tApellido "," \tApellido2 \n");
	System.out.printf("%s%10s%s","Nombre","Apellido","Apellido2\n");
	System.out.printf("%3$s, %2$s, %1$s"," Nombre \n", " Apellido "," Apellido2 ");
	System.out.printf("%5s%n","22");
	System.out.printf("%08d%n",22);
	System.out.printf("%09.2f%n",17.1829327);
	//no se puede borar una sola letra
	System.out.printf("%s%s", "hola", "mundo".replace("n", ""));

	}

}
