package conta.corrente;

public class ContaCorrente {

	String titular;
	String numeroConta;
	double saldo = 0;

	public double depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
		return saldo;
	}

	public double sacar(double valorSaque) {
		saldo = saldo - valorSaque;
		return saldo;
	}

	public void transferir() {
	}

}
