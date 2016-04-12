package questao4;

public abstract class ContaBancaria {

	private double saldo;
	private String nome;
	private double rendaMensal;
	private double renda;
	
	
	
	public ContaBancaria(String nome, double rendaMensal, double renda){
		this.saldo = 0;
		this.rendaMensal = rendaMensal;
		this.renda = renda;
	}

	
	
	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getRendaMensal() {
		return rendaMensal;
	}



	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}



	public double getRenda() {
		return renda;
	}



	public void setRenda(double renda) {
		this.renda = renda;
	}



	public boolean adicionar(double saldo){
		if(saldo < 0){
			return false;
		}
		
		this.saldo += saldo;
		return true;
	}
	
	public boolean sacar(double saldo){
		if(saldo > this.saldo){
			return false;
		}
		this.saldo -= saldo;
		return true;
	}
	
	public abstract double lucros(int meses, double investimento);
	public abstract double emprestimo();
}
