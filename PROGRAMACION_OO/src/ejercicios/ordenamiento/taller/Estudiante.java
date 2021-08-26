package ejercicios.ordenamiento.taller;

public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private String apellido;
	private int edad;
	private int numeroLista;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
	public int compareTo(Estudiante o) {

		if (this.edad > o.getEdad()) {
			return 1;
		} else if (this.edad == o.getEdad()) {
			return 0;
		} else {
			return -1;
		}
	}

	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", numeroLista="
				+ numeroLista + "]";
	}

}
