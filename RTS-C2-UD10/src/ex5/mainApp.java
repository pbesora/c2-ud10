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
		int caracteres = Integer.parseInt (numCarcaters );

		Boolean [] arrayEsFuerte = new Boolean[contraseñas];

		for (int i=0; i<arrayContraseñas.length; i++) {
			for (int y=0; y<arrayEsFuerte.length; y++) {	
			arrayContraseñas[i] = password.generarPassword(caracteres);
			arrayEsFuerte[y] = password.esFuerte();
						
			JOptionPane.showMessageDialog(null, "la contraseña " +i+ " es " +arrayContraseñas[i]+ " es fuerte " +arrayEsFuerte[y]);
			i++;
			}
		}
			}
		}

