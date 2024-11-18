package controle;

import java.util.Scanner;
import domínio.ControlaPaciente;

public class controlePaciente {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		ControlaPaciente controle= new ControlaPaciente();
		int opc;
		
		do {
			System.out.println("-------------------------");
			System.out.println("|	MENU		|");
			System.out.println("|1- Adicionar paciente	|");
			System.out.println("|2- Excluir paciente	|");
			System.out.println("|3- Alterar paciente	|");
			System.out.println("|4- Listar pacientes	|");
			System.out.println("|0- Encerrar programa	|");
			System.out.println("-------------------------");
			
			System.out.print("Digite a opção: ");
			opc= scanner.nextInt();
			
			switch(opc) {
				case 1:
					System.out.println("Digite o ID: ");
					int id= scanner.nextInt();
					
					scanner.nextLine();
					System.out.println("Digite o nome: ");
					String nome= scanner.nextLine();
					
					System.out.println("Digite o sexo(1- Masc; 2- Fem; 3- Outros): ");
					int sexo= scanner.nextInt();
					
					System.out.println("Digite a massa: ");
					double massa= scanner.nextDouble();
					
					System.out.println("Digite a altura: ");
					double altura= scanner.nextDouble();
					
					controle.adicionaPaciente(id, nome, sexo, massa, altura);
					break;
				
				case 2:
					System.out.println("Digite o ID do paciente a ser removido: ");
					int idRemove= scanner.nextInt();
					
					controle.removePaciente(idRemove);
					break;
				
				case 3:
					System.out.println("Digite 0 nas opções que não deseja alterar!");
					
					System.out.println("Digite o ID do paciente a ser alterado: ");
					int idAltera= scanner.nextInt();
					
					System.out.println("Digite o nome: ");
					String nomeAlterado= scanner.nextLine();
					
					scanner.nextLine();
					System.out.println("Digite o sexo: ");
					int sexoAlterado= scanner.nextInt();
					
					System.out.println("Digite a massa: ");
					double massaAlterado= scanner.nextDouble();
					
					System.out.println("Digite a altura: ");
					double alturaAlterado= scanner.nextDouble();
					
					controle.alteraPaciente(idAltera, nomeAlterado, sexoAlterado, massaAlterado, alturaAlterado);
					break;
				
				case 4:
					controle.listaPacientes();
					break;
				
				case 0:
					System.out.println("Volte Sempre!");
					break;
				
				default:
					System.out.println("Opção inválida! Tente novamente!");
			}
			
		} while(opc!= 0);
		
		scanner.close();
	}

}
