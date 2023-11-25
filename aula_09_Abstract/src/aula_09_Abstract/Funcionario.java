package aula_09_Abstract;

public abstract class Funcionario {

	private String nome ;
	private int cargo;
	private float salario;
	public Funcionario(String nome, int cargo, float salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	public void visual() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Salario: " + this.salario);
	}
	
}