
public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia= Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.print(String.format("Titular: %s", this.cliente.getNome()));
		System.out.print(String.format("Agencia: %d", this.agencia));
		System.out.print(String.format("Numero: %d", this.numero));
		System.out.print(String.format("Saldo: %.2f", this.saldo));
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
    
}
