package modificadores;

public class ClasePublica {

	public String Colorfav;
	public String Comidafav;
	protected String Hobbies;
	protected String Correo;
	int Cedula;
	int Telefono;
	private String Secretos;
	private String Pasado;
	public void Preguntas() {
	System.out.println("¿Que color te gusta? " + Colorfav);	
	System.out.println("¿Que comida te gusta? " + Comidafav);
	System.out.println("¿Cuales son tus hobbies? " + Hobbies);	
	System.out.println("¿Tu Correo? " + Correo);
	System.out.println("¿Tu Número de cedula? " + Cedula);
	System.out.println("¿Cual es tu numero de telefono? " + Telefono);	
	System.out.println("Guardar Secretos " + Secretos);	
	System.out.println("Guardar Secretos " + Pasado);
	}
	
}

