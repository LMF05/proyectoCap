package es.capgemini.proyecto.front.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		
		mv.addObject("mensaje", "HOLA!!");
		
		return mv;
	}

}
