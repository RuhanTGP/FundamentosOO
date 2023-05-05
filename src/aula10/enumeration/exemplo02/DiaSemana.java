package aula10.enumeration.exemplo02;

public enum DiaSemana {

	DOMINGO(1, "Domingo"),
	SEGUNDA(2, "Segunda-feira"),
	TERCA(3, "Terça-feira"),
	QUARTA(4, "Quarta-feira"),
	QUINTA(5, "Quinta-feira"), 
	SEXTA(6, "Sexta-feira"),
	SABADO(7, "Sábado");
	
	private int diaNumeroSemana;
	private String diaExtensoSemana;
	
	private DiaSemana(int diaNumeroSemana, String diaExtensoSemana) {
		
		this.diaNumeroSemana = diaNumeroSemana;
		this.diaExtensoSemana = diaExtensoSemana;
	}

	public int getDiaNumeroSemana() {
		return diaNumeroSemana;
	}

	public String getDiaExtensoSemana() {
		return diaExtensoSemana;
	}
}







