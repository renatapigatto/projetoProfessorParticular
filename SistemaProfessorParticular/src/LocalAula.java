
public class LocalAula {
	private String descricaoLocal; //obrigatório, checar se null
	private TipoLocal tipoLocal; //obrigatório, checar se null
	
	//construtor
	
	public LocalAula(String descricaoLocal, TipoLocal tipoLocal){
		setDescricaoLocal(descricaoLocal);
		setTipoLocal(tipoLocal);
	}
	
	//getters & setters
	public String getDescricaoLocal() {
		return descricaoLocal;
	}
	
	public void setDescricaoLocal(String descricaoLocal) {
		if(descricaoLocal == null) {
			throw new RuntimeException("Erro LocalAula: Descrição de local inválida");
		}else {
			this.descricaoLocal = descricaoLocal;
		}
	}

	public TipoLocal getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(TipoLocal tipoLocal) {
		if(tipoLocal == null) {
			throw new RuntimeException("Erro LocalAula: Tipo de local inválida");
		}else {
			this.tipoLocal = tipoLocal;
		}
	}
	
}//LocalAula.
