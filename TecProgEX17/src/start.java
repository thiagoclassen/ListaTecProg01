
public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item a = new Item("Item A", 5.00, 2);
		Item b = new Item("Item B", 7.00, 2);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem(a);
		carrinho.adicionarItem(b);
		System.out.println("TOTAL: "+carrinho.getvalorTotal());
		
		carrinho.removerItem(a);
		System.out.println("TOTAL: "+carrinho.getvalorTotal());
	}

}
