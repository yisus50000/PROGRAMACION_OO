package deber.grupal;

public class ImpresoraHotel {
	
      public String color;
      
      public ImpresoraHotel() {
      }
        void Reserva(String nombre1, String apellidos1, String cedula1, String VN, int dias, int costo) {
          System.out.println("****** HOTEL CUTEHOUSE*******");
          System.out.println("Nombre: " + nombre1);
      	  System.out.println("Apellido: " + apellidos1);
      	  System.out.println("Cedula: " + cedula1);
      	  System.out.println("Tipo de reserva: " + VN);
      	  System.out.println("Dias de estadia: " + dias + " días");
      	  System.out.println("Costo de su estadia: " + costo +"$");
      	  System.out.println("****** Buen precio y comodidad en un solo lugar *******");
      	  System.out.println("****** Disfrute su estadia *******");
      	  System.out.println("****** recuerde traer sus elementos de bioseguridad *******");
}
}
