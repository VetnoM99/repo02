import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pelicula> peliculasList = new ArrayList<Pelicula>();
		// Añadiendo peliculas al arrayList
		peliculasList.add(new Pelicula("Pulp Fiction", "2002", "Tarantino"));
		peliculasList.add(new Pelicula("Kill Bill", "2005", "Tarantino"));
		peliculasList.add(new Pelicula("Rocky", "2007", "Stalonne"));

		System.out.printf("%20s%20s%20s%n", "Nombre ", "Director", "Año");
		System.out.println("\t-----------------------------------------------------------");
		for (Pelicula pelicula : peliculasList) {
			System.out.printf("%20s%20s%20s%n", pelicula.titulo, pelicula.anyo, pelicula.director);
		}

		System.out.printf("%-20s%-20s%-20s%n", "Nombre ", "Director", "Año");
		System.out.println("-----------------------------------------------------------");
		for (Pelicula pelicula : peliculasList) {
			System.out.printf("%-20s%-20s%-20s%n", pelicula.titulo, pelicula.anyo, pelicula.director);
		}
	}

	public static class Pelicula {
		String titulo = "";
		String anyo = "";
		String director = "";

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAnyo() {
			return anyo;
		}

		public void setAnyo(String anyo) {
			this.anyo = anyo;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public Pelicula(String titulo, String anyo, String director) {
			super();
			this.titulo = titulo;
			this.anyo = anyo;
			this.director = director;
		}
	}
	}

