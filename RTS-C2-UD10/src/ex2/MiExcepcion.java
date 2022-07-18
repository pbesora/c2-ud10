package ex2;

public class MiExcepcion extends Exception {
	/**
	 * Clase MiExcepcion
	 * Es hijo de Exception
	 * @author Bárbara, Pau, Oriol
	 *
	 */
	private String mensaje;
	
	
	//Contructores
	public MiExcepcion() {
		super();
		this.mensaje = "Esto es un objeto Exception";
	}
	
	public MiExcepcion(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	//Método que devuelve el mensaje
	@Override
	public String getMessage() {
		
		return mensaje;
		
	}
}
