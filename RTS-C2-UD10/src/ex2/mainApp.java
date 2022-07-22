package ex2;

public class mainApp {

	public static void main(String[] args) {
		
		try {
			System.out.println("Mensaje mostrado por pantalla.");
			throw new MiExcepcion("Excepción capturada con mensaje: Esto es un objeto Exception");
			
		}catch(MiExcepcion ex) {
			System.out.println(ex.getMessage());
			System.out.println("Programa terminado.");
		}
	}

}
