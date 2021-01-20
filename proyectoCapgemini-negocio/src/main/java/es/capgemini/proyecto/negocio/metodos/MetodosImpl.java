package es.capgemini.proyecto.negocio.metodos;

import org.springframework.stereotype.Repository;

@Repository
public class MetodosImpl implements Metodos{

	@Override
	public void Metodo1() {
		System.out.println("Metodo 1");
		
	}

	@Override
	public void Metodo2() {
		System.out.println("Metodo 2");
		
	}

		
}
