
public class Cliente {
	String nome, CPF, agencia, conta;
	double saldo = 0, valorSaque = 0, valorDeposito = 0, acao = 0;

	double saque() {
		if (saldo > valorSaque) {
			System.out.println("Saque Possivel !");
			return (saldo = saldo - valorSaque);
		} else {
			System.out.println("Saldo Impossivel !");
			return saldo;

		}

	}

	double deposito() {
		return (saldo = saldo + valorDeposito);
	}

	Cliente() {

	}
}
