package ex2;

public class MiExcepcion extends Exception {
	//mensaje de error
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
	
	@Override
	public String getMessage() {
		
		return mensaje;
		
	}
}
