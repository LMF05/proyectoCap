package es.capgemini.proyecto.negocio.metodos;

import es.capgemini.proyecto.negocio.clase.Jugador;

public interface Metodos {

	Jugador nuevoJugador();
	
	Jugador eliminarJugador(Jugador j);
	
	Jugador editarJugador(Jugador j);
}
