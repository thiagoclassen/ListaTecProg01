
public class Principal {

	public static void main(String[] args) {
		CalcDados calcDados = new CalcDados();
		CalcInterface calcInterface = new CalcInterface();
		CalcControle calcControle = new CalcControle(calcDados, calcInterface);
		calcControle.executar();
	}

}
