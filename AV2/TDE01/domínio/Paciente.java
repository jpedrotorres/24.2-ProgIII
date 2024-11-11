package domínio;

public class Paciente {
	private int id;
	private String nome;
	private int sexo;
	private double massa;
	private double altura;

	public Paciente(int id, String nome, int sexo, double massa, double altura) {
		this.id= id;
		this.nome= nome;
		this.sexo= sexo;
		this.massa= massa;
		this.altura= altura;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id= id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome= nome;
	}
	
	public int getSexo() {
		return sexo;
	}
	
	public void setSexo(int sexo) {
		this.sexo= sexo;
	}
	
	public double getMassa() {
		return massa;
	}
	
	public void setMassa(double massa) {
		this.massa= massa;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura= altura;
	}
	
	public void mostrarPaciente() {
		System.out.println("(" + getId() + ") " + getNome() + "-> Sexo: " + getSexo() + "; Massa: " + getMassa() + "; Altura: " + getAltura());
	}
}
