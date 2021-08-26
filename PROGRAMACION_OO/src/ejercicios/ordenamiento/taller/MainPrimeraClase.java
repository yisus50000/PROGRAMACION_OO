package ejercicios.ordenamiento.taller;

import java.util.Arrays;

public class MainPrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer dia de clase
		// El profesor nos da nuestro número lista

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		danilo.setApellido("Alvarracin");
		danilo.setEdad(20);
		System.out.println("DANILO:");
		System.out.println(danilo);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setApellido("Pineda");
		andres.setNumeroLista(2);
		andres.setEdad(19);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setApellido("Sosoranga");
		alex.setEdad(18);
		alex.setNumeroLista(22);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setApellido("Macas");
		stefany.setEdad(21);
		stefany.setNumeroLista(10);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setApellido("Rolon");
		jhonny.setEdad(22);
		jhonny.setNumeroLista(21);

		// Alex dame tu nuemro de lista
		System.out.println("Inge. mi edad es: " + alex.getEdad());
		System.out.println("Inge. mi edad es: " + jhonny.getEdad());

		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;

		// Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

		// Aqui ordeno la lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

	}

}
