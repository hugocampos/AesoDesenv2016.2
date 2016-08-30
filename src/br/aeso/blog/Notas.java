package br.aeso.blog;

import java.util.ArrayList;

public class Notas extends Conteudo{
	private ArrayList<Comentarios> comentarios;
	
	public Notas(String data, String texto, Usuario autor) {
		super(data, texto, autor);
	}

	public void inserirComentario(Comentarios comentarios){
		this.comentarios = comentarios;
	}
	public ArrayList<Comentarios> getComentarios() {
		return comentarios;
	}
	
	public void setComentarios(ArrayList<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}

}
