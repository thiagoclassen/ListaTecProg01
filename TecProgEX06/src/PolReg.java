
public class PolReg {

	private int lados;
	private double size;

	public PolReg(int lados, double size) {
		this.lados = lados;
		this.size = size;
	}

	public double perimetro() {
		return (double) this.lados * this.size;
	}

	public int angulo() {
		return (180 * (this.lados - 2)) / this.lados;
	}

	public int area() {
		return 0;
	}

}
