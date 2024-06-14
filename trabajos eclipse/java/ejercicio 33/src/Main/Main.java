package Main;

public class Main {

	public static void main(String[] args) {
	Banco b = new Banco();
	b.setNumero(123409871);
	b.setEntidadEmisora("MasterCard");
	b.setTitular("David Bernal");
	b.setFecha("25/29");
	b.setDinero(1000);
	int pagoSimple = 200;
	int pagoGrande = 2000;
	int cuotas = 10;

	System.out.println("el titular de la tarjeta es "+ b.getTitular());
	System.out.println("La entidad Emisora es "+b.getEntidadEmisora());
	System.out.println("el numero de la tarjeta es "+ b.getNumero());
	System.out.println("La Tarjeta vencera en "+ b.getFecha());
	System.out.println(b.activar()? "La tarjeta esta activada":"La tarjeta esta desactivada");
	System.out.println("La tarjeta tiene "+b.getDinero()+"€");
	System.out.println(b.pagar(pagoSimple)==0? "no se puede realizar el pago es muy grande": "si se puede pagar el dinero restante es "+b.getDinero());
	System.out.println(b.pagar(pagoGrande)== 0? "no se puede realizar el pago es demasiado grande":"si se puede pagar el dinero restante es " +b.getDinero());
	int cuotasPagadas= b.pagarAcuotas(pagoSimple, cuotas);
	System.out.println(cuotasPagadas==0 ? "no se puede realizar necesita mas saldo":"El dinero restante es "+ b.getDinero() + " y las cuotas pagadas fueron "+ cuotasPagadas );
	b.setDinero(0);
	System.out.println(b.activar()?"La tarjeta esta Activada": "La tarejta esta desactivada");
	}

}
