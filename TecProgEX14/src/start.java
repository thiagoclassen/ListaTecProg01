
public class start {
	
	public static void main(String[] args){
		
		Email email = new Email();
		email.setConteudoAssunto("Teste!");
		email.addTextoMensagem("Mensagem de Texto....YAY!!!!!!");
		email.mostraDados();
	}

}
