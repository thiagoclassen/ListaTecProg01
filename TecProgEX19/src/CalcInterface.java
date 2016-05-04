import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcInterface {

	public double recebeOperando(int i) {
		double opn;

		Scanner input = new Scanner(System.in);

		do {
			try {
				System.out.println("entre com o operando " + i + ": ");

				opn = input.nextDouble();
			} catch (InputMismatchException e) {
				opn = -1;
			}
		} while (opn == -1);

		return opn;
	}

	public char recebeOperacao() throws InputMismatchException {
		char opr;

		Scanner input = new Scanner(System.in);

		do {
			try {

				System.out.println("entre com a operacao desejada(+, -, /, *) ou digite 's' para sair: ");
				opr = input.next("[Ss+-/*]").charAt(0);

				if (Character.toLowerCase(opr) == 's') {
					System.out.println("Saindo...");
					System.exit(0);
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada invalida...");
				opr = 'E';
			}
		} while (opr == 'E');
		
		return opr;
	}

	public void mostraResultado(double res) {

		System.out.println("resultado: " + res);

	}

}
