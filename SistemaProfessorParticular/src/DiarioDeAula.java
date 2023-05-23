import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DiarioDeAula {
	private LocalDate data; //obrigatório, checar se null
	private LocalTime horaIncial; //obrigatório, checar se null
	private LocalTime horaFinal; //obrigatório, checar se null
	private String tarefasDeCasa; 
	private String feedback;
	private String dificuldades;
	private String ideiasAulasFuturas;
	private boolean pago; //obrigatório, checar se null - false by default, não existe boolean null
	private StatusAula statusAula; //obrigatório, checar se null
	private List<MaterialAula> materiaisAula = new ArrayList<MaterialAula>();
	private RegistroPagamento registroPagamento; 
	
	
	//construtores
	public DiarioDeAula(int ano, int mes, int dia, int horaI, int minutoI, int horaF, int minutoF) {
		setData(ano, mes, dia);
		setHoraIncial(horaI, minutoI);
		setHoraFinal(horaF, minutoF);
		setStatusAula(StatusAula.AGENDADA);//sempre começa como agendada e pode ser atualizada depois
		setPago(false);//aula sempre começa como não paga, pode ser atualizado no dia do pagamento ou quando o status mudar para CANCELAMENTO
	}

	
	//getters & setters
	public LocalDate getData() {
		return data;
	}
	
	
	public void setData(int ano, int mes, int dia) {
		if(dia == 00 || mes == 00 || ano == 0000) {
			throw new RuntimeException("Erro DiarioDeAula: data inválida");
		}else {
			this.data = LocalDate.of(ano, mes, dia);
		}
	}
	
	
	public LocalTime getHoraIncial() {
		return horaIncial;
	}
	
	
	public void setHoraIncial(int horaI, int minutoI) {
		if(horaI == 0) {//meia noite seria hora 00, como testar se é nulo?
			throw new RuntimeException("Erro DiarioDeAula: horaIncial inválida");
		}else {
			this.horaIncial = LocalTime.of(horaI, minutoI);
		}
	}
	
	
	public LocalTime getHoraFinal() {
		return horaFinal;
	}
	
	
	public void setHoraFinal(int horaF, int minutoF) {
		if(horaF == 0) {//meia noite seria hora 00, como testar se é nulo?
			throw new RuntimeException("Erro DiarioDeAula: horaIncial inválida");
		}else {
			this.horaFinal = LocalTime.of(horaF, minutoF);
		}
	}
	
	
	public String getTarefasDeCasa() {
		return tarefasDeCasa;
	}
	
	
	public void setTarefasDeCasa(String tarefasDeCasa) {
		this.tarefasDeCasa = tarefasDeCasa;
	}
	
	
	public String getFeedback() {
		return feedback;
	}
	
	
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	public String getDificuldades() {
		return dificuldades;
	}
	
	
	public void setDificuldades(String dificuldades) {
		this.dificuldades = dificuldades;
	}
	
	
	public String getIdeiasAulasFuturas() {
		return ideiasAulasFuturas;
	}
	
	
	public void setIdeiasAulasFuturas(String ideiasAulasFuturas) {
		this.ideiasAulasFuturas = ideiasAulasFuturas;
	}
	
	
	public boolean isPago() {
		return pago;
	}
	
	
	public void setPago(boolean pago) {
		this.pago = pago;
	}


	public StatusAula getStatusAula() {
		return statusAula;
	}


	public void setStatusAula(StatusAula statusAula) {
		if(statusAula == null) {
			throw new RuntimeException("Erro DiarioDeAula: statusAula inválida");
		}else {
			this.statusAula = statusAula;
		}
	}


	public List<MaterialAula> getMateriaisAula() {
		return materiaisAula;
	}

	public void addMateriaisAula(MaterialAula materialAula) {
		if(materialAula == null) {
			throw new RuntimeException("Erro diarioDeAula: MaterialAula inválido");
		}else {
			this.materiaisAula.add(materialAula);
		}
	}


	public RegistroPagamento getRegistroPagamento() {
		return registroPagamento;
	}


	public void setRegistroPagamento(RegistroPagamento registroPagamento) {
		this.registroPagamento = registroPagamento;
	}
		
}//DiarioDeAula.
