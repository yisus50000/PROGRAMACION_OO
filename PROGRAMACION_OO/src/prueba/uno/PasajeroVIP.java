package prueba.uno;

public class PasajeroVIP extends Pasajero {

	private String codigoMembresia;

	public PasajeroVIP() {

	}

	public PasajeroVIP(String nombre, String apellido, int edad, String codigoMembresia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoMembresia = codigoMembresia;

	}

	// METODOS SET Y GET
	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	public String toString() {
		return "***PasajeroVIP***" + "\n" + "nombre=" + nombre + "\n"
				+ "apellido=" + apellido + "\n" + "edad=" + edad + "\n" + "codigoMembresia=" + codigoMembresia ;
	}
}