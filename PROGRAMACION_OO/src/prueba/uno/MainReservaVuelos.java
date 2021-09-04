package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecladoint = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		System.out.println("Ingrese informacion de pasajero:");
		System.out.println("Ingrese Nombre:");
		String nombre = tecladoString.nextLine();
		System.out.println("Ingrese Apellido:");
		String apellido = tecladoString.nextLine();
		System.out.println("Ingrese Edad:");
		int edad = tecladoint.nextInt();
		System.out.println("Que tipo de pasajero es: 1. PasajeroVIP  2. PasajeroEco");
		int opcion = tecladoint.nextInt();
		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("Ingrese codigo de membresia: ");
			membresia = tecladoString.nextLine();
		} else {
			System.out.println("Ingrese codigo de descuento: ");
			descuento = tecladoString.nextLine();
		}
		PasajeroVIP pasajero1 = new PasajeroVIP();
		pasajero1.setNombre("");
		pasajero1.setApellido("");
		pasajero1.setEdad(25);
		pasajero1.setCodigoMembresia("ASD21");
		PasajeroVIP pasajero2 = new PasajeroVIP("Javier", "Cruz", 30, "SFR23");
		PasajeroEconomicos pasajeroEconomico1 = new PasajeroEconomicos();
		pasajeroEconomico1.setNombre("Jaime");
		pasajeroEconomico1.setApellido("Benjamin");
		pasajeroEconomico1.setEdad(40);
		pasajeroEconomico1.setCodigoDescuento("AWD34");
		PasajeroEconomicos pasajeroEconomico2 = new PasajeroEconomicos("Diego", "Pineda", 25, "EMS26");
		Pasajero asientos[][] = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroEconomico1;
		asientos[3][2] = pasajeroEconomico2;

		int opcionsalir = 0;
		do {
			System.out.println("Ingrese datos del asiento: 0 continuar, -1 Salir ");
			opcionsalir = tecladoint.nextInt();
			if (opcionsalir == 0) {
				System.out.println("Ingrese fila del asiento: ");
				int fila = tecladoint.nextInt();
				System.out.println("Ingrese columna del asiento: ");
				int columna = tecladoint.nextInt();

				System.out.println("Los datos del pasajero son: ");
				System.out.println(asientos[fila][columna]);
			} else if (opcionsalir == -1) {
				System.out.println("Va salir del sistema ");
			}
		} while (opcionsalir != -1);

	}
}
