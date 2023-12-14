package encapsulamento;

public class Funcionarios {
	public String nome;
	public String end;
	private double salario;
	private int qtdFilhos;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getQtdFilhos() {
		return qtdFilhos;
	}
	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		


}
