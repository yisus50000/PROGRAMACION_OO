package deber.grupal;

public class Cliente {

	
	void DatosClientes(String nombre, String apellido, String cedula, String placa, String GD, double consumo) {
	System.out.println("Nombre: " + nombre);
	System.out.println("Apellido: " + apellido);
	System.out.println("Cedula: " + cedula);
	System.out.println("Placas: " + placa);
	System.out.println("Diesel o Gasolina: " + GD);
	System.out.println("Consumo final en dolares" + consumo);
	}
}
