package ex4;

import java.util.Scanner;

public class Operacion {
	private int operador; // 1-suma 2-resta 3-multiplicacion 4-potencia 5-raizCuandrada 6-raizCubica0 7-division
	

	private void suma(Scanner sc) {
		Double a = 0.0, b = 0.0, resultado;

		resultado = a + b;
		
		System.out.println(resultado);
	}

	private void resta(Scanner sc) {
		Double a = 0.0, b = 0.0, resultado;

		resultado = a - b;
		
		System.out.println(resultado);
	}

	private void multiplicacion(Scanner sc) {
		Double a = 0.0, b = 0.0, resultado;

		resultado = a * b;
		
		System.out.println(resultado);
	}

	private void potencia(Scanner sc) {
		Double a = 0.0, b = 0.0, resultado;

		resultado = Math.pow(a, b);
		
		System.out.println(resultado);
	}

	private void raizCuadrada(Scanner sc) {
		Double a = 0.0, resultado;

		resultado = Math.sqrt(a);
	}

	private void raizCubica(Scanner sc) {
		Double a = 0.0, resultado;

		resultado = Math.cbrt(a);
	}

	private void division(Scanner sc) {
		Double a = 0.0, b = 0.0, resultado;
		
		resultado = a / b;
		
		System.out.println(resultado);

	}
	
	private void mostrarMenu() {
		System.out.println("Operación a realizar:");
		System.out.println("\t1-Suma");
		System.out.println("\t2-Resta");
		System.out.println("\t3-Multiplicación");
		System.out.println("\t4-Potencia");
		System.out.println("\t5-Raíz Cuadrada");
		System.out.println("\t6-Raíz Cúbica");
		System.out.println("\t7-División");
		System.out.println("\t8-Salir");
	}
	
	public void lanzarOperacion() {
		
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
	}
}
