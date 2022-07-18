package ex1;

/**
 * Clase Persona
 * Contiene información de una Persona
 * @author Bárbara, Pau, Oriol
 *
 */
public class Usuario {

	/**ATRIBUTOS**/
	private String nombre;
	private int numIntentos;

	/**CONSTRUCTORES**/

	//Constructor por defecto
	public Usuario() {
		this.nombre = nombre;
		this.numIntentos = numIntentos;
	}
	
	/**
	 * Constructor con 2 parametros
	 * @param nombre
	 * @param numIntentos
	 */
	public Usuario(String nombre, int numIntentos) {
		this.nombre = nombre;
		this.numIntentos = numIntentos;
	}
	
	/**GETTERS**/
	public int getNumIntentos() {
		return numIntentos;
	}

}
