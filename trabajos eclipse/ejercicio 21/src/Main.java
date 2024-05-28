
public class Main {

	public static void main(String[] args) {
	String pregunta = "java";
	String usuario = "admin";
	String contra = "1234";
	double num = Math.random()*20;
	System.out.println("pregunta java");
System.out.println(javaOrNull(pregunta)+"\n");
System.out.println("pregunta admin");
System.out.println(admin(usuario,contra));
System.out.println("pregunta par o inpar");
System.out.println("el numero es "+ (int)num +" es "+ parOinpar(num));
		
		
	}
public static String javaOrNull(String pregunta) {
	if(pregunta == "java") {
		return pregunta;
	}else
		return null;
}


public static String admin(String usuario, String contra) {
if(usuario == "admin"&&contra =="1234") {
	return "login True";
}else {
	return "Login False"; }
}


public static String parOinpar(double num) {
int num2 = (int)num;
return (num2%2 ==0)? "par" : "inpar";

}
}