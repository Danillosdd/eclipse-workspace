package statico;

public class staticTest {
	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		Carro ferrari = new Carro();
		Carro jipe = new Carro();
		
		System.out.println("-------------------");
		System.out.println(Carro.contadorObjetos);
		//Chama a vari�vel est�tica pelo nome da classe, n�o precisa ser pelo nome do objeto.
		//Pois a vari�vel est�tica n�o pertence a um objeto espec�fico.
		
		System.out.println("----------------");
		System.out.println(Carro.getContador());
		
		System.out.println("------------");
		
		System.out.println(ferrari.contadorObjetos);
	}

}
