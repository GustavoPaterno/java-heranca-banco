public class Gerente extends Funcionario {
	private int qtdFunc;

    public Gerente(String nome, int idade, float salario, int qtdFunc) {
        super(nome, idade, salario);
        this.qtdFunc = qtdFunc;
    }

	public int getQtdFunc() {
		return qtdFunc;
	}
	
	public void setQtdFunc(int qtdFunc) {
		this.qtdFunc = qtdFunc;
	}
}
