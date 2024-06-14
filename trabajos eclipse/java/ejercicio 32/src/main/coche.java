package main;

public class coche {
//atributos
	private int fuel;
	private String nombre;
	private String marca;
	private int Speed;
	private int fuelconsumido;
	private int consumoMedio;

	public int getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(int consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
	public double consumoMedio(int distancia ,int combustible ) {
		return distancia / combustible ;
	}

	public int getFuelconsumido() {
		return fuelconsumido;
	}

	public void setFuelconsumido(int fuelconsumido) {
		this.fuelconsumido = fuelconsumido;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}


	public boolean refuel() {
		if(getFuel()<=0)
		{
			return false;
		}
		return true;
	}
	
	    }

