package ex4Operaciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PedirNum {
	/**
	 * Clase PedirNum
	 * Contiene informacion de números
	 * @author Bárbara, Pau, Oriol
	 *
	 */
	
	
	/** Método getNum1
	 * Recoge el número dado por el usuario y lo devuelve
	 * @return
	 */
	public static Double getNum1() {
		String  lectura = JOptionPane.showInputDialog ( null, "Introduce el primer número para realizar la operación:");
		double a = Double.parseDouble(lectura );
	
		return a;
	}
	
	/** Método getNum2
	 * Recoge el número dado por el usuario y lo devuelve
	 * @return
	 */
	public static Double getNum2() {
		String  lectura = JOptionPane.showInputDialog ( null, "Introduce el segundo número para realizar la operación:");
		double b = Double.parseDouble(lectura );
		
		return b;	
	}
}
