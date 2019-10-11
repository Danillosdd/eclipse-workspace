package collections;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {

		List<String> listaString = new ArrayList<String>();

		System.out.println(listaString + ", tamanho = " + listaString.size());

		listaString.add("Contrato");
		listaString.add("Documento");
		listaString.add("Nota Fiscal");

		System.out.println(listaString + ", tamanho = " + listaString.size());

		listaString.remove("Documento");
		System.out.println(listaString + ", tamanho = " + listaString.size());

		System.out.println("----------");

		Boolean contem = listaString.contains("Nota Fiscal");
		System.out.println("A lisa contem Nota Fiscal? = " + contem);

		contem = listaString.contains("Documento");
		System.out.println("A lisa contem Documento? = " + contem);
	}

}
