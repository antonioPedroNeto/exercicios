package questao4;

public class ContaNormal extends ContaBancaria{

	public final double JUROS = 0.1;
	
	public ContaNormal(String nome, double rendaMensal, double renda) {
		super(nome, rendaMensal, renda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double lucros(int meses, double investimento) {
		double valor  = investimento;
		
		for(int i = 0; i < meses; i++){
			valor += valor + (valor*JUROS);
		}//fecha for
		return valor;
	}//fecha lucros

	@Override
	public double emprestimo() {
		return getRenda();
	}

}//fecha class
