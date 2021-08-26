package ejercicios.ordenamiento;

public class Estudiante implements Comparable<Integer> {

	private String nombre;
	private int numeroLista;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}

	// Tiene 3 tipos de retorno un comparable
	// 0
	// 1
	// -1
	public int compareTo(Integer o) {
		
		if (this.numeroLista > o.getNumeroLista) {
			return 1;
		}
		else if (this.numeroLista == o.getNumeroLista) {
			return 0;
		}
		else (this.numeroLista < o.getNumeroLista) {
			return -1;
		}
		
	}
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", numeroLista=" + numeroLista + "]";
	}
	

}
