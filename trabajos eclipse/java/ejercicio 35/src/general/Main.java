package general;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Empleado e = new Empleado();
		e.nombres="David";
		e.apellidos="Bernal";
		e.documento=c.generarCodigoAleatorio();
		c.categoria="ejecutivo";
		c.codigo = c.generarCodigoAleatorio();
		e.tipoContrato="horas";
		e.sueldoburto=1200d;
		e.horasTrabajadas=8;
		e.comisiones=200;
		double sueldo = e.calcularSueldo(e.tipoContrato, e.sueldoburto, e.horasTrabajadas, e.comisiones);
		System.out.println("\ttrabajador nombre : "+e.nombres);
		System.out.println("\tApellido : "+e.apellidos);
		System.out.println("\tDcuemento : "+e.documento);
		System.out.println("\tsu categoria es : " +c.categoria);
		System.out.println("\tsu codigo es : "+c.codigo);
		System.out.println("\tsu contrato es por : "+e.tipoContrato);
		System.out.println("\tel sueldo base que tendra es : "+e.sueldoburto);
		System.out.println("\tel sueldo que tendra es : "+sueldo);
		System.out.println("\ttrabajara "+e.horasTrabajadas+"hs");

	}

}
