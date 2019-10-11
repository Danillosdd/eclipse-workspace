package excecoes;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Excecao2 {
	
	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		
		InputStreamReader leitor = new InputStreamReader(System.in);
		
		int array[] = {1, 2, 3,4};
		
		try {
			
			Character ch = (char) leitor.read();
			
			int i = Integer.parseInt(ch.toString());
			
			ps.println(array[i]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			ps.printf("Indice fora do limite [0..3] : %s\n", e.getMessage());

		} catch (NumberFormatException e ) {
			
			ps.printf("Erro de Conversão : %s\n", e.getMessage());
		
		} catch (IOException e) {
			
			ps.printf("Erro de entrada/saída : $s\n", e.getMessage());
		} finally {
			
			ps.println("Sempre passo aqui para fechar todos os recursos");
		}
		
	}

}
