package br.com.magna.model;

import br.com.magna.enumerator.enumEscolaridade;
import br.com.magna.enumerator.enumSituacaoEscolar;

public abstract class Cidadao extends Pessoa {

	protected String certidaoDeNascimento;
	protected String rg;
	protected String cpf;
	protected int contato;
	protected Endereco endereco;
	protected String estadoCivil;
	protected enumEscolaridade escolaridade;
	protected enumSituacaoEscolar situacaoEscolar;

	public void matricularEmUmaInstituicao(enumEscolaridade i) throws Exception {
	
			if (this.situacaoEscolar == enumSituacaoEscolar.Cursando) {
				this.escolaridade = i;

			}else{
				System.out.println("Você já esta matriculado em uma instituicao");
			}
	}
}