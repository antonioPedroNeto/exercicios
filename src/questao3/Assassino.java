package questao3;

public class Assassino extends Papel{

	public Assassino(double poder, double defesa) {
		super(poder, defesa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double atacar() {
		return getPoder()*1.45*-1;
	}

	@Override
	public double defender() {
		return getDefesa()*0.5;
	}

	@Override
	public double curar() {
		return getPoder();
	}

	
	
}
