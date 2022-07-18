package ex4;

import java.util.Scanner;

public class Operacion {
	private int operador; // 1-suma 2-resta 3-multiplicacion 4-potencia 5-raizCuandrada 6-raizCubica0 7-division
	
	//variables
	private Double a= 0.0;
	private Double b= 0.0;
	private Double resultado = 0.0; 
	private boolean loop = true;
	Scanner sc = new Scanner(System.in);
	
	//metodos
	private Double getNum1() {
		System.out.println("Introduce el primer número para realizar la operación:");
		a = (double) sc.nextInt();
	
		return a;
	}
	
	private Double getNum2() {
		System.out.println("Introduce el segundo número para realizar la operación:");
		b = (double) sc.nextInt();
		
		return b;
	}
	
	private void suma(Double a, Double b) {
		a = getNum1();
		b = getNum2();
		resultado = a + b;
		
		System.out.println("El resultado es: " +resultado);
	}

	private void resta(Double a, Double b) {
		a = getNum1();
		b = getNum2();
		resultado = a - b;
		
		System.out.println("El resultado es: " +resultado);
	}

	private void multiplicacion(Double a, Double b) {
		a = getNum1();
		b = getNum2();
		resultado = a * b;
		
		System.out.println("El resultado es: " +resultado);
	}

	private void potencia(Double a, Double b) {
		a = getNum1();
		b = getNum2();
		resultado = Math.pow(a, b);
		
		System.out.println("El resultado es: " +resultado );
	}

	private void raizCuadrada(Double a, Double b) {
		a = getNum1();
		b = getNum2();
		resultado = Math.sqrt(a);
		
		System.out.println("El resultado es: " +resultado);
	}

	private void raizCubica(Double a, Double b) {
		a = getNum1();
		b = getNum2();
		resultado = Math.cbrt(a);
		
		System.out.println("El resultado es: " +resultado);
	}

	private void division(Double a, Double b) {
		a = getNum1();
		b = getNum2();
		resultado = a / b;
		
		System.out.println("El resultado es: " +resultado);
	}
	
	public void mostrarMenu() {
		int opcion;
		
		do {
			System.out.println("Operación a realizar:");
			
			System.out.println("1->Suma \n2->Resta \n3->Multiplicación \n4->Potencia"
					+ "\n5->Raíz Cuadrada \n6->Raíz Cúbica \n7->División \n8->Salir");
			opcion = sc.nextInt();
			switch (opcion) {
				case 1:
					suma(a,b);
					break;
				case 2:
					resta(a,b);
					break;
				case 3:
					multiplicacion(a,b);
					break;
				case 4:
					potencia(a,b);
					break;
				case 5:
					raizCuadrada(a,b);
					break;
				case 6:
					raizCubica(a,b);
					break;
				case 7:
					division(a,b);
					break;
				case 8:
					loop = false;
					break;
				default:
					System.out.println("El número introducido tiene que ser entre el 1 y 8");
					break;
				}
			}while(loop);
			sc.close();
	}
}
