
public class Mensagem {

	private String mensagem;
	
	public Mensagem(){
		this.mensagem = "";
	}

	public String getMensagem() {
		return mensagem;
	}

	public void addMensagem(String mensagem) {
		this.mensagem += mensagem;
	}

}
