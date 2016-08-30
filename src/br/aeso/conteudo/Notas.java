package br.aeso.conteudo;

import java.util.ArrayList;

import br.aeso.usuario.Usuario;

public class Notas extends Conteudo{
	private ArrayList<Comentarios> comentarios;
	
	public Notas(String data, String texto, Usuario autor) {
		super(data, texto, autor);
	}

	public void inserirComentario(Comentarios comentarios){
		this.comentarios.add(comentarios);
	}
	
	public void removerComentarios(Comentarios comentarios){
		this.comentarios.remove(comentarios);
	}
	
	public ArrayList<Comentarios> getComentarios() {
		return comentarios;
	}
	
	public void setComentarios(ArrayList<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}

}
