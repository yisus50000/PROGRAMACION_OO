package modificadores;

//Aqui usamos extends por que es una subclase
public class PruebaModificador extends ClasePublica {
	
	public void ExtraerPreguntas() {
	//Al ser PUBLICA podemos usarla sin problemas en una subclase
	System.out.println("¿Que color te gusta? " + Colorfav);	
	System.out.println("¿Que comida te gusta? " + Comidafav);
	
	//Al ser PROTECTED podemos usarla sin problemas en una subclase
	System.out.println("¿Cuales son tus hobbies? " + Hobbies);
	System.out.println("¿Tu Correo? " + Correo);
	
	//Al ser DEFAULT podemos usarla sin problemas en una subclase
	System.out.println("¿Cual es tu numero de telefono? " + Telefono);	
	System.out.println("¿Cual es tu numero de telefono? " + Telefono);	
	
	//El modificador PRIVATE solo se pueden usar en su propia clase y no fuera de ellas ese es su limite
	//por eso nos da error
	System.out.println("Guardar Secretos " + Secretos);	
	System.out.println("Guardar Secretos " + Pasado);

}
}
