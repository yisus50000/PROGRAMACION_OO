package prueba.avion;

import java.util.Arrays;

public class MainPasajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PasajeroAvion economicoJulio = new PasajeroAvion();
		economicoJulio.setNombre("Julio");
		economicoJulio.setApellido("Carrión");
		economicoJulio.Edad(27);
		economicoJulio.descuento("1225");

		PasajeroAvion economicoMaria = new PasajeroAvion();
		economicoMaria.setNombre("Maria");
		economicoMaria.setApellido("Tiopanta");
		economicoMaria.Edad(22);
		economicoMaria.descuento("1443");

		PasajeroAvion economicoMario = new PasajeroAvion();
		economicoMario.setNombre("Mario");
		economicoMario.setApellido("Pascal");
		economicoMario.Edad(34);
		economicoMario.descuento("1556");

		PasajeroAvion economicoPedro = new PasajeroAvion();
		economicoPedro.setNombre("Pedro");
		economicoPedro.setApellido("Toaquiza");
		economicoPedro.Edad(25);
		economicoPedro.descuento("1332");

		PasajeroAvion economicoCarla = new PasajeroAvion();
		economicoCarla.setNombre("Carla");
		economicoCarla.setApellido("Jumbo");
		economicoCarla.Edad(33);
		economicoCarla.descuento("1776");
		
		PasajeroAvion economicoYulisa = new PasajeroAvion();
		economicoYulisa.setNombre("Yulisa");
		economicoYulisa.setApellido("Venavides");
		economicoYulisa.Edad(26);
		economicoYulisa.descuento("1234");

		PasajeroAvion economicoSantiago = new PasajeroAvion();
		economicoMaria.setNombre("Santiago");
		economicoMaria.setApellido("Freire");
		economicoMaria.Edad(34);
		economicoMaria.descuento("1423");

		PasajeroAvion economicoDoki = new PasajeroAvion();
		economicoDoki.setNombre("Doki");
		economicoDoki.setApellido("Herrera");
		economicoDoki.Edad(33);
		economicoDoki.descuento("1256");

		PasajeroAvion economicoAlberto = new PasajeroAvion();
		economicoPedro.setNombre("Alberto");
		economicoPedro.setApellido("Alberto");
		economicoPedro.Edad(25);
		economicoPedro.descuento("1323");

		PasajeroAvion economicoKaren = new PasajeroAvion();
		economicoKaren.setNombre("Karen");
		economicoKaren.setApellido("Simbaña");
		economicoKaren.Edad(25);
		economicoKaren.descuento("1276");

		String pasajero[][] = new String[4][5];
		pasajero[1][0] = economicoJulio;
		pasajero[1][1] = economicoMaria;
		pasajero[1][2] = economicoMario;
		pasajero[1][3] = economicoPedro;
		pasajero[1][4] = economicoCarla;
		pasajero[2][0] = economicoYulisa;
		pasajero[2][1] = economicoSantiago;
		pasajero[2][2] = economicoDoki;
		pasajero[2][3] = economicoAlberto;
		pasajero[2][4] = economicoKaren;
	}

}
