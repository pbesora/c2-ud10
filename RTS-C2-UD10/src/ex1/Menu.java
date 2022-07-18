package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Clase Menu
 * Contiene informacion de un menu
 * @author Bárbara, Pau, Oriol
 *
 */

public class Menu {
	/* Atributos */
	private int randomValue;
	private boolean loop = true;

	/** Método generarValor
	 * Genera un número aleatorio entre 1 y 500
	 */
	private void generarValor() {
		randomValue = (int) (Math.random()*500 + 1);
	}

	/** Método comprobarValor
	 * Comprueba si el valor es un número entero y verifica si es mayor, menor o igual al número aleatorio
	 * @param valor
	 */
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

	/** Método pedirValor
	 * Devuelve un número dado por el usuario
	 * @param sc
	 * @return
	 */
	public String pedirValor(Scanner sc) {
		System.out.println("Introduce un número entre el 1 y el 500.");
		String num = sc.next();
		return num;
	}

	/**	Método lanzarMenu
	 * Genera un menú con diferentes opciones
	 */
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
