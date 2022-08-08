
public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.print("**Extrato conta corrente***");
		imprimirInfosComuns();
	}

}
