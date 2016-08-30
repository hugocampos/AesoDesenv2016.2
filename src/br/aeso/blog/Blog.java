package br.aeso.blog;

import java.util.ArrayList;

public class Blog {
	private String titulo;
	private String data;
	private Usuario dono;
	private ArrayList<Conteudo> conteudo;
	
	public Blog(String titulo, String data, Usuario dono) {
		super();
		this.titulo = titulo;
		this.data = data;
		this.dono = dono;
		conteudo = new ArrayList<>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Usuario getDono() {
		return dono;
	}
	public void setDono(Usuario dono) {
		this.dono = dono;
	}

	public ArrayList<Conteudo> listarConteudo() {
		return conteudo;
	}

	public void inserirConteudo(ArrayList<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
