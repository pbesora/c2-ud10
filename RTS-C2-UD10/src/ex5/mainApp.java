package ex5;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {

		int numContraseñas = leerNumPasswords();
		Password arrayContraseñas[] = new Password[numContraseñas];

		int longitud = leerLongitud();
		Boolean [] arrayEsFuerte = new Boolean[numContraseñas];
		
		mostrarResultado(arrayContraseñas, arrayEsFuerte, longitud);
	}
	
	//Pide el numero de contraseñas
	private static int leerNumPasswords() {		
		String  lectura = JOptionPane.showInputDialog ( null , "Indica cuantas contraseñas quieres crear");
		int numContraseñas = Integer.parseInt ( lectura );
		
		return numContraseñas;
		
	}
	
	//Pide la longitud de las contraseñas
	private static int leerLongitud() {			
		String numCarcaters = JOptionPane.showInputDialog(null,"El número de caracteres que tendra la contraseña es: ");
		int longitud = Integer.parseInt (numCarcaters );
		
		return longitud;
	}
	
	//Muestra por pantalla el resultado del programa
	private static void mostrarResultado(Password[] passwords, Boolean[] esFuerte, int longitud) {		
		String mensaje="";
		
		for (int i=0; i<passwords.length; i++) {	
			passwords[i] = new Password(longitud);

			esFuerte[i] = passwords[i].esFuerte();
			
			mensaje += passwords[i].getContraseña() + " " + esFuerte[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
}

