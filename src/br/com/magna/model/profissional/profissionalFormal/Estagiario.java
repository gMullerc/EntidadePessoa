package br.com.magna.model.profissional.profissionalFormal;

import java.time.LocalDate;

import br.com.magna.enumerator.enumEscolaridade;
import br.com.magna.enumerator.enumEtnia;
import br.com.magna.enumerator.enumGenero;
import br.com.magna.enumerator.enumSituacaoEscolar;
import br.com.magna.model.Endereco;

public class Estagiario extends ProfissionalFormal implements VinculoEsudantil {

	public Estagiario(String nome, enumGenero genero, enumEtnia etnia, LocalDate dataDeNascimento,
			String certidaoDeNascimento, String rg, String cpf, int contato, Endereco endereco, String estadoCivil,
			enumEscolaridade escolaridade, enumSituacaoEscolar situacaoEscolar, String cargo, double remuneracao,
			int carteiraDeTrabalho, String nomeDaEmpresa, LocalDate diaDeInicio, int pis) {
		super(nome, genero, etnia, dataDeNascimento, certidaoDeNascimento, rg, cpf, contato, endereco, estadoCivil,
				escolaridade, situacaoEscolar, cargo, remuneracao, carteiraDeTrabalho, nomeDaEmpresa, diaDeInicio, pis);

	}

	@Override
	public void verificar()  {
		if (this.escolaridade == enumEscolaridade.ensinoSuperior && this.situacaoEscolar == enumSituacaoEscolar.Cursando
				|| this.escolaridade == enumEscolaridade.ensinoMedio
						&& this.situacaoEscolar == enumSituacaoEscolar.Cursando) {

		}else {
			throw new RuntimeException("Para ser um estagiário é necessário estar cursando o ensino medio ou superior");
		}
		

	}

}
