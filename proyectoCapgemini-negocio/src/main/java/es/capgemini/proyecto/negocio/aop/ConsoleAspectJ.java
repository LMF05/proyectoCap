package es.capgemini.proyecto.negocio.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class ConsoleAspectJ {
	
	@Before("execution(* es.capgemini.proyecto.negocio.metodos.Metodos.nuevoJugador())")
	public void antesMetodo1(JoinPoint point) {
		System.out.println("Ejecutando metodo 1");
	}
	
	
	@After("execution(* es.capgemini.proyecto.negocio.metodos.Metodos.nuevoJugador())")
	public void despuesMetodo1(JoinPoint point) {
		System.out.println("Ejecutado metodo 1");
	}
	
	@Before("execution(* es.capgemini.proyecto.negocio.metodos.Metodos.eliminarJugador(..))")
	public void antesMetodo2(JoinPoint point) {
		System.out.println("Ejecutando metodo 2");
	}
	
	
	@After("execution(* es.capgemini.proyecto.negocio.metodos.Metodos.eliminarJugador(..))")
	public void despuesMetodo2(JoinPoint point) {
		System.out.println("Ejecutado metodo 2");
	}
	
	
}
