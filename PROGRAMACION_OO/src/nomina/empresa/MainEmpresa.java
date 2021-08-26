package nomina.empresa;

import java.util.Arrays;

import ejercicios.ordenamiento.taller.Estudiante;

public class MainEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado javier = new Empleado();
		javier.setNombre("Javier");
		javier.setApellido("Chicaiza");
		javier.setEdad(29);
		javier.setSalario(520.50);

		Empleado mario = new Empleado();
		mario.setNombre("Mario");
		mario.setApellido("Chipantasi");
		mario.setEdad(32);
		mario.setSalario(485.38);
		
		Empleado jimena = new Empleado();
		jimena.setNombre("Jimena");
		jimena.setApellido("Sisalima");
		jimena.setEdad(33);
		jimena.setSalario(500);
		
		Empleado carla = new Empleado();
		carla.setNombre("Carla");
		carla.setApellido("Uyaguari");
		carla.setEdad(34);
		carla.setSalario(525.32);
		
		Empleado pedro = new Empleado();
		pedro.setNombre("Pedro");
		pedro.setApellido("Caztro");
		pedro.setEdad(31);
		pedro.setSalario(478.95);
		
		Empleado mariela = new Empleado();
		mariela.setNombre("Mariela");
		mariela.setApellido("Toaquisa");
		mariela.setEdad(30);
		mariela.setSalario(490.25);
		
		Empleado ramon = new Empleado();
		ramon.setNombre("Ramon");
		ramon.setApellido("Venavides");
		ramon.setEdad(29);
		ramon.setSalario(533.45);
		
		Empleado jaime = new Empleado();
		jaime.setNombre("Jaime");
		jaime.setApellido("Chavez");
		jaime.setEdad(32);
		jaime.setSalario(500.56);
		
		Empleado marcelo = new Empleado();
		marcelo.setNombre("Marcelo");
		marcelo.setApellido("Bonanza");
		marcelo.setEdad(37);
		marcelo.setSalario(600.40);

		Empleado ruby = new Empleado();
        ruby.setNombre("Ruby");
        ruby.setApellido("Acacia");
        ruby.setEdad(28);
        ruby.setSalario(530.22);
        
        Empleado listaEmpleados[] = new Empleado[10];
		listaEmpleados[0] = javier;
		listaEmpleados[1] = mario;
		listaEmpleados[2] = jimena;
		listaEmpleados[3] = carla;
		listaEmpleados[4] = pedro;
		listaEmpleados[5] = mariela;
		listaEmpleados[6] = ramon;
		listaEmpleados[7] = jaime;
		listaEmpleados[8] = marcelo;
		listaEmpleados[9] = ruby;
		
		Arrays.sort(listaEmpleados);
        System.out.println("Empleados y sus salarios");
        System.out.println(Arrays.toString(listaEmpleados));
	}

}
