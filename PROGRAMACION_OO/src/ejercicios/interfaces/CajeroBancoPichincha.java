package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz {


	public void solicitarTarjeta(String numero) {
		System.out.println("Se valida la tarjeta");
		
	}

	public void solicitarClave(String clave) {
		System.out.println("Se valida la clave");
		
	}
	
	public void solicitarTipoTransaccion() {
		System.out.println("Se solicita que tipo de transaccion desea el usuario");
		
	}
	
	public void solicitarMonto(int monto) {
		System.out.println("Se solicita la cantidad a retirar");
		
	}

	public void validarSaldo() {
		System.out.println("Se valida el saldo actual del usuario");
		System.out.println("restamos el saldo con el monto");
		
	}
	
	public void entregarDinero() {
		System.out.println("Se da el monto deseado por el usuario");
		
	}
	
	public void realizarLaTransaccion() {
		System.out.println("Se realiza la transaccion del dinero");
		
	}

	public void entregarRecibo() {
		System.out.println("Se le da un recibo al usuario detallando la transaccion");
		
		
	}

}
