package ex4Operaciones;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Operaciones {
		
	private Double resultado = 0.0; 
	
	public void suma(Double a, Double b) {
		a = PedirNum.getNum1() ;
		b = PedirNum.getNum2();
		resultado = a + b;
		
		JOptionPane.showMessageDialog(null, a + " + " + b + " = " + resultado);
	}
	
	public void resta(Double a, Double b) {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = a - b;
		
		JOptionPane.showMessageDialog(null, a + " - " + b + " = " + resultado);
	}
	
	public void multiplicacion(Double a, Double b) {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = a * b;
		
		JOptionPane.showMessageDialog(null, a + " * " + b + " = " + resultado);
	}
	
	public void potencia(Double a, Double b) {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = Math.pow(a, b);
		
		JOptionPane.showMessageDialog(null, a + " ^ " + b + " = " + resultado);
	}
	
	public void raizCuadrada(Double a) { //try cacth a la hora de poner un num negativo
		try {
		a = PedirNum.getNum1();
		resultado = Math.sqrt(a);
		
		JOptionPane.showMessageDialog(null, "Raiz cuadrada de " + a + " = " + resultado);
		} catch(InputMismatchException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void raizCubica(Double a) {
		a = PedirNum.getNum1();
		resultado = Math.cbrt(a);
		
		JOptionPane.showMessageDialog(null, "Raiz cúbica de " + a + " = " + resultado);
	}

	public void division(Double a, Double b) {//try catch al dividir por 0
		try {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = a / b;
		
		JOptionPane.showMessageDialog(null, a + " / " + b + " = " + resultado);
		} catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
