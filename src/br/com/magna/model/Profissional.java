package br.com.magna.model;

public abstract class Profissional extends Cidadao{
	
	private String cargo;
	private double remuneracao;
	
	public void trabalhar() {
		System.out.println("indo trabalhar...");
	}
	
}
