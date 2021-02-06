package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import operadores.Division;
import operadores.Multiplicacion;
import operadores.Resta;
import operadores.Suma;

public class principal {

	public static void menu() {

		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
	}

	public static String operar(int operacion, float n1, float n2) {
		double result = 0;
		switch (operacion) {
		case 1:
			Suma s = new Suma();
			result = s.sumar(n1, n2);
			break;

		case 2:
			Resta r = new Resta();
			result = r.restar(n1, n2);
			break;

		case 3:
			Multiplicacion m = new Multiplicacion();
			result = m.multiplicar(n1, n2);
			break;

		case 4:
			Division d = new Division();
			result = d.dividir(n1, n2);
			break;
		default:
			System.out.print("ingrese una opcion");
			break;
		}

		return "el resultado es :\t " + result;

	}

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			float n1;
			float n2;
			int opc;

			while (true) {
				System.out.print("CALCULADORA SENCILLA PARA 2 NUMEROS\n");
				System.out.print("***********************************\n");
				menu();
				System.out.print("ingrese una opcion \t");

				opc = entrada.nextInt();
				System.out.print("Primer numero: \t");
				try {
					n1 = entrada.nextFloat();
					System.out.print("Segundo numero: \t");
					n2 = entrada.nextFloat();
					System.out.print(operar(opc, n1, n2) + "\n\n\n");
				} catch (InputMismatchException e) {
					System.out.print("ingrese numeros!\n\n\n");

				}
			}
		}catch (Exception e) {
			System.out.print("no ingrese letras\n");
		}

	}

}
