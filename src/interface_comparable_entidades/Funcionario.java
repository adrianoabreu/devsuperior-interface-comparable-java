package interface_comparable_entidades;

public class Funcionario implements Comparable<Funcionario>{

	private String nome;
	private Double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, Double salario) {
		this.nome    = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override   // esse metodo serve para comparar um objeto com outro.
	public int compareTo(Funcionario o) {
		return this.nome.compareTo(o.getNome()); // comparação entre funcionários está sendo feita por nome.
	    //return this.salario.compareTo(o.getSalario()); // comparação entre funcionários está sendo feita por salario.
	    //return -this.salario.compareTo(o.getSalario()); // comparação entre funcionários está sendo feita por salario ordem decrescente.
	}
	
}
