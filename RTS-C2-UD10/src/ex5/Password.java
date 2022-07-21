package ex5;


public class Password {
	/**
	 * Clase Password
	 * Contiene información de un Password
	 * @author Bárbara, Pau, Oriol
	 *
	 */
	private int longitud;
	private String contraseña;

	private final int LONGITUD_D = 8;

	//Constructor por defecto
	public Password() {
		this.longitud = LONGITUD_D;
		generarPassword(LONGITUD_D);
	}

	/**
	 * Constructor con 1 parametro
	 * @param longitud
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		generarPassword(longitud);
	}


	/** Método esFuerte
	 * Devuelve un booleano si es fuerte o no
	 * @return
	 */
	public boolean esFuerte() {
		int cMayus = 0;
		int cMinus = 0;
		int cNum = 0;

		for(int i = 0; i < this.longitud; i++) {
			char caracter = contraseña.charAt(i);

			if(caracter >= 65 && caracter<=90) {
				cMayus++;
			} else if(caracter >= 97 && caracter <=122) {
				cMinus++;
			} else if (caracter >= 48 && caracter <= 57) {
				cNum++;
			}
		}
		if(cMayus >= 2 && cMinus >= 1 && cNum >= 5) {
			return true;
		} else {
			return false;
		}
		
	}

	/* Método generarPassword
	 * Genera la contraseña del objeto con la longitud que tenga
	 */
	public void generarPassword(int longitud) {
		//Creamos la variable chars para tener todos los valores que pueda tener la contraseña
		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minus = mayus.toLowerCase();
		String nums = "1234567890";
		String alfanum = mayus + minus + nums;
		char caracteres[] = alfanum.toCharArray();
		String pass = "";
		int random;
		
		//Cada interacción del bucle elige aleatoriamente un carácter
		for(int i=0; i<longitud; i++) {
			random = (int) ((caracteres.length) * Math.random());
			pass += caracteres[random];
		}

		this.contraseña = pass;
	}

	// GETTERS Y SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}
}
