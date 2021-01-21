package es.capgemini.proyecto.front.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.capgemini.proyecto.negocio.metodos.Metodos;

/*
 * @ModelAttributte => Crear atributos dentro del modelo
 * 
 * Se pueden enlazar tanto a argumentos como a devoluciones de los metodos de negocio
 * 
 * Contienen datos reutilizables
 * 
 * Metodos con @ModelAttributte se ejecutan siempre antes que los metodos de negocio
 */
@Controller
public class JugadorController {
	
	@Autowired
	Metodos metodos;
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("mensaje", "HOLA!!");
		
		return mv;
	}

}
