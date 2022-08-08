public class Main {
	
	public static void main(String[] args) {
		Cliente emanuele = new Cliente();
		emanuele.setNome("Emanuele");
		
		
		ContaCorrente cc = new ContaCorrente(emanuele);
		ContaPoupanca poupanca = new ContaPoupanca(emanuele);
		
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
	}
	

}
