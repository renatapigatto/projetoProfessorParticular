
public class MaterialAula {
	private String descricaoMaterial;
	private TipoMaterial tipoMaterial;
	
	//construtor
	public MaterialAula(String descricaoMaterial, TipoMaterial tipoMaterial) {
		setDescricaoMaterial(descricaoMaterial);
		setTipoMaterial(tipoMaterial);
	}
	
	//getters & setters
	public String getDescricaoMaterial() {
		return descricaoMaterial;
	}

	public void setDescricaoMaterial(String descricaoMaterial) {
		if(descricaoMaterial == null) {
			throw new RuntimeException("Erro MaterialAula: descricaoMaterial inválida");
		}else {
			this.descricaoMaterial = descricaoMaterial;
		}
	}

	public TipoMaterial getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(TipoMaterial tipoMaterial) {
		if(tipoMaterial == null) {
			throw new RuntimeException("Erro MaterialAula: tipoMaterial inválido");
		}else {
			this.tipoMaterial = tipoMaterial;
		}
	}
	
	
}//MaterialAula.
