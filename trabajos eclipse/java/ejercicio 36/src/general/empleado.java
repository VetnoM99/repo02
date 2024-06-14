package general;

public class empleado {

	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + "]";
	}


}
