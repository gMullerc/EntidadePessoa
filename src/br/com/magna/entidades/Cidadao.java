package br.com.magna.entidades;

import java.time.LocalDate;

public class Cidadao extends Pessoa {

	private String rg;
	private String cpf;
	private String endereco;
	private int numeroDeContato;
	private EscolaridadeEnum escolaridade;
	private String estadoCivil;

	public Cidadao(String nome, String CertidaoDeNascimento, GeneroEnum genero, String etnia, String dataDeNascimento) {
		super(nome, CertidaoDeNascimento, genero, etnia, dataDeNascimento);
	}
	
	public void setDocumentos(String rg, String cpf){
		this.cpf = cpf;
		this.rg = rg;
	}

}
