package AV2.PROJETO;

import view.FuncionarioView;
import controller.FuncionarioController;

public class Main {
	public static void main(String[] args) {
		FuncionarioController controller = new FuncionarioController();

		FuncionarioView view = new FuncionarioView(controller);
        
		view.exibirMenu();
	}
}
