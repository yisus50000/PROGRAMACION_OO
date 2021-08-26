package interfaz.biblioteca;

public class BibliotecaMunicipal implements BibliotecaInterfaz {
	
	    public void solicitarCredenciales() {
	         System.out.println("Se solicita su identificación o una prenda");
	         System.out.println("se la retendra hasta que salga o regrese los libros que solicite");	
	    
		}
		public void almacenarDatos() {
			 System.out.println("Recopila los datos entregados");
			 System.out.println("Los guarda para saber si esa persona elijio un libro o no");
			 
		}
		public void seleccionarTipoLectura() {
			 System.out.println("Se da a elejir si va a estudiar o quiere leer para disfrute");
			 System.out.println("Tambien elejira si la lectura sera rapida o mas larga");
			 System.out.println("Asi solo usara el libro en la biblioteca o se lo prestara");
			 
		}
		public void recogerLibro() {
			 System.out.println("Buscara entre los textos para darle el libro deseado");
			 System.out.println("Si el libro deseado aparece se le dara ese libro a la persona");
			 
		}
		public void devolverLibro() {
			 System.out.println("Se solicitara el libro o la persona lo devolvera");
			 System.out.println("Recopila los datos y almacenara que esa persona devolvio los textos");
			 System.out.println("Se le devolvera su credencial u objeto de prenda");
		}
	}


