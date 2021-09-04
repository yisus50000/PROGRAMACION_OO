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
	@Override
	public String toString() {
		return "PasajeroEconomicos [codigoDescuento=" + codigoDescuento + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", getCodigoDescuento()=" + getCodigoDescuento() + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}