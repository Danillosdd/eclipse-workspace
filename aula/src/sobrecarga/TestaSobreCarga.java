package sobrecarga;

public class TestaSobreCarga {
	public static void main(String[] args) {

		SobreCarga teste = new SobreCarga();

		System.out.println("------------------");
		String msg = "Danillo";
		teste.print(msg);

		System.out.println("=========================");
		teste.print();
		System.out.println("------------------");
	}

}
