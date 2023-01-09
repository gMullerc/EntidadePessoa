package br.com.magna.entidades;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		EscolaridadeEnum escolha = EscolaridadeEnum.ensinoFundamental;
		Pessoa p = new Cidadao("JOAO", "123123123", GeneroEnum.MASCULINO , "PARDO", "01/08/2002");
		
		

		
		
		
		System.out.println(p.MeuGenero());
		
	}

}
