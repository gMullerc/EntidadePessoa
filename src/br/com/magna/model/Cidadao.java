package br.com.magna.model;

import br.com.magna.enumerator.enumEscolaridade;
import br.com.magna.enumerator.enumSituacaoEscolar;

public abstract class Cidadao extends Pessoa {

	private String certidaoDeNascimento;
	private String rg;
	private String cpf;
	private int contato;
	private Endereco endereco;
	private enumEscolaridade escolaridade;
	private enumSituacaoEscolar situacaoEscolar;

	public void matricularEmUmaInstituicao(enumEscolaridade i) throws Exception {
		try {

			if (this.situacaoEscolar == enumSituacaoEscolar.Completo
					|| this.situacaoEscolar == enumSituacaoEscolar.Incompleto) {
				this.escolaridade = i;
			}

		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}