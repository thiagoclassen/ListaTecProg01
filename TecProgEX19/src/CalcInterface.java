import java.io.BufferedInputStream;
import java.io.InputStream;
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
		opr = (char)input.next();
		input.close();

		return opn;
	}

	public void mostraResultado(double res) {

	}

}
