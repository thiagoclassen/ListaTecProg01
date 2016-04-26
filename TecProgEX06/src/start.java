import java.util.Scanner;

public class start {

	public static void main(String[] args) {

		int lados;
		double size;

		Scanner s = new Scanner(System.in);

		System.out.println("Qual o nr de lados e o tamanho do poligono regular?\n");

		lados = s.nextInt();
		size = s.nextDouble();

		PolReg pol = new PolReg(lados, size);

		System.out.println(
				"O angulo é: " + pol.angulo() + ", a area é: " + pol.area() + ", o perimetro é:" + pol.perimetro());
		
		s.close();

	}

}
