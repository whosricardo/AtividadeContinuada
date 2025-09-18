package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Equipamento {
	private String descricao;
	private Dificuldade tipo;
	private boolean ehNovo;
	private double valorEstimado;
}
