package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Menu {

	private int randomValue;

	private void lanzarError()  throws InputMismatchException {

	}

	private void generarValor() {
		randomValue = (int) (Math.random()*500 + 1);
	}

	private void comprobarValor(String valor) {
		try {
			if(!valor.matches("[0-9]+")) {
				lanzarError();
			} 
			int num = Integer.parseInt(valor);

			if(num > this.randomValue) {
				System.out.println("El número escogido es mayor al número generado.");
			} else if(num < this.randomValue) {
				System.out.println("El número escogido es menor al número generado.");

			} else if(num == this.randomValue) {
				System.out.println("Felicidades, has acertado el número.");

			}

		} catch(InputMismatchException e) {
		}

	}

	public String pedirValor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entre el 1 y el 500.");
		String num = sc.nextLine();
		sc.close();
		return num;
	}


	public void lanzarMenu() {
		generarValor();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido/a, ¿qué quieres hacer?");
		System.out.println("1)Escribir un número. \n2)Número de intentos \n3)Salir.");
		int opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			String valor = pedirValor();
			comprobarValor(valor);
			break;
		case 2:
			System.out.println();
			break;
		case 3:
			break;
		}
	}
}
