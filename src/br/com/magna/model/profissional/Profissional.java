package br.com.magna.model.profissional;

import java.time.LocalDate;

import br.com.magna.enumerator.enumEscolaridade;
import br.com.magna.enumerator.enumEtnia;
import br.com.magna.enumerator.enumGenero;
import br.com.magna.enumerator.enumSituacaoEscolar;
import br.com.magna.model.Cidadao;
import br.com.magna.model.Endereco;

public abstract class Profissional extends Cidadao {

	protected String cargo;
	protected double remuneracao;

	public Profissional(String nome, enumGenero genero, enumEtnia etnia, LocalDate dataDeNascimento,
			String certidaoDeNascimento, String rg, String cpf, int contato, Endereco endereco, String estadoCivil,
			enumEscolaridade escolaridade, enumSituacaoEscolar situacaoEscolar, String cargo, double remuneracao) {
		this.nome = nome;
		this.genero = genero;
		this.etnia = etnia;
		this.dataDeNascimento = dataDeNascimento;
		this.certidaoDeNascimento = certidaoDeNascimento;
		this.rg = rg;
		this.cpf = cpf;
		this.contato = contato;
		this.endereco = endereco;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
		this.situacaoEscolar = situacaoEscolar;
		this.cargo = cargo;
		this.remuneracao = remuneracao;
	}

	public void trabalhar() {

		System.out.println("indo trabalhar...");
	}

}
