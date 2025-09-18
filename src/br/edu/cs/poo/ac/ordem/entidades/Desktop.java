package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Setter;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Desktop extends Equipamento {
	private boolean ehServidor;
}