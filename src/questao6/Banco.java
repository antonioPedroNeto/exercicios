package questao6;

import java.util.ArrayList;

import questao4.ContaBancaria;

public class Banco {

	private ArrayList<ContaBancaria> contas;
	

	public Banco(){
		contas = new ArrayList<ContaBancaria>();
		
	}
	
	public boolean criar(){
		
		return false;
	}
	
	public boolean armazenar(ContaBancaria conta){
		return contas.add(conta);
	}//fecha armazenar
	
	public boolean fechaContas(ContaBancaria conta){
		return contas.remove(conta);
	}//fecha fechaContas
	
	
	
	
	
}
