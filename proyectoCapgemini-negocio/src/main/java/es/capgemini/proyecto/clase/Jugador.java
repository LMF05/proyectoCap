package es.capgemini.proyecto.clase;

import java.util.List;

public class Jugador {

	private int edad;
	private String nombre;
	private String descripcion;
	private List<String> juegos;
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public List<String> getJuegos() {
		return juegos;
	}
	
	public void setJuegos(List<String> juegos) {
		this.juegos = juegos;
	}
	
}
