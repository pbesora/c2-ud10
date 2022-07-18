package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	private int randomValue;
	private boolean loop = true;

	private void generarValor() {
		randomValue = (int) (Math.random()*500 + 1);
	}

	private void comprobarValor(String valor) {
		int num;
		if(valor.matches("[0-9]+")) {
			num = Integer.parseInt(valor);

			if(num > this.randomValue) {
				System.out.println("El número escogido es mayor al número generado.");
			} else if(num < this.randomValue) {
				System.out.println("El número escogido es menor al número generado.");

			} else if(num == this.randomValue) {
				System.out.println("Felicidades, has acertado el número.");
				loop = false;
			}
		}else {
			throw new InputMismatchException();
		}
	}

	public String pedirValor(Scanner sc) {
		System.out.println("Introduce un número entre el 1 y el 500.");
		String num = sc.next();
		return num;
	}


	public void lanzarMenu() {
		generarValor();
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
		System.out.println("\nBienvenido/a, ¿qué quieres hacer?");
		System.out.println("1)Escribir un número. \n2)Número de intentos \n3)Salir.");
		opcion = sc.nextInt();
		switch(opcion) {
		case 1:
			try {
				comprobarValor(pedirValor(sc));
			}catch(InputMismatchException e){
				System.out.println(e + " : El valor introducido no es válido.");
			}
			break;
		case 2:
			System.out.println();
			break;
		case 3:
			loop = false;
			break;
		default:
			break;
		}
		}while(loop);
		sc.close();
	}
}
