package modificador.prueba;

//Aqui exportamos ya que es una clase que esta ubicada en otro paquete
import modificadores.ClasePublica;
import modificadores.PruebaModificador;
//para despues usar el extends
public class PruebaModificadores extends ClasePublica {
	
	public void ExtraerPaquete() {
		ClasePublica Alicia = new ClasePublica();
	//Al ser PUBLICA podemos usarla sin problemas en otro paquete
	System.out.println("¿Que color te gusta? " + Colorfav);
	System.out.println("¿Que comida te gusta? " + Comidafav);
	
	//Al ser PROTECTED podemos usarla sin problemas en otro paquete
	System.out.println("¿Cuales son tus hobbies? " + Hobbies);
	System.out.println("¿Tu Correo? " + Correo);
	
	//Al ser DEFAULT ya no podemos usarla fuera de otro paquee ya que su limite es hasta subclases
	System.out.println("¿Tu Número de cedula? " + Cedula);
	System.out.println("¿Cual es tu numero de telefono? " + Telefono);	
	
	//Al ser PRIVATE no podemos usarla mas que dentro de su propia clase ya que hasta ahi es su limite
	System.out.println("Guardar Secretos " + Secretos);		
	System.out.println("Guardar Secretos " + Pasado);	
	}
}
