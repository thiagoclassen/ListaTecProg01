import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList<Item> lista = new ArrayList<Item>();

	public void adicionarItem(Item item){
		this.lista.add(item);
	}
	
	public void removerItem(Item item){
		this.lista.remove(item);
	}
	
	public double getvalorTotal(){
		double total = 0;
		for(Item item : this.lista){
			total += item.getValor() * item.getQtd();
		}
		return total;
	}
	
}
