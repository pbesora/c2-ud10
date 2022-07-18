package ex4Operaciones;

import javax.swing.JOptionPane;

public class Operaciones {
		
	private Double resultado = 0.0; 
	
	public void suma(Double a, Double b) {
		a = PedirNum.getNum1() ;
		b = PedirNum.getNum2();
		resultado = a + b;
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public void resta(Double a, Double b) {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = a - b;
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public void multiplicacion(Double a, Double b) {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = a * b;
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public void potencia(Double a, Double b) {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = Math.pow(a, b);
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public void raizCuadrada(Double a, Double b) { //try cacth a la hora de poner un num negativo
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = Math.sqrt(a);
		
		JOptionPane.showMessageDialog(null, resultado);
	}
	
	public void raizCubica(Double a, Double b) {
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = Math.cbrt(a);
		
		JOptionPane.showMessageDialog(null, resultado);
	}

	public void division(Double a, Double b) {//try catch al dividir por 0
		a = PedirNum.getNum1();
		b = PedirNum.getNum2();
		resultado = a / b;
		
		JOptionPane.showMessageDialog(null, resultado);
	}

}
