package ejercicios.modificadores.acceso.enfermeras;

import ejercicios.modificadores.acceso.*;

public class Enfermera extends TerceraEdad{
	public void dardeAlta() {
		TerceraEdad juan = new TerceraEdad();
		juan.ExamenProstata();
		juan.nombre();
		juan.apellido();
		juan.realizarDiagnostico();
	}

}
