package questao5;

import questao2.Alimento;
import questao2.Limpeza;
import questao2.Produto;

public class carrinhoTeste {

	public static void main(String[] args){
		
		Produto prod = new Limpeza("sabonete", 10);
		
		Produto prod2 = new Alimento("passarinho", 33, false);
		

		Carrinho c = new Carrinho();
		
		c.adicionar(prod2);
		c.adicionar(prod);
		
		
		
		System.out.println(c.precoTotal());
		System.out.println(c.consultar(prod2));
		System.out.println(c.remover(prod2));
		System.out.println(c.consultar(prod2));
		
		Alimento passarinho = (Alimento)prod2;
		
		System.out.println(passarinho.getClass());
		
		
		
		
		
	}//fecha main
	
	
	
}//fecha class
