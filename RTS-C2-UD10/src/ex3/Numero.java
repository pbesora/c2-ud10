package ex3;

public class Numero {
	
	public static boolean esPar(){
		
		int numAleatorio = (int)(Math.random()*10+0);
		System.out.println("El número aleatorio generado es: " +numAleatorio);
		
	    if (numAleatorio % 2 == 0) {
	       //Es par
	        return true;
	    } else {
	    	//Es impar
	        return false;
	    }
	}
}
