package abstrato;

public abstract class Animal {

	private String ruido;

	public Animal(String ruido) {
		this.ruido = ruido;
	}

	public abstract void fazerRuido();

	public abstract void comer();

	// get
	public String getRuido() {
		return ruido;
	}

	// set
	public void setRuido(String ruido) {
		this.ruido = ruido;
	}

}
