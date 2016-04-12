package questao2;

public abstract class Produto {

	private String nome;
	private int quantidade;
	private double precoBase;
	
	public Produto(String nome, double precoBase){
		this.nome = nome;
		this.precoBase = precoBase;
	}
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getQuantidade() {
		return quantidade;
	}




	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}




	public double getPrecoBase() {
		return precoBase;
	}




	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}




	public abstract double calculo(int quantidadeProdutos);
	
}
