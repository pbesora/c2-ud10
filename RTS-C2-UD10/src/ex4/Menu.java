package ex4;

import javax.swing.JOptionPane;

import ex4Operaciones.Operaciones;

public class Menu {
	
	//variables
	private Double a= 0.0;
	private Double b= 0.0;
	private boolean loop = true;

	public void mostrarMenu() {
		Operaciones operar = new Operaciones();
		do {
			
			String  lectura = JOptionPane.showInputDialog ( null , "\nElija la opción:\n1->Suma" +
					"\n2->Resta\n3->Multiplicación\n" +
					"4->Potencia\n5->Raíz Cuadrada \n6->Raíz Cúbica"
					+ "\n7->Divisón \n8-> Salir" );
			try {
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
					operar.raizCuadrada(a);
					break;
				case 6:
					operar.raizCubica(a);
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
			}catch(Exception e){
				System.out.println("");
			}
			}while(loop);
		}
}
