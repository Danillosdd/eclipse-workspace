package abstrato;

public class Gato extends Animal {

	public Gato() {
		super("Miauuu. miauuu");
	}

	@Override
	public void fazerRuido() {
		System.out.println("Miar: " + this.getRuido());

	}

	@Override
	public void comer() {
		System.out.println("Come Rato");

	}

}
