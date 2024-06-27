package Main;

public class Banco {
	String entidadEmisora;
	long Numero;
	String fecha;
	String Titular;
	int dinero;
	boolean activado = true;

	public boolean getActivado() {
		return activado;
	}

	public void setActivado(boolean activado) {
		this.activado = activado;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public String getEntidadEmisora() {
		return entidadEmisora;
	}

	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}

	public long getNumero() {
		return Numero;
	}

	public void setNumero(long numero) {
		Numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public boolean activar() {
		if (getDinero() <= 0) {
			return false;
		}
		return true;
	}

	public int pagar(int pago) {
		if (getDinero() > pago) {
			int dineroRestante = getDinero() - pago;
			setDinero(dineroRestante);
			return dineroRestante;
		}
		return 0;

	}

	public int pagarAcuotas(int pago, int cuotas) {
		int totalApagar = pago * cuotas;
		int cuotaPagada=0;
	
		if (totalApagar > getDinero()) {
			return 0;
		}	
		for (int i =0;i<=cuotas; i++) {
			if (pago<getDinero()) {
				setDinero(getDinero()-pago);
				cuotaPagada=i;
			}			
		}
		return cuotaPagada;
	}
}