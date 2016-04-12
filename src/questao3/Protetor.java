package questao3;

public class Protetor extends Papel {

	public Protetor(double poder, double defesa) {
		super(poder, defesa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double atacar() {
		return getPoder()*-1;
	}

	@Override
	public double defender() {
		return getDefesa()*1.5;
	}

	@Override
	public double curar() {
		return getPoder();
	}

}
