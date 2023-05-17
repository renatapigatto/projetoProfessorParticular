import java.util.ArrayList;
import java.util.List;

public class Professor {
	private String email; //obrigatório, checar se null
	private String senha; //obrigatório, checar se null
	private List<Aluno> alunos = new ArrayList<Aluno>();//navegabilidade professor > aluno

	
	//construtor
	public Professor(String email, String senha) {
		setEmail(email);
		setSenha(senha);
	}
	
	
	//getters & setters
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		if(email.contains("@") && email.contains(".com")) {//se contém substrings, não é null
			this.email = email;
		}else {
			throw new RuntimeException("Erro professor: E-mail inválido");
		}
	}
	
	
	public String getSenha() {
		return senha;
	}
	
	
	public void setSenha(String senha) {
		if (senha.length() == 6) { //se tem 6 caracteres não é null
			this.senha = senha;
		}else {
			System.out.print("A senha deve ter 6 caracteres");
		}
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void addAluno(Aluno aluno) {
		if(aluno == null) {
			throw new RuntimeException("Erro Professor: Aluno inválido");
		}else {
			this.alunos.add(aluno);
		}
	}
		
	
}//Professor.
