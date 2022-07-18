package ex4;

import java.util.Scanner;

import javax.swing.JOptionPane;

import ex4Operaciones.Operaciones;

public class Menu {
	private int operador; // 1-suma 2-resta 3-multiplicacion 4-potencia 5-raizCuandrada 6-raizCubica0 7-division
	
	//variables
	private Double a= 0.0;
	private Double b= 0.0;
	//private Double resultado = 0.0; 
	private boolean loop = true;
	
	
	//metodos
//	public Double getNum1() {
//		System.out.println("Introduce el primer número para realizar la operación:");
//		a = (double) sc.nextInt();
//	
//		return a;
//	}
//	
//	public Double getNum2() {
//		System.out.println("Introduce el segundo número para realizar la operación:");
//		b = (double) sc.nextInt();
//		
//		return b;
//	}
	
//	private void suma(Double a, Double b) {
//		a = getNum1();
//		b = getNum2();
//		resultado = a + b;
//		
//		System.out.println("El resultado es: " +resultado);
//	}

//	private void resta(Double a, Double b) {
//		a = getNum1();
//		b = getNum2();
//		resultado = a - b;
//		
//		System.out.println("El resultado es: " +resultado);
//	}

//	private void multiplicacion(Double a, Double b) {
//		a = getNum1();
//		b = getNum2();
//		resultado = a * b;
//		
//		System.out.println("El resultado es: " +resultado);
//	}

//	private void potencia(Double a, Double b) {
//		a = getNum1();
//		b = getNum2();
//		resultado = Math.pow(a, b);
//		
//		System.out.println("El resultado es: " +resultado );
//	}

//	private void raizCuadrada(Double a, Double b) { //try cacth a la hora de poner un num negativo
//		a = getNum1();
//		b = getNum2();
//		resultado = Math.sqrt(a);
//		
//		System.out.println("El resultado es: " +resultado);
//	}

//	private void raizCubica(Double a, Double b) {
//		a = getNum1();
//		b = getNum2();
//		resultado = Math.cbrt(a);
//		
//		System.out.println("El resultado es: " +resultado);
//	}
//
//	private void division(Double a, Double b) {//try catch al dividir por 0
//		a = getNum1();
//		b = getNum2();
//		resultado = a / b;
//		
//		System.out.println("El resultado es: " +resultado);
//	}
//	
	public void mostrarMenu() {
		Operaciones operar = new Operaciones();
		do {
			
			String  lectura = JOptionPane.showInputDialog ( null , "\nElija la opción:\n1->Suma" +
					"\n2->Resta\n3->Multiplicación\n" +
					"4->Potencia\n5->Raíz Cuadrada \n6->Raíz Cúbica"
					+ "\n7->Divisón \n8-> Salir" );
			int opcion = Integer.parseInt ( lectura );
			
			switch (opcion) {
				case 1:					
					operar.suma(a, b);
					break;
				case 2:
					operar.resta(a,b);
					break;
				case 3:
					operar.multiplicacion(a,b);
					break;
				case 4:
					operar.potencia(a,b);
					break;
				case 5:
					operar.raizCuadrada(a,b);
					break;
				case 6:
					operar.raizCubica(a,b);
					break;
				case 7:
					operar.division(a,b);
					break;
				case 8:
					loop = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "El número a introducir tiene que ser entre 1 y 8");
					break;
				}
			}while(loop);
		}
}
