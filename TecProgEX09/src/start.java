import java.util.Scanner;

public class start {

	public static void main(String[] args) {

		String nome = new String();
		String vinculo = new String();

		Scanner s = new Scanner(System.in);

		System.out.println("Entre com o nome e vinculo do primeiro Colaborador: \n");

		nome = s.nextLine();
		vinculo = s.nextLine();

		Colaborador a = new Colaborador(nome, vinculo);
		
		System.out.println("Entre com o valor das Horas do primeiro Colaborador: \n");
		a.setValorHora(s.nextFloat());
		
		System.out.println("Entre com o total de Horas do primeiro Colaborador: \n");
		a.setHoras(s.nextFloat());
		
		System.out.println("Entre com o tempo de trabalho em anos do primeiro Colaborador: \n");
		a.setAnosServico(s.nextInt());
		
		
		
		System.out.println("Entre com o nome e vinculo do segundo Colaborador: \n");

		nome = s.nextLine();
		vinculo = s.nextLine();

		Colaborador b = new Colaborador(nome, vinculo);

		System.out.println("Entre com o nome e vinculo do terceiro Colaborador: \n");

		nome = s.nextLine();
		vinculo = s.nextLine();

		Colaborador c = new Colaborador(nome, vinculo);
		
		s.close();
	}

}
