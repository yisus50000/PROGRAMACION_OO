package menu;

public class Paciente {
	private String nombre;
	private String apellido;
	private int edad;

	private void caminar() {
	}

	private void correr() {
	}

	// Metodo set y get
	// Siempre son publicos
	// Siempre lleva void
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// GET
	// no contiene void
	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getEdad() {
		return this.edad;
	}
}