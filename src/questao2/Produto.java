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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(precoBase);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantidade;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(precoBase) != Double.doubleToLongBits(other.precoBase))
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
	
	
	
}
