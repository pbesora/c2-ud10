package ex3;

import ex2.MiExcepcion;

public class Numero {
	/**
	 * Clase Numero
	 * Genera un número aleatorio y comprueba si es par o impar
	 * @author Bárbara, Pau, Oriol
	 *
	 */
	
	/** Método esPar
	 * Comprueba si el número generado es par o impar
	 * @param num
	 * @return
	 */
	public static boolean esPar(int num){
		
		
		System.out.println("El número aleatorio generado es: " +num);
		
	    if (num % 2 == 0) {
	       //Es par
	        return true;
	    } else {
	    	//Es impar
	        return false;
	    }
	}
	
	/* Método lanzarNumero
	 * Genera un número aleaatorio entre el 10 y el 0
	 * Comprueba con el otro método y genera una Excepción
	 */
	public void lanzarNumero() throws MiExcepcion {
		int numAleatorio = (int)(Math.random()*10+0);
		if(esPar(numAleatorio)) {
			throw new MiExcepcion("Es par.");
		}else {
			throw new MiExcepcion("Es impar.");
		}
	}
	
}
