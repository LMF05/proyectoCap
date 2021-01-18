package es.capgemini.proyecto.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class ConsoleAspectJ {
	
	@Before("execution(void es.capgemini.proyecto.metodosaop.Metodo1())")
	public void antesMetodo1(JoinPoint point) {
		System.out.println("Ejecutando metodo 1");
	}
	
	
	@After("execution(void es.capgemini.proyecto.metodosaop.Metodo1())")
	public void despuesMetodo1(JoinPoint point) {
		System.out.println("Ejecutado metodo 1");
	}
	
	@Before("execution(void es.capgemini.proyecto.metodosaop.Metodo2())")
	public void antesMetodo2(JoinPoint point) {
		System.out.println("Ejecutando metodo 2");
	}
	
	
	@After("execution(void es.capgemini.proyecto.metodosaop.Metodo2())")
	public void despuesMetodo2(JoinPoint point) {
		System.out.println("Ejecutado metodo 2");
	}
	
	
}
