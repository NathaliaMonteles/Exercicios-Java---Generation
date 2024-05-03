package escola.model;

public class Servente extends Pessoa {
	
	private int funcao;
	
	public int getFuncao() {
		return funcao;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public Servente(int id, String nome, int idade, String sexo, String email, String telefone, int funcao) {
		super(id, nome, idade, sexo, email, telefone);
		this.funcao = funcao;
	}

	@Override
	public void acompanharCanvas() {
		// TODO Auto-generated method stub
	}

	@Override
	public float salarioLiquido(float salario) {
		// calcular o salario do professor
		return salario - 80;
	}
}
