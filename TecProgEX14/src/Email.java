
public class Email {
	
	private Assunto assunto;
	private Mensagem mensagem;
	
	public Email() {
		this.assunto = new Assunto();
		this.mensagem = new Mensagem();
	}

	public void setConteudoAssunto(String assunto){
		this.assunto.setTexto(assunto);
	}
	
	public void addTextoMensagem(String mensagem){
		this.mensagem.addMensagem(mensagem);
	}
	
	public void mostraDados(){
		System.out.println("\nAssunto: "+this.assunto.getTexto());
		System.out.println("\nMensagem: "+this.mensagem.getMensagem());
	}

}
