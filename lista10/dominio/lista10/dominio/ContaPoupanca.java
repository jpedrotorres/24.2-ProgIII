package dominio;

public class ContaPoupanca extends ContaBancaria {
	private int dia_rendimento;
	
	public ContaPoupanca(String cliente, int num_conta, float saldo, int dia_rendimento) {
		super(cliente, num_conta, saldo);
		this.dia_rendimento= dia_rendimento;
	}
	
	public int getDia_rendimento() {
		return dia_rendimento;
	}
	
	public void setDia_Rendimento(int dia_rendimento) {
		this.dia_rendimento= dia_rendimento;
	}
	
	public void calcularNovoSaldo(float taxa) {
		setSaldo(getSaldo()+ getSaldo() * taxa);
		System.out.println("Seu saldo, com a taxa de rendimento aplicado: R$" + getSaldo());
	}
	
	@Override
	public void sacar(float saque) {
		if(getSaldo()== 0 || getSaldo()< saque) System.out.println("Você não possui saldo suficiente na conta!");
		
		setSaldo(getSaldo()- saque);
		System.out.println("Você agora possui na conta R$" + getSaldo());
	}
	
}
