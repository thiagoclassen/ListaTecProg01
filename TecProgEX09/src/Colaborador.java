
public class Colaborador {

	private String nome;
	private int anosServico;
	private String vinculo;
	private float valorHora;
	private float horas;
	
	public Colaborador(String nome, String vinculo) {
		this.nome = nome;
		this.vinculo = vinculo;
		
		this.anosServico = 0;
		this.valorHora = 0;
		this.horas = 0;
	}
	
	public float calculaRendimentos(){
		
		float rendimentos;
		
		if(this.vinculo.matches("empregado")){
			
			float extra = 0;
			float p = 1 + (float) (0.1*this.anosServico);
			
			if(this.horas>144){
				extra = (float) ((this.horas - 144)*(this.valorHora*p*1.5));				
			}
			
			rendimentos = extra + this.valorHora*p*this.horas;
			
		}else if(this.vinculo.matches("estagiario")){
			rendimentos = 80*this.valorHora;
		}else{
			rendimentos = this.valorHora*this.horas;
		}
		
		return rendimentos;
	}
	
	public float calculaCusto(){
		
		float custo = this.calculaRendimentos();
		
		if(this.vinculo.matches("empregado")){
			custo = custo*(float)1.8;
		}
		
		return custo;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setAnosServico(int anosServico) {
		this.anosServico = anosServico;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public void setHoras(float horas) {
		this.horas = horas;
	}
	
	
	
	

}
