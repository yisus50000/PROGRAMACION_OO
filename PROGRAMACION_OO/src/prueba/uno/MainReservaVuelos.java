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
		System.out.println("Que tipo de pasajero es:");
		System.out.println("1. Pasajero VIP");
		System.out.println("2. Pasajero Económico");
		int opcion = tecladoint.nextInt();
		String membresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("Ingrese codigo de membresia: ");
			membresia = tecladoString.nextLine();
		} else if (opcion == 2) {
			System.out.println("Ingrese codigo de descuento: ");
			descuento = tecladoString.nextLine();
		} else {
			System.out.println("Digite una opción valida");
		}

		PasajeroVIP pasajero1 = new PasajeroVIP("Adela", "Sora", 25, "ASD21");

		PasajeroVIP pasajero2 = new PasajeroVIP("Javier", "Cruz", 30, "SFR23");

		PasajeroVIP pasajero3 = new PasajeroVIP("Mauricio", "Bermello", 23, "MNS72");

		PasajeroVIP pasajero4 = new PasajeroVIP("Marco", "Pozo", 26, "RTF92");

		PasajeroVIP pasajero5 = new PasajeroVIP("Cinthia", "Naula", 23, "WGH82");

		PasajeroVIP pasajero6 = new PasajeroVIP("Carla", "Chipantasi", 34, "WWE45");

		PasajeroVIP pasajero7 = new PasajeroVIP("Marcelo", "Chate", 21, "QCS09");

		PasajeroVIP pasajero8 = new PasajeroVIP("Mayra", "Quintanilla", 28, "AQB71");

		PasajeroVIP pasajero9 = new PasajeroVIP("Samanta", "Juarez", 27, "JCV62");

		PasajeroVIP pasajero10 = new PasajeroVIP("Marlon", "Lusuriaga", 33, "KQU74");

		PasajeroEconomicos pasajeroEco1 = new PasajeroEconomicos();
		pasajeroEco1.setNombre("Jaime");
		pasajeroEco1.setApellido("Benjamin");
		pasajeroEco1.setEdad(40);
		pasajeroEco1.setCodigoDescuento("AWD34");

		PasajeroEconomicos pasajeroEco2 = new PasajeroEconomicos();
		pasajeroEco2.setNombre("Carlos");
		pasajeroEco2.setApellido("Tonato");
		pasajeroEco2.setEdad(22);
		pasajeroEco2.setCodigoDescuento("MJV34");

		PasajeroEconomicos pasajeroEco3 = new PasajeroEconomicos();
		pasajeroEco3.setNombre("Diego");
		pasajeroEco3.setApellido("Pineda");
		pasajeroEco3.setEdad(25);
		pasajeroEco3.setCodigoDescuento("EMS26");

		PasajeroEconomicos pasajeroEco4 = new PasajeroEconomicos();
		pasajeroEco4.setNombre("Mario");
		pasajeroEco4.setApellido("Quintero");
		pasajeroEco4.setEdad(21);
		pasajeroEco4.setCodigoDescuento("EWR96");

		PasajeroEconomicos pasajeroEco5 = new PasajeroEconomicos();
		pasajeroEco5.setNombre("Selena");
		pasajeroEco5.setApellido("Alquinga");
		pasajeroEco5.setEdad(36);
		pasajeroEco5.setCodigoDescuento("ALQ18");

		PasajeroEconomicos pasajeroEco6 = new PasajeroEconomicos();
		pasajeroEco6.setNombre("Matias");
		pasajeroEco6.setApellido("ESquera");
		pasajeroEco6.setEdad(27);
		pasajeroEco6.setCodigoDescuento("WKV43");

		PasajeroEconomicos pasajeroEco7 = new PasajeroEconomicos();
		pasajeroEco7.setNombre("Dylan");
		pasajeroEco7.setApellido("Teopanta");
		pasajeroEco7.setEdad(42);
		pasajeroEco7.setCodigoDescuento("YNA28");

		PasajeroEconomicos pasajeroEco8 = new PasajeroEconomicos();
		pasajeroEco8.setNombre("Amy");
		pasajeroEco8.setApellido("Benitez");
		pasajeroEco8.setEdad(29);
		pasajeroEco8.setCodigoDescuento("PLZ92");

		PasajeroEconomicos pasajeroEco9 = new PasajeroEconomicos();
		pasajeroEco9.setNombre("Nayeli");
		pasajeroEco9.setApellido("Bravo");
		pasajeroEco9.setEdad(37);
		pasajeroEco9.setCodigoDescuento("ISM31");

		PasajeroEconomicos pasajeroEco10 = new PasajeroEconomicos();
		pasajeroEco10.setNombre("Stefanny");
		pasajeroEco10.setApellido("Intriago");
		pasajeroEco10.setEdad(32);
		pasajeroEco10.setCodigoDescuento("QCR82");

		Pasajero asientos[][] = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajero3;
		asientos[0][3] = pasajero4;
		asientos[0][4] = pasajero5;
		asientos[3][0] = pasajero6;
		asientos[3][1] = pasajero7;
		asientos[3][2] = pasajero8;
		asientos[3][3] = pasajero9;
		asientos[3][4] = pasajero10;
		asientos[1][0] = pasajeroEco1;
		asientos[1][1] = pasajeroEco2;
		asientos[1][2] = pasajeroEco3;
		asientos[1][3] = pasajeroEco4;
		asientos[1][4] = pasajeroEco5;
		asientos[2][0] = pasajeroEco6;
		asientos[2][1] = pasajeroEco7;
		asientos[2][2] = pasajeroEco8;
		asientos[2][3] = pasajeroEco9;
		asientos[2][4] = pasajeroEco10;

		int opcionsalir = 0;
		do {
			System.out.println("Digite datos del asiento");
			System.out.println("Elija una opcion:");
			System.out.println("0 continuar");
			System.out.println("-1 Salir");
			opcionsalir = tecladoint.nextInt();
			if (opcionsalir == 0) {
				System.out.println("Ingrese fila del asiento: ");
				int fila = tecladoint.nextInt();
				System.out.println("Ingrese columna del asiento: ");
				int columna = tecladoint.nextInt();

				System.out.println("Los datos del pasajero son: ");
				System.out.println(asientos[fila][columna]);
			} else if (opcionsalir == -1) {
				System.out.println("Gracias por preferirnos");
			}
		} while (opcionsalir != -1);
		
	}
}
