
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class InfoAula {
	private String diaSemana; //obrigatório, checar se null
	private LocalTime horaInicial; //obrigatório, checar se null 
	private int duracaoAula; //obrigatório, checar se 0
	private float valorHoraAula; //obrigatório, checar se 0
	private LocalDate dataInicial; //obrigatório, checar se null
	private LocalDate dataFinal; //obrigatório, checar se null
	private LocalAula localAula; //obrigatório, checar se null
	private List<DiarioDeAula> diariosDeAula = new ArrayList<DiarioDeAula>();//navegabilidade infoAula > DiarioDeAula

	
	//construtor
	public InfoAula(String diaSemana, int horaI, int minutoI, int duracaoAula, float valorHoraAula, int anoI, int mesI, int diaI, int anoF, int mesF, int diaF, LocalAula localAula) {
		setDiaSemana(diaSemana);
		setHoraInicial(horaI, minutoI); 
		setDuracaoAula(duracaoAula);
		setValorHoraAula(valorHoraAula);
		setDataInicial(anoI, mesI, diaI);
		setDataFinal(anoF, mesF, diaF);
		setLocalAula(localAula);
	}
	
	
	//getters & setters
	public String getDiaSemana() {
		return diaSemana;
	}
	
	
	public void setDiaSemana(String diaSemana) {
		if (diaSemana == null) {
			throw new RuntimeException("Erro InfoAula: diaSemana inválido.");
		}else {
			this.diaSemana = diaSemana;
		}
	}
	
	
	public LocalTime getHoraInicial() {
		return horaInicial;
	}
	
	
	public void setHoraInicial(int horaI, int minutoI) {
		if (horaI == 00) {//meia noite seria hora 00, como testar se é nulo?
			throw new RuntimeException("Erro InfoAula: horaInicial inválido.");
		}else {
			this.horaInicial = LocalTime.of(horaI, minutoI);
		}
	}
	
	
	public int getDuracaoAula() {
		return duracaoAula;
	}
	
	
	public void setDuracaoAula(int duracaoAula) {
		if (duracaoAula == 0) {
			throw new RuntimeException("Erro InfoAula: duracaoAula inválido.");
		}else {
			this.duracaoAula = duracaoAula;
		}
	}
	
	
	public float getValorHoraAula() {
		return valorHoraAula;
	}
	
	
	public void setValorHoraAula(float valorHoraAula) {
		if (valorHoraAula == 0) {
			throw new RuntimeException("Erro InfoAula: valorHoraAula inválido.");
		}else {
			this.valorHoraAula = valorHoraAula;
		}
	}
	
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}


	public void setDataInicial(int anoI, int mesI, int diaI) {
		if (anoI == 0000 || mesI == 00 || diaI == 00) {
			throw new RuntimeException("Erro InfoAula: dataInicial inválido.");
		}else {
			this.dataInicial = LocalDate.of(anoI, mesI, diaI);//o tipo LocalDate exige um valor, ver como inicializar
		}
	}


	public LocalDate getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(int anoF, int mesF, int diaF) {
		if (anoF == 0000 || mesF == 00 || diaF == 00) {
			throw new RuntimeException("Erro InfoAula: dataFinal inválido.");
		}else {
			this.dataFinal = LocalDate.of(anoF, mesF, diaF); 
		}
	}


	public LocalAula getLocalAula() {
		return localAula;
	}


	public void setLocalAula(LocalAula localAula) {
		if (localAula == null) {
			throw new RuntimeException("Erro InfoAula: LocalAula inválido.");
		}else {
			this.localAula = localAula;
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
	
	

}//InfoAula.
