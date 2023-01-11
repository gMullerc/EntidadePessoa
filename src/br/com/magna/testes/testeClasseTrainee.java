package br.com.magna.testes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import br.com.magna.enumerator.enumEscolaridade;
import br.com.magna.enumerator.enumEtnia;
import br.com.magna.enumerator.enumGenero;
import br.com.magna.enumerator.enumSituacaoEscolar;
import br.com.magna.model.Endereco;
import br.com.magna.model.profissional.profissionalFormal.Trainee;

public class testeClasseTrainee {
	public static void main(String[] args) {

		Trainee t = new Trainee("Guilherme", enumGenero.masculino, enumEtnia.Pardo,
				LocalDate.of(2002, Month.AUGUST, 01), "232323", "232323", "23232323", 985421298, new Endereco("chinigua", 05736100, 3, "São Paulo", "SP", "Brasil"), "Solteiro",
				enumEscolaridade.ensinoSuperior, enumSituacaoEscolar.Cursando, "Desenvolvedor", 2200.0, 688233,
				"Magna Sistemas", LocalDate.of(2022, Month.DECEMBER, 10), 23232);
		t.aprenderNovasFalas("Oi, tudo bem?");
		t.aprenderNovasFalas("Estou bem e voce?");
		t.aprenderNovasFalas("Maluquice");
		
		
		t.baterPonto(LocalTime.of(23, 59, 00), LocalTime.of(19, 00, 32));
		

	}
}
