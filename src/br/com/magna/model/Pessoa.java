package br.com.magna.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.magna.enumerator.enumEtnia;
import br.com.magna.enumerator.enumGenero;

public abstract class Pessoa {
	private String nome;
	private enumGenero genero;
	private enumEtnia etnia;
	private LocalDate dataDeNascimento;
	private List<String> falas = new ArrayList<>();

	public void aprenderNovasFalas(String frase) {
		this.falas.add(frase);
	}

	public void andar() {
		System.out.println("Andando...");
	}

	public void falar() {
		pensar();
		Scanner sc = new Scanner(System.in);
		int escolha = sc.nextInt();
		System.out.println(this.falas.get(escolha));
		sc.close();
	}

	public void agarrar() {
		System.out.println("Peguei..");
	}

	public void pensar() {

		for (String string : falas) {

			System.out.print(string);
		}
	}

}
