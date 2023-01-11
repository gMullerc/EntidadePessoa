package br.com.magna.model.profissional.profissionalFormal;

import java.time.LocalDate;

import br.com.magna.enumerator.enumEscolaridade;
import br.com.magna.enumerator.enumEtnia;
import br.com.magna.enumerator.enumGenero;
import br.com.magna.enumerator.enumSituacaoEscolar;
import br.com.magna.model.Endereco;

public class JovemAprendiz extends Clt implements VinculoEsudantil{

	public JovemAprendiz(String nome, enumGenero genero, enumEtnia etnia, LocalDate dataDeNascimento,
			String certidaoDeNascimento, String rg, String cpf, int contato, Endereco endereco, String estadoCivil,
			enumEscolaridade escolaridade, enumSituacaoEscolar situacaoEscolar, String cargo, double remuneracao,
			int carteiraDeTrabalho, String nomeDaEmpresa, LocalDate diaDeInicio, int pis) {
		super(nome, genero, etnia, dataDeNascimento, certidaoDeNascimento, rg, cpf, contato, endereco, estadoCivil,
				escolaridade, situacaoEscolar, cargo, remuneracao, carteiraDeTrabalho, nomeDaEmpresa, diaDeInicio, pis);
	}

	@Override
	public void verificar() {
		// TODO Auto-generated method stub
		
	}
	
}
