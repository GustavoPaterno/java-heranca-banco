public class Funcionario {
	private String nome;
	private int idade;
	private float salario;
	
    public Funcionario(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
		this.idade = idade;
	}

    public void setNome(String nome) {
		this.nome = nome;
	}
    
    public float getSalario() {
		return salario;
	}
    
    public void aplicarBonificacao() {
        this.salario *= 1.10; 
    }
    

}
