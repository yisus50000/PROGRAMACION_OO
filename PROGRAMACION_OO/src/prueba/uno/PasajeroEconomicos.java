package prueba.uno;

public class PasajeroEconomicos extends Pasajero {

	private String codigoDescuento;

	public PasajeroEconomicos() {

	}

	public PasajeroEconomicos(String nombre, String apellido, int edad, String codigoDescuento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoDescuento = codigoDescuento;
	}

	// METODOS SET Y GET
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	public String toString() {
		return "**PasajeroEconomicos***"  + "\n" + "nombre=" + nombre + "\n"
				+ "apellido=" + apellido + "\n" + "edad=" + edad + "\n" + "codigoDescuento=" + codigoDescuento;
	}

}