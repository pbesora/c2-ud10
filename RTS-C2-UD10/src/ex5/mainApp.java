package ex5;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contraseña;

		Password password = new Password();

		String  lectura = JOptionPane.showInputDialog ( null , "Indica cuantas contraseñas quieres crear");
		int contraseñas = Integer.parseInt ( lectura );

		String arrayContraseñas[] = new String [contraseñas];

		String numCarcaters = JOptionPane.showInputDialog(null,"El número de caracteres que tendra la contraseña es: ");
		int longitud = Integer.parseInt (numCarcaters );

		Boolean [] arrayEsFuerte = new Boolean[contraseñas];

		for (int i=0; i<arrayContraseñas.length; i++) {	
			arrayContraseñas[i] = password.generarPassword(longitud);

			for (int z=0; z<arrayEsFuerte.length; z++) {

				arrayEsFuerte[z]= password.esFuerte();

				JOptionPane.showMessageDialog(null, "la contraseña " +i+ " es " +password.getContraseña()+ " es fuerte " +arrayEsFuerte[z]);
				i++;
			}
		}
	}
}

