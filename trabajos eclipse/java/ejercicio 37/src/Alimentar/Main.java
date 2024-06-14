package Alimentar;

public class Main {

	public static void main(String[] args) {
		AnimalCarnivoro carne = new AnimalCarnivoro();
		AnimalHerbivoro hierva = new AnimalHerbivoro();
		Planta planta = new Planta();
		planta.alimentarse();
		carne.alimentarse();
		hierva.alimentarse();
	}

}
