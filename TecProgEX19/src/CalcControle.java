
public class CalcControle {

	private CalcDados calcDados;
	private CalcInterface calcInterface;

	public CalcControle(CalcDados calcDados, CalcInterface calcInterface) {
		this.calcDados = calcDados;
		this.calcInterface = calcInterface;
	}

	public void executar() {
		calcDados.setOperando(1, calcInterface.recebeOperando(1));
		calcDados.setOperando(2, calcInterface.recebeOperando(2));
		calcDados.setOperacao(calcInterface.recebeOperacao());

		calcInterface
				.mostraResultado(operar(calcDados.getOperando(1), calcDados.getOperando(2), calcDados.getOperacao()));
	}

	public double operar(double opn1, double opn2, char op) {
		double result;

		switch (op) {
		case '-':
			result = calcDados.getOperando(1) - calcDados.getOperando(2);
			break;
		case '+':
			result = calcDados.getOperando(1) + calcDados.getOperando(2);
			break;
		case '*':
			result = calcDados.getOperando(1) * calcDados.getOperando(2);
			break;
		case '/':
			result = calcDados.getOperando(1) / calcDados.getOperando(2);
			break;
		default:
			result = 0;
		}

		return result;
	}

}
