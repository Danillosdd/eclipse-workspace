package excecoes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ExcecaoComRecurso {
	
	public static void main(String[] args) {
		
		PrintStream ps = System.out;
	
		InputStreamReader leitor = new InputStreamReader(System.in);
		
		try {
			
			Character ch = (char) leitor.read();
			
		} catch (IOException e) {
			
			ps.printf("Um Erro Aconteceu : %s \n", e);

		} finally {
			
			if(leitor != null) {
				try {
					leitor.close();
				} catch (Exception e2) {
					ps.println("Sempre fechar o recurso");
				}
			}
		}
		
		
		//Outra forma de Implementação
		
		try (InputStreamReader leitor2 = new InputStreamReader(System.in)){
			
			Character ch = (char) leitor2.read();
			
		} catch (IOException e) {
			
			ps.printf("Um erro aconteceu : %s \n", e);
		}
	}

}
