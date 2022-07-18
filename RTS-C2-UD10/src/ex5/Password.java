package ex5;

public class Password {
	private int longitud;
	private int contraseña;

	private final int LONGITUD_D = 8;

	//Constructor por defecto
	public Password() {
		this.longitud = LONGITUD_D;
		this.contraseña = 0;
	}

	//Constructor pasado por parámetro
	public Password(int longitud, int contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}


	/* Método esFuerte
	 * Devuelve un booleano si es fuerte o no
	 */
	public void esFuerte() {

	}

	/* Método generarPassword
	 * Genera la contraseña del objeto con la longitud que tenga
	 */
	public void generarPassword() {

	}

	// GETTERS Y SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}
}
