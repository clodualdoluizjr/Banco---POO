import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		int acao = 0;
		int contador = 0;

		Cliente C1 = new Cliente();
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu CPF : ");
		C1.CPF = leia.next();
		while (contador == 0) {

			System.out.println("Selecione a ação desejada : 1 para saque ou 2 para deposito .");
			acao = leia.nextInt();
			if (acao == 1) {
				System.out.println("Digite a quantia que deseja sacar : ");
				C1.valorSaque = leia.nextDouble();
				if (C1.saldo >= C1.valorSaque) {
					C1.saque();
					double saldo = C1.saldo;
					System.out.println("Saque efetuado com sucesso. Saldo atual " + saldo);
				}
				double saldo = C1.saldo;
				System.out.println("Saque não efetuado. Saldo Insuficiente.");
			} else if (acao == 2) {
				System.out.println("Digite a quantia que deseja depositar : ");
				C1.valorDeposito = leia.nextDouble();
				C1.deposito();
				double saldo = C1.saldo;
				System.out.println("Depósito efetuado com sucesso. Saldo atual :R$  " + saldo);
			} else if (acao == 3) {
				System.out.println("Operação Finalizada. ");
				contador = 1;
			}

		}

	}

}
