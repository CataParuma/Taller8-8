import java.util.Scanner;

public class Operaciones {

	private int[][] arreglo1 = new int[2][2], arreglo2 = new int[2][2];
	Scanner sc = new Scanner(System.in);
	private int operacion;

	public void menuOperaciones() {

		do {

			System.out.println("Ingresa lo que desees hacer: " + "\n1.Llenar arreglo A \n2.Llenar arreglo B "
					+ "\n3.Suma \n4.Resta \n5.Multiplicacion \n6.Salir");

			operacion = sc.nextInt();

			switch (operacion) {
			case 1:
				leerNumeroA();
				break;

			case 2:
				leerNumeroB();
				break;

			case 3:
				suma();
				break;

			case 4:
				resta();
				break;

			case 5:
				multiplicacion();
				break;

			case 6:
				System.out.println("Bye, bye ~");
				break;

			default:
				break;
			}

		} while (operacion < 6);
	}

	public void leerNumeroA() {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("Digita el numero de la posición [" + i + "][" + j + "]");
				arreglo1[i][j] = sc.nextInt();
			}
		}

	}

	public void leerNumeroB() {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("Digita el numero de la posición [" + i + "][" + j + "]");
				arreglo2[i][j] = sc.nextInt();
			}
		}
	}

	public void suma() {

		System.out.println("Resultado suma:\n");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				int sum = arreglo1[i][j] + arreglo2[i][j];

				System.out.println(sum + " ");

			}

			System.out.println("\n");
		}

	}

	public void resta() {

		System.out.println("Resultado resta:\n");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				int res = arreglo1[i][j] - arreglo2[i][j];

				System.out.println(res + " ");

			}

			System.out.println("\n");
		}

	}

	public void multiplicacion() {

		System.out.println("Resultado multiplicación:\n");
		int[][] mul = {{arreglo1[0][0] * arreglo2[0][0] + arreglo1[0][1] * arreglo2[1][0],
						arreglo1[0][0] * arreglo2[0][1] + arreglo1[0][1] * arreglo2[1][1] },
				       {arreglo1[1][0] * arreglo2[0][0] + arreglo1[1][1] * arreglo2[1][0],
					  arreglo1[1][0] * arreglo2[0][1] + arreglo1[1][1] * arreglo2[1][1] } };

		System.out.println("Resultado multiplicación:\n");
		for (int i = 0; i < mul.length; i++) {

			for (int j = 0; j < mul.length; j++) {

				System.out.println(mul[i][j] + " ");
			}
			System.out.println("\n");
		}

	}
}
