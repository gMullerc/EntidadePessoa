package br.com.magna.entidades;

public enum EscolaridadeEnum {
	ensinoFundamental(1), ensinoMedio(2), ensinoSuperior(3);

	private final int escolaridade;
	EscolaridadeEnum(int i) {
		escolaridade = i;
	}
	public int getEscolaridade() {
		return escolaridade;
	}
}
