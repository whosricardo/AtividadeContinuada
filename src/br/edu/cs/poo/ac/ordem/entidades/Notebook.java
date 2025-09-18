package br.edu.cs.poo.ac.ordem.entidades;

import lombok.experimental.SuperBuilder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuperBuilder
public class Notebook extends Equipamento {
	private boolean carregaDadosSensiveis;
}