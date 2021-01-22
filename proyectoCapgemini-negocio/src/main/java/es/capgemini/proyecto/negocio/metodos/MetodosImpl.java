package es.capgemini.proyecto.negocio.metodos;

import org.springframework.stereotype.Repository;

import es.capgemini.proyecto.negocio.clase.Jugador;

@Repository
public class MetodosImpl implements Metodos{

	@Override
	public Jugador nuevoJugador() {
		return new Jugador();
	}

	@Override
	public Jugador eliminarJugador(Jugador j) {
		return null;
	}

	@Override
	public Jugador editarJugador(Jugador j) {
		return null;
	}

	
		
}
