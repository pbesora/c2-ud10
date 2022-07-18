package ex3;

public class mainApp {

	public static void main(String[] args) {
		Numero numero = new Numero();		
		try {
			numero.lanzarNumero();
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
