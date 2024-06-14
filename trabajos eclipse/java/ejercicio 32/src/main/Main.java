package main;

public class Main {

	public static void main(String[] args) {
		coche c = new coche();
		c.setSpeed(120);
		c.setNombre("Ford");
		c.setMarca("F100");
		c.setFuel(200);
		int distancia = 100;//km
		int cantidadViajes=5;
		int distanciaTotal = distancia * cantidadViajes;
		int combustibleConsumido = 30;
		c.setConsumoMedio((int)c.consumoMedio(distancia,combustibleConsumido));
		int consumoTotal = distanciaTotal / c.getConsumoMedio();
		c.setFuel(c.getFuel()-consumoTotal);
		System.out.println(c.getNombre());
		System.out.println(c.getMarca());
		System.out.println("el combustible antes de los viajes "+ c.getFuel());
		System.out.println("el consumo medio del coche es "+c.getConsumoMedio() +" litros kada 100km");
		System.out.println("la distancia recorrida es "+ distancia);
		System.out.println("la cantidad de viajes va a ser "+ cantidadViajes);
		System.out.println("la distancia que va a recorrer en total es "+ distanciaTotal + "km");
		System.out.println("el consumo que ha tenido es "+consumoTotal + " litros");
		boolean bandera = c.refuel();
		System.out.println(bandera== true ? "Aun tiene combusitble " + c.getFuel()+" litros": "no, no tiene combustible vaya a la gasolinera");
		
		
		
	}

}
