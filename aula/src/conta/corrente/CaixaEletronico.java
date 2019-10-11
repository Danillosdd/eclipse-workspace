package conta.corrente;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();

		int tipo = 1;
		double valor;

		while (tipo != 0) {
			System.out.println("Informe o Valor: ");
			valor = teclado.nextDouble();

			System.out.println("-------------------");
			System.out.println("Digite 1 para Deposito e 2 para Saque: ");
			tipo = teclado.nextInt();
			System.out.println("-------------------");

			if (tipo == 1) {

				conta.depositar(valor);
				System.out.println(conta.saldo);

			} else if (tipo == 2) {
				conta.sacar(valor);
				System.out.println(conta.saldo);

			} else if (tipo == 0) {
				break;
			}

			System.out.println("======================================================================");
			System.out.println("\nDeseja Realizar mais uma Operação? \n Digite 1 Para Sim, e 0 Para Não");
			tipo = teclado.nextInt();

		}
		System.out.println("\n\n---FIM----");
		teclado.close();
	}

}
