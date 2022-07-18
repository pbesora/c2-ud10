package ex5;

import java.security.SecureRandom;
import java.util.Scanner;

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
		this.contraseña = "";
	}

	/**
	 * Constructor con 2 parametros
	 * @param longitud
	 * @param contraseña
	 */
	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
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
	public void generarPassword() {
		/*Scanner sc = new Scanner(System.in);
	        //Creamos la variable chars para tener todos los valores que pueda tener la contraseña
	        final String chars = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";

	        SecureRandom random = new SecureRandom();
	        StringBuilder contraseña = new StringBuilder();

	        //Pedimos el rango que queremos que tenga la contraseña
	        System.out.println("Introduce la longitud de la contraseña:");
	        int longi = sc.nextInt();

	        //Cada interacción del bucle elige aleatoriamente un carácter, y lo agrega a la instancia "StringBuilder"
	        for(int i=0; i<longi; i++) {
	            int randomIndex = random.nextInt(chars.length());
	            contraseña.append(chars.charAt(randomIndex));
	        }
	        this.contraseña = contraseña;*/
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

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
