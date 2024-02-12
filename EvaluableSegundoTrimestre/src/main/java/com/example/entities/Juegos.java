package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Juegos {
	
	@Id
	@GeneratedValue
	private Long idJuegos;
	private String titulo;
	private String genero;	
	private Long idUsuario;
 
	public Juegos() {
 
	}
 
	public Juegos(Long idJuegos, String titulo, String genero) {
		this.idJuegos = idJuegos;
		this.titulo = titulo;
		this.genero = genero;
 
	}
	
	@OneToMany
	@JoinColumn(name = "idUser")
	public JuegoUsuarioDTO juegoUsuario;
 
	public Long getIdJuegos() {
		return idJuegos;
	}
 
	public void setIdJuegos(Long idJuegos) {
		this.idJuegos = idJuegos;
	}
 
	
	public String getTitulo() {
		return titulo;
	}
 
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
 
	public String getGenero() {
		return genero;
	}
 
	public void setGenero(String genero) {
		this.genero = genero;
	}
 
	public Long getIdUsuario() {
		return idUsuario;
	}
 
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
