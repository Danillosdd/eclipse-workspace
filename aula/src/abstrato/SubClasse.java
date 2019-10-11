package abstrato;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SubClasse extends SuperClasseAbstrata {

	@Override
	public void imprimeExtrato() {

		System.out.println("### Extrato da Conta ###");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();

		System.out.printf("Saldo: %.2f\n" , this.getSaldo());
		System.out.println("Data: " + sdf.format(date));
	}

}
