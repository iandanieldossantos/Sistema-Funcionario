package entities;

public class Employee {

	private static final double max_percent = 30.0;
	private int id;
	private String nome;
	private double salario;
	
	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}
	
	public void increaseSalary(double percent) {
		if (percent > 0 && percent <= max_percent) {
			salario += salario * percent / 100.0;
		}
	}
	
	public String toString() {
		return "ID "
			   + id
			   + ", Nome: "
			   + nome
			   + ", Salario atualizado: $ "
			   + String.format("%.2f", salario);
	}
}
