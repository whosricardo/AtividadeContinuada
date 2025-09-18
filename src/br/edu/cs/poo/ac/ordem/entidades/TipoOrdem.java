package br.edu.cs.poo.ac.ordem.entidades;

public enum TipoOrdem {
	MANUTENCAO(1, "Manutenção"),
	CONFIGURACAO(2, "Configuração"),
	UPGRADE(3, "Upgrade");
	
	private int codigo;
	private String nome;
	
	private TipoOrdem(int codigo, String nome) { this.codigo = codigo; this.nome = nome; }
	
	public int getCodigo() { return this.codigo; }
	
	public String getNome() { return this.nome; }
	
	public static TipoOrdem getTipoOrdem(int codigo) {
		for (TipoOrdem tipo : TipoOrdem.values()) {
			if (codigo == tipo.getCodigo()) { return tipo; }
		}
		
		return null;
	}
	
}
