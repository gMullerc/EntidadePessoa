package br.com.magna.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Pessoa {

	private String nome;
	private String CertidaoDeNascimento;
	private GeneroEnum genero;
	private String etnia;
	private String dataDeNascimento; 
		
	
	
	public Pessoa(String nome, String CertidaoDeNascimento, GeneroEnum genero, String etnia, String dataDeNascimento){
		this.nome = nome;
		this.CertidaoDeNascimento = CertidaoDeNascimento;
		this.genero = genero;
		this.etnia = etnia;
		this.dataDeNascimento = converterData(dataDeNascimento);
	}

	public String converterData(String s){
		String data = s;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(data, formatter);
		String dia = ld.format(formatter); 
		return dia;
	}
	public GeneroEnum MeuGenero() {
		return this.genero;
	}
	
	
	public void andar(){
		System.out.println("Caminhando");
	}

}
