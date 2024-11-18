package domínio;

import java.util.ArrayList;
import java.io.*;

import domínio.Paciente;

public class ControlaPaciente {
	private ArrayList<Paciente> pacientes;
	private final String nomeArquivo= "arquivo.txt";

	public ControlaPaciente() {
		this.pacientes= new ArrayList<>();
		
		carregarArquivo();
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
		
		salvarArquivo();
		
		System.out.println("Paciente " + nome + ": Adicionado com sucesso!");
	}
	
	public void alteraPaciente(int id, String nome, int sexo, double massa, double altura) {
		Paciente paciente= buscaPorId(id);
		
		if(paciente != null) {
			paciente.setNome(nome);
			paciente.setSexo(sexo);
			paciente.setMassa(massa);
			paciente.setAltura(altura);
			
			salvarArquivo();
			
			System.out.println("Paciente " + nome + ": Alterado com sucesso!");
		} else {
			System.out.println("Paciente não encontrado!");
		}
	}
	
	public void removePaciente(int id) {
		Paciente paciente= buscaPorId(id);
		
		if(paciente != null) {
			pacientes.remove(paciente);
			
			salvarArquivo();
			
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
			
			for(Paciente paciente : pacientes) {
				paciente.mostrarPaciente();
			}
		}
	}
	
	public void salvarArquivo() {
		try (BufferedWriter escrita = new BufferedWriter(new FileWriter(nomeArquivo))) {
			for (Paciente paciente : pacientes) {
				escrita.write(paciente.getId() + ";" + paciente.getNome() + ";" + paciente.getSexo() + ";" + paciente.getMassa() + ";" + paciente.getAltura());
				escrita.newLine();
			}
		} catch (IOException e) {
			System.out.println("Erro ao salvar pacientes no arquivo: " + e.getMessage());
		}
	}
	
	public void carregarArquivo() {
		try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
			String linha;
			
			while ((linha = leitor.readLine()) != null) {
				String[] dados = linha.split(";");
				
				int id = Integer.parseInt(dados[0]);
				String nome = dados[1];
				int sexo = Integer.parseInt(dados[2]);
				double massa= Double.parseDouble(dados[3]);
				double altura= Double.parseDouble(dados[4]);
				
				pacientes.add(new Paciente(id, nome, sexo, massa, altura));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo com os dados dos paciente não foi encontrado. Este será criado ao salvar novos produtos.");
		} catch (IOException e) {
			System.out.println("Erro ao carregar os dados dos pacientes: " + e.getMessage());
		}
	}
}
