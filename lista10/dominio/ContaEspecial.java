package dominio;

public class ContaEspecial extends ContaBancaria{
	private float limite;
	
	public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
		super(cliente, num_conta, saldo);
		
		this.limite= limite;
	}
	
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite= limite;
	}
	
	@Override
	public void sacar(float saque) {
		if(getSaldo() + limite >= saque) {
			setSaldo(getSaldo()- saque);
			System.out.println("Seu novo saldo é de: R$"+ getSaldo());
		} else System.out.println("Saldo insuficiente!");
	}
}
