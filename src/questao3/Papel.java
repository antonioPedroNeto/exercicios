package questao3;

public abstract class Papel {

	private double poder;
	private double defesa;
	
	
	
	public double getPoder() {
		return poder;
	}


	public void setPoder(double poder) {
		this.poder = poder;
	}


	public double getDefesa() {
		return defesa;
	}


	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}


	public Papel(double poder, double defesa){
		this.poder = poder;
		this.defesa = defesa;
	}
	
	
	public abstract double atacar();

	public abstract double defender();

	public abstract double curar();
	
	
	public double getAtaque(){
		return this.poder;
	}
	
	public double getCura(){
		return this.poder;
	}
	
}
