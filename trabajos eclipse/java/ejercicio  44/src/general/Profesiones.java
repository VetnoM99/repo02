package general;

public enum Profesiones {
BackEndDeveloper,
FrontEndDeveloper,
FullStakDeveloper
}

 class Developer{
	public String nombre="",apelldio = "",dni="",rolTecnologico="";
	public int edad;
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelldio() {
		return apelldio;
	}
	public void setApelldio(String apelldio) {
		this.apelldio = apelldio;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getRolTecnologico() {
		return rolTecnologico;
	}
	public void setRolTecnologico(String rolTecnologico) {
		this.rolTecnologico = rolTecnologico;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Developer(String nombre, String apelldio, String dni, String rolTecnologico, int edad) {
		super();
		this.nombre = nombre;
		this.apelldio = apelldio;
		this.dni = dni;
		this.rolTecnologico = rolTecnologico;
		this.edad = edad;
	}

	
}