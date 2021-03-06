package questao4;

public class ContaElite extends ContaBancaria{

	private final double JUROS = 0.15;
	
	public ContaElite(String nome, double rendaMensal, double renda) {
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
		return getRenda() + (0.1*lucros(5, getRenda()*0.1));
	}

}
