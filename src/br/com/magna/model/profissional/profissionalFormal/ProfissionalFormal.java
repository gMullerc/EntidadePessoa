package br.com.magna.model.profissional.profissionalFormal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import br.com.magna.enumerator.enumEscolaridade;
import br.com.magna.enumerator.enumEtnia;
import br.com.magna.enumerator.enumGenero;
import br.com.magna.enumerator.enumSituacaoEscolar;
import br.com.magna.model.Endereco;
import br.com.magna.model.profissional.Profissional;

public abstract class ProfissionalFormal extends Profissional {

	protected int horasTrabalhadas;
	protected int carteiraDeTrabalho;
	protected String nomeDaEmpresa;
	protected LocalDate diaDeInicio;
	protected int pis;

	public ProfissionalFormal(String nome, enumGenero genero, enumEtnia etnia, LocalDate dataDeNascimento,
			String certidaoDeNascimento, String rg, String cpf, int contato, Endereco endereco, String estadoCivil,
			enumEscolaridade escolaridade, enumSituacaoEscolar situacaoEscolar, String cargo, double remuneracao,
			int carteiraDeTrabalho, String nomeDaEmpresa, LocalDate diaDeInicio, int pis) {
		super(nome, genero, etnia, dataDeNascimento, certidaoDeNascimento, rg, cpf, contato, endereco, estadoCivil,
				escolaridade, situacaoEscolar, cargo, remuneracao);
		this.carteiraDeTrabalho = carteiraDeTrabalho;
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.diaDeInicio = diaDeInicio;
		this.pis = pis;
	}

	public void baterPonto(LocalTime horaInicial, LocalTime horaFinal) {

		int somaInicial = horaInicial.getHour() * 60 + horaInicial.getMinute() + horaInicial.getSecond();

		int somaFinal = horaFinal.getHour() * 60 + horaFinal.getMinute() + horaFinal.getSecond();

		if (somaFinal > somaInicial) {
			int resultado = somaFinal - somaInicial;
			int aux = resultado % 60;

			this.horasTrabalhadas = resultado / 60;
			System.out.printf("%d horas e %d minutos\n",this.horasTrabalhadas, aux);
			

		} else if (somaFinal <= somaInicial) {
			int resultado = 1440 - somaInicial;
			resultado += somaFinal;

			int aux = resultado % 60;
			this.horasTrabalhadas = resultado / 60;
			System.out.printf("%d horas e %d minutos\n",this.horasTrabalhadas, aux);
		}
		descancoSemanal();
	}

	public void descancoSemanal() {
		if (this.horasTrabalhadas >= 40) {
			System.out.println("Descançando!!!....");
			this.horasTrabalhadas = 0;
		} else {
			int faltante = 40 - this.horasTrabalhadas;
			System.out.printf("apenas mais %d horas para a folga...", faltante);
		}

	}

	public void tirarFerias(LocalDate d) {
			
	}
}
