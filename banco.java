public class banco {
	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Gus", 21, 1418, 12);
		System.out.println(f1.getSalario());
		f1.aplicarBonificacao();
		System.out.println(f1.getSalario());
		
		System.out.println(f1.getNome());
		
	}
}
