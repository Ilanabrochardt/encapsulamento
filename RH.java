package encapsulamento;

public class RH {
	public static void main(String[] args) { 
		//Como ele não tem método construtor, não coloca nada nenhuma informação como parâmetro
		//vai ter que atribuir chamando pelo nome do objeto os atributos. 
		//como Só nome e end são públicos, eles não precisam fazer um método na classe funcionario para manipular o atributo.
		//Como os outros estão privados, estão, portanto encapsulados tbm e, por isso, só os métodos dentro da classe podem manipular os atributos 
		//então, precisa criar um método que não seja private que consiga manipular os dados , como o alterar salario e o mostrarSlario

		Funcionarios i = new Funcionarios();
		i.nome = "Ilana";
		i.end ="Rua dos bobos";
		i.setSalario(2500.00);

		i.setCpf("12345678910");

		i.setQtdFilhos(0);
		
		i.setRg("8954671");
		
		i.setTelefone("81985478963");
		
		i.setEmail("ilanab@gmail.com0");
		
		System.out.println("Informacao do Funcionario:");
		System.out.printf("nome: " + i.nome + "\nendereco: " + i.end + "\nsalario: " + i.getSalario() + "\nCPF:  " + i.getCpf() + "\nquantidade de filhos: " +  i.getQtdFilhos() + "\nRG: " + i.getRg() + "\ntelefone: " + i.getTelefone() + "\nemail: " + i.getEmail());
	
		
	}
		
}