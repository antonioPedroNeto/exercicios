package questao2;

public class Alimento extends Produto{

	private boolean gluten;
	private final double DESCONTO = 0.5;
	
	public Alimento(String nome, double precoBase, boolean gluten) {
		super(nome, precoBase);
		
		this.gluten = gluten;
	}

	@Override
	public double calculo(int quantidadeProdutos) {
		
		if(gluten){
			return  DESCONTO * getPrecoBase() * quantidadeProdutos;
		}//fecha if
		return getPrecoBase()*quantidadeProdutos;
	}//fecha calculo

}
