package questao3;

public class Curandeiro extends Papel{

	public Curandeiro(double poder, double defesa) {
		super(poder, defesa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double atacar() {
		return getPoder()*0.5*-1;
	}

	@Override
	public double defender() {
		return getDefesa();
	}

	@Override
	public double curar() {
		return getPoder()*1.4;
	}//fecha curar

}
