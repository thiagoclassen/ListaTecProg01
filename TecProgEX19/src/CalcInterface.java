import java.util.Scanner;

public class CalcInterface {

	public double recebeOperando(int i) {
		int opn;

		Scanner input = new Scanner(System.in);
		opn = input.nextInt();
		input.close();

		return opn;
	}

	public char recebeOperacao() {
		char opr;

		Scanner input = new Scanner(System.in);
		opr = input.next(".").charAt(0);
		input.close();

		return opr;
	}

	public void mostraResultado(double res) {

	}

}
