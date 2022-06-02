
public class Main {

	public static void main(String[] args) {
		
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");
		
		Conta cCorrente = new ContaCorrente(felipe);
		Conta cPoupanca = new ContaPoupanca(felipe);

		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();
	}
}