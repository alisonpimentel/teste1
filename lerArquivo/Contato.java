package lerArquivo;

public class Contato {
	private String nome;
	private String email;
	


	
	public Contato(String nome2, String email2) {
		
		this.nome= nome2;
		this.email=email2;
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
