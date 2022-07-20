package ex5;

import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  lectura = JOptionPane.showInputDialog ( null , "Introduce el número"
				+ " de caracteres para crear la contraseña");
		int i = Integer.parseInt ( lectura );
		
		JOptionPane.showMessageDialog(null,"El número de caracteres que tendra la contraseña es: " +lectura);
		Password [] array = new Password[i];
		
		Password password = new Password();
		password.generarPassword(0);
		
		

	}

}
