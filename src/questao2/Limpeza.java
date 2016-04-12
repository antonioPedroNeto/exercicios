package questao2;

public class Limpeza extends Produto{

	public Limpeza(String nome, double precoBase) {
		super(nome, precoBase);
		// TODO Auto-generated constructor stub
	}


	private final int VALOR_MINIMO = 4;
	private final double DESCONTO = 0.1;
	
	
	@Override
	public double calculo(int quantidadeProdutos) {
		
		double valor = 0;
		
		if(quantidadeProdutos > VALOR_MINIMO){
			
			valor += quantidadeProdutos*getPrecoBase();
			valor += valor -(DESCONTO*(quantidadeProdutos-VALOR_MINIMO)*valor);
			
		}else{
			valor += quantidadeProdutos*getPrecoBase();
		}//fecha else
		
		
		return valor;
	}//fecha calculo

}
