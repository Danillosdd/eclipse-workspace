package statico;

public class staticTest {
	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		Carro ferrari = new Carro();
		Carro jipe = new Carro();
		
		System.out.println("-------------------");
		System.out.println(Carro.contadorObjetos);
		//Chama a variável estática pelo nome da classe, não precisa ser pelo nome do objeto.
		//Pois a variável estática não pertence a um objeto específico.
		
		System.out.println("----------------");
		System.out.println(Carro.getContador());
		
		System.out.println("------------");
		
		System.out.println(ferrari.contadorObjetos);
	}

}
