package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Cpfutil {

	public String retornarNomePorCpf(String cpf) {

		Map<String, String> CpfNome = new HashMap<String, String>();

		CpfNome.put("033.030.811-40", "Danillo Araujo de Paiva");
		CpfNome.put("300.300.300-30", "Fulano");


		if (CpfNome.containsKey(cpf)) {

			return CpfNome.get(cpf);

		} else {

			return "CPF Não Encontrado";
		}

	}
}
