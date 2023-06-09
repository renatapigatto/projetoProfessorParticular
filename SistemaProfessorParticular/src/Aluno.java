import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;//atributo obrigatório, checar se null
	private String cpf;
	private String dataNasc;
	private String telefone;//atributo obrigatório, checar se null
	private String email;
	private String endereco;
	private String nivel;
	private String objetivoAprend;
	private SituacaoAluno situacao; //navegabilidade aluno > situação
	private List<InfoAula> infoAulas = new ArrayList<InfoAula>(); //navegabilidade aluno > infoAula

	// construtores
	public Aluno(String nome, String telefone) {
		setNome(nome);
		setTelefone(telefone);
		setSituacao(SituacaoAluno.PROSPECCAO);// caso a situação não seja dita, será sempre prospecção
	}

	public Aluno(String nome, String telefone, SituacaoAluno situacao) { 
		setNome(nome);
		setTelefone(telefone); 
		setSituacao(situacao); 
	}

	// getters & setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null) {
			throw new RuntimeException("Erro aluno: Nome inválido.");
		}else if(nome.length() >= 3) {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null) {
			throw new RuntimeException("Erro aluno: CPF inválido.");
		}else if(cpf.length() == 11) {
			this.cpf = cpf;
		} 
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone ==  null) {
			throw new RuntimeException("Erro aluno: Telefone inválido.");
		}else if(telefone.length() == 9) { 
			this.telefone = telefone;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null) {
			throw new RuntimeException("Erro aluno: E-mail inválido");
		}else if(email.contains("@")) {
			this.email = email;
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getObjetivoAprend() {
		return objetivoAprend;
	}

	public void setObjetivoAprend(String objetivoAprend) {
		this.objetivoAprend = objetivoAprend;
	}

	
	public SituacaoAluno getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoAluno situacao) {
		if(situacao == null) {
			throw new RuntimeException("Erro Aluno: Situação inválida");
		}else {
			this.situacao = situacao;
		}
	}

	public List<InfoAula> getInfoAulas() {
		return infoAulas;
	}

	public void addInfoAula(InfoAula infoAula) {
		this.infoAulas.add(infoAula);
	}
	
	
} // Aluno.
