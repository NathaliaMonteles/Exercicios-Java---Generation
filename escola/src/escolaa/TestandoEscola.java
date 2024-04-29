package escolaa;

import escola.model.Aluno;
import escola.model.Professor;

public class TestandoEscola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a = new Aluno(1, "Ellen Silva", 29, "Feminino", "ele.generation@gmail.com", "(11)4002-8922", "Maria", 2024, "(11)4002-8922");
		
		Professor p = new Professor(1, "Thiago", 28, "Masculino", "thiagodapraiagrande@gmail.com", "(11)5591-7922", "Full Stack", "Vida");
		
		//Pessoa x = new Pessoa(5, "Vinicius", 25, "Masculino", "vinicius_kbc@hotmail.com", (11)9.8878-9854")
		
		a.visualizar();
		p.visualizar();
				
	}

}
