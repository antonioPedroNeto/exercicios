package questao4;

public class ContaPoupanca extends ContaBancaria{

	public ContaPoupanca(String nome, double rendaMensal, double renda) {
		super(nome, rendaMensal, renda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double lucros(int meses, double investimento) {
		double juros = 0;
		double valor  = investimento;
		
		for(int i = 0; i < meses; i++){
			juros += 0.3;
			valor += valor + (valor*juros);
		}//fecha for
		return valor;
	}//fecha lucros

	@Override
	public double emprestimo() {
		return 0;
	}

}
