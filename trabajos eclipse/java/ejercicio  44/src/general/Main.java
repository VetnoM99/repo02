package general;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Developer d = new Developer("Chester","Guzman","x93810x","BackEndDeveloper",34);
		 Developer d1 = new Developer("Alejamdo","Alejamdp","x1241410x","FrontEndDeveloper",24);
		 Developer d2 = new Developer("Juan","Gutierrez","x333810x","FullStackDeveloper",54);
		 Object[] developers = {d, d1, d2};
		 Random random = new Random();
	        int index = random.nextInt(developers.length);

	        if (developers[index]== d) {
	        	System.out.println("el nombre es: "+d.getNombre());
	        	System.out.println("su apellido es: "+ d.getApelldio());
	        	
	        	System.out.println("su rol es: "+ d.getRolTecnologico());
	        	System.out.println(d.rolTecnologico.equals("FullStackDeveloper")||d.rolTecnologico.equals("BackEndDeveloper")?"VIVA EL BACK":"EL JS ES UNA 💩");
	        	
	        }else if(developers[index]== d1) {
	        	System.out.println("el nombre es: "+d1.getNombre());
	        	System.out.println("su apellido es: "+ d1.getApelldio());
	        	
	        	System.out.println("su rol es: "+ d1.getRolTecnologico());
	        	System.out.println(d1.rolTecnologico.equals("FullStackDeveloper")||d1.rolTecnologico.equals("BackEndDeveloper")?"VIVA EL BACK":"EL JS ES UNA 💩");
	        	
	        }else {
	        	System.out.println("el nombre es: "+d2.getNombre());
	        	System.out.println("su apellido es: "+ d2.getApelldio());
	        	
	        	System.out.println("su rol es: "+ d2.getRolTecnologico());
	        	System.out.println(d2.rolTecnologico.equals("FullStackDeveloper")||d2.rolTecnologico.equals("BackEndDeveloper")?"VIVA EL BACK":"EL JS ES UNA 💩");
	        	
	        }
	        	
}
}
	