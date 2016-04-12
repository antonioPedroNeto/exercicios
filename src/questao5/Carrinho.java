package questao5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import questao2.Alimento;
import questao2.Limpeza;
import questao2.Produto;

public class Carrinho {

	private HashMap<String, Produto> carrinho;
	private ArrayList<Alimento> alimentosCarrinho;
	private ArrayList<Limpeza> limpezaCarrinho;

	public Carrinho(){
		carrinho = new HashMap<String, Produto>();
		alimentosCarrinho = new ArrayList<Alimento>();
	}
	
	public boolean adicionar(Produto produto){
		
		carrinho.put(produto.getNome(), produto);
		return true;
		
	}//fecha adicionar
	
	public boolean remover(Produto produto){
		
		carrinho.remove(produto.getNome());
		return true;
		
	}//fecha remover
	
	public boolean consultar(Produto produto){
		
		return carrinho.containsKey(produto.getNome());
		
	}//fecha consultar
	
	public double precoTotal(){
		
		Set<String> chaves = carrinho.keySet();
		double precoTotal = 0;
		for(String chaveAtual : chaves){
			precoTotal += carrinho.get(chaveAtual).getPrecoBase();
		}
		
		return precoTotal;
	}
	
	
	public ArrayList<Alimento> pegaAlimentos(){
		
		Set<String> chaves = carrinho.keySet();
		for(String chaveAtual : chaves){
			
			Produto produtoAtual = carrinho.get(chaveAtual);
			
			if(produtoAtual instanceof Alimento){
				Alimento alimentoAtual = (Alimento)produtoAtual;
				alimentosCarrinho.add(alimentoAtual);
			}//fecha if
			
		}//fecha for
		
		return alimentosCarrinho;
	}//fecha pegaAlimentos
	
	
	public ArrayList<Limpeza> pegaLimpeza(){

		Set<String> chaves = carrinho.keySet();
		for(String chaveAtual : chaves){
			
			Produto produtoAtual = carrinho.get(chaveAtual);
			
			if(produtoAtual instanceof Alimento){
				Limpeza limpezaAtual = (Limpeza)produtoAtual;
				limpezaCarrinho.add(limpezaAtual);
			}//fecha if
			
		}//fecha for
		
		return limpezaCarrinho;
	}//fecha pegaLimpeza
	
}
