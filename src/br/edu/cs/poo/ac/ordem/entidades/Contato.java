package br.edu.cs.poo.ac.ordem.entidades;

public class Contato {
	private String email;
	private String celular;
	private boolean ehZap;
	
	public Contato(String email, String celular, boolean ehZap) {
		super();
		this.email = email;
		this.celular = celular;
		this.ehZap = ehZap;
	}

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public String getCelular() { return celular; }
	public void setCelular(String celular) { this.celular = celular; }

	public boolean isEhZap() { return ehZap; }
	public void setEhZap(boolean ehZap) { this.ehZap = ehZap; }
}
