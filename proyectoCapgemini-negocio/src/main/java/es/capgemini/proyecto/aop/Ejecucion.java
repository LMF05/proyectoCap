package es.capgemini.proyecto.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.capgemini.proyecto.clase.Jugador;

public class Ejecucion {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		Jugador componente = (Jugador) context.getBean(Jugador.class);

		// Resultado método de negocio
		componente.aspectJ();

		// Cerrar contexto de Spring
		((ConfigurableApplicationContext) context).close();

	}

}
