
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;  


public class RegistroPagamento {
	private LocalDate dataPagamento;//obrigatório, mas vai pegar a data do sistema, não tem como ser null
	private float valorPago; //obrigatório, checar se 0
	private FormaPagamento formaPagamento; //obrigatório, checar se null
	private List<DiarioDeAula> diariosDeAula = new ArrayList<DiarioDeAula>();
	
	
	//construtor
	public RegistroPagamento(LocalDate dataPagamento, float valorPago, FormaPagamento formaPagamento, DiarioDeAula diarioDeAula){
		setDataPagamento(dataPagamento);//data do sistema
		setValorPago(valorPago);
		setFormaPagamento(formaPagamento);
		addDiarioDeAula(diarioDeAula);//aqui estaria add só 1 diario de aula, mas o pagamento pode corresponder a mais de um
	}
	
	//getters & setters
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = LocalDate.now();//data do sistema
	}
	
	public float getValorPago() {
		return valorPago;
	}
	
	public void setValorPago(float valorPago) {
		if(valorPago == 0) {
			throw new RuntimeException("Erro RegistroPagamento: valorPago inválida");
		}else {
			this.valorPago = valorPago;
		}
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		if(formaPagamento == null) {
			throw new RuntimeException("Erro RegistroPagamento: formaPagamento inválida");
		}else {
			this.formaPagamento = formaPagamento;
		}
	}
	
	public List<DiarioDeAula> getDiariosDeAula() {
		return diariosDeAula;
	}

	public void addDiarioDeAula(DiarioDeAula diarioDeAula) {
		if(diarioDeAula == null) {
			throw new RuntimeException("Erro RegistroPagamento: diarioDeAula inválido");
		}else {
			this.diariosDeAula.add(diarioDeAula);
		}
	}
	
	
}//RegistroPagamento.
