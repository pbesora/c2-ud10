package ex3;

import ex2.MiExcepcion;

public class Numero {
	
	
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
	
	public void lanzarNumero() throws MiExcepcion {
		int numAleatorio = (int)(Math.random()*10+0);
		if(esPar(numAleatorio)) {
			throw new MiExcepcion("Es par.");
		}else {
			throw new MiExcepcion("Es impar.");
		}
	}
	
}
