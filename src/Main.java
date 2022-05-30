
public class Main {

	public static void main(String[] args) {
		
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");
		
		Banco banco = new Banco();
		Conta cCorrente = new ContaCorrente(felipe);
		Conta cPoupanca = new ContaPoupanca(felipe);

		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();
		banco.listarContas();
	}
}