package ex4Operaciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PedirNum {

	
	public static Double getNum1() {
		String  lectura = JOptionPane.showInputDialog ( null, "Introduce el primer número para realizar la operación:");
		double a = Double.parseDouble(lectura );
	
		return a;
	}
	
	public static Double getNum2() {
		String  lectura = JOptionPane.showInputDialog ( null, "Introduce el segundo número para realizar la operación:");
		double b = Double.parseDouble(lectura );
		
		return b;	
	}
}
