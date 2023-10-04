package com.bolsadeideas.springboot.web.app.models;

public class Usuario {
	
	//POJO clase simple de java que contiene atributos
	// getter y setter para acceder y modificar 
	
	private String nombre;
	private String apellido;
	private String email;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
