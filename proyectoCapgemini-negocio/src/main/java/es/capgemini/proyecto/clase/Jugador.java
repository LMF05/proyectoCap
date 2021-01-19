package es.capgemini.proyecto.clase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.capgemini.proyecto.metodos.Metodos;

@Component
public class Jugador {

	@Autowired
	Metodos metodos;
	
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
	
	public void aspectJ() {
		metodos.Metodo1();
		metodos.Metodo2();
	}
}
