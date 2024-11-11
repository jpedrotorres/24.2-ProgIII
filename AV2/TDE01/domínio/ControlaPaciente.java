package domínio;

import java.util.ArrayList;
import domínio.Paciente;

public class ControlaPaciente {
	private ArrayList<Paciente> pacientes;

	public ControlaPaciente() {
		this.pacientes= new ArrayList<>();
	}
	
	private Paciente buscaPorId(int id) {
		for(Paciente paciente : pacientes) {
			if(paciente.getId() == id) return paciente;
		}
		
		return null;
	}
	
	public void adicionaPaciente(int id, String nome, int sexo, double massa, double altura) {
		Paciente paciente= new Paciente(id, nome, sexo, massa, altura);
		
		pacientes.add(paciente);
		
		System.out.println("Paciente" + nome + ": Adicionado com sucesso!");
	}
	
	public void alteraPaciente(int id, String nome, int sexo, double massa, double altura) {
		Paciente paciente= buscaPorId(id);
		
		if(paciente != null) {
			paciente.setNome(nome);
			paciente.setSexo(sexo);
			paciente.setMassa(massa);
			paciente.setAltura(altura);
			
			System.out.println("Paciente " + nome + ": Alterado com sucesso!");
		} else {
			System.out.println("Paciente não encontrado!");
		}
	}
	
	public void removePaciente(int id) {
		Paciente paciente= buscaPorId(id);
		
		if(paciente != null) {
			pacientes.remove(paciente);
			
			System.out.println("Paciente removido com sucesso!");
		} else {
			System.out.println("Paciente não encontrado!");
		}
	}
	
	public void listaPacientes() {
		if(pacientes.isEmpty()) {
			System.out.println("Não existem pacientes cadastrados!");
		} else {
			System.out.println("Lista de Pacientes:");
			System.out.println("ID	|	NOME	|	SEXO	|	MASSA	|	ALTURA");
			
			for(Paciente paciente : pacientes) {
				paciente.mostrarPaciente();
			}
		}
	}
}
