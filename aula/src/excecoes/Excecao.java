package excecoes;

public class Excecao {
	
	public static void main(String[] args) {
		
		
		try {

			int num[] = new int[2];
			
			System.out.println(num[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Posi��o n�o existe!");
			//e.printStackTrace();
		}
	}

}
