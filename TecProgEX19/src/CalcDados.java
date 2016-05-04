
public class CalcDados {

	private double opn1;
	private double opn2;
	private char op;

	public void setOperando(int i, double valor) {
		if (i == 1) {
			this.opn1 = valor;
		} else {
			this.opn2 = valor;
		}
	}

	public double getOperando(int i) {
		double opn;

		if (i == 1) {
			opn = this.opn1;
		} else {
			opn = this.opn2;
		}

		return opn;
	}

	public void setOperacao(char op) {
		this.op = op;
	}

	public char getOperacao() {
		return this.op;
	}
}
