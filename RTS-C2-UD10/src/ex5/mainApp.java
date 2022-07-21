package ex5;

import javax.swing.JOptionPane;

import ex2.MiExcepcion;

public class mainApp {

	public static void main(String[] args) {

		int numContraseñas;
		try {
			numContraseñas = leerNumPasswords();
			Password arrayContraseñas[] = new Password[numContraseñas];

			int longitud = leerLongitud();
			Boolean [] arrayEsFuerte = new Boolean[numContraseñas];
			
			mostrarResultado(arrayContraseñas, arrayEsFuerte, longitud);
			
		} catch (MiExcepcion e) {
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		
	}
	
	//Pide el numero de contraseñas
	private static int leerNumPasswords() throws MiExcepcion {		
		String  lectura = JOptionPane.showInputDialog ( null , "Indica cuantas contraseñas quieres crear:");
		int numContraseñas=0;
		
		if(lectura.matches("[0-9]+"))
			numContraseñas = Integer.parseInt ( lectura );
		else
			throw new MiExcepcion("El valor introducido no es valido.");
		
		return numContraseñas;
		
	}
	
	//Pide la longitud de las contraseñas
	private static int leerLongitud() throws MiExcepcion {			
		String numCaracters = JOptionPane.showInputDialog(null,"El número de caracteres que tendra la contraseña es: ");
		int longitud=0;
		
		if(numCaracters.matches("[0-9]+"))
			longitud = Integer.parseInt (numCaracters );
		else
			throw new MiExcepcion("La longitud de la contraseña no es valida.");
		
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

