package AV2.PROJETO;

/*
 	trabalho feito por:
 	Aron Barbosa
 	João Marcelo Lopes
  	João Pedro Torres
  	Luis Felipe Dos Santos
 */

import view.FuncionarioView;
import controller.FuncionarioController;

public class Main {
	public static void main(String[] args) {
		FuncionarioController controller = new FuncionarioController();

		FuncionarioView view = new FuncionarioView(controller);
        
		view.exibirMenu();
	}
}
