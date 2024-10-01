package dominio;

public abstract class ContaBancaria {
	protected String cliente;
	protected int num_conta;
	protected float saldo;
	
	public ContaBancaria(String cliente, int num_conta, float saldo) {
		this.cliente= cliente;
		this.num_conta= num_conta;
		this.saldo= saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente= cliente;
	}
	
	public int getNum_conta() {
		return num_conta;
	}
	
	public void setNum_conta(int num_conta) {
		this.num_conta= num_conta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo= saldo;
	}
	
	public abstract void sacar(float saque);
	
	public void depositar(float deposito) {
		saldo+= deposito;
	}
}
