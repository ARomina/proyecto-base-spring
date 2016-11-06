/*package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public ModelAndView vista(){
		return new ModelAndView("inicio");
	}
	
	@RequestMapping(value = "/mapa", method = RequestMethod.GET)
	public ModelAndView map(){
		ModelMap miMapa = new ModelMap();
		miMapa.put("nombre", "Juan");
		miMapa.put("apellido", "Juancio");
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("mapa");
		return miVista;
	}
	
	@RequestMapping(value= "/hi/amigo", method = RequestMethod.GET)
	public ModelAndView helloWorld(@RequestParam(value = "firstname", required = false) String nombre,
								   @RequestParam(value = "sourcename") String apellido){
		   String message = "El nombre ingresado es" + nombre + "!";
		   String message2 = "El apellido ingresado es" + apellido;
		   ModelMap model = new ModelMap();
		   model.put("msg", message);
		   model.put("msg2", message2);
		   return new ModelAndView ("mensaje", model);
	}
	//proyecto-base-spring/hi/amigo?nombre=Juan
	//proyecto-base-spring/hi/amigo?firstname=Juan&sourcename=Alvarez
	//proyecto-base4-spring/hi/amigo?sourcename=Alvarez --> firstname quedaria en null (era opcional)
	
	@RequestMapping (value = "/hola/{nombre}/{apellido}", method = RequestMethod.GET)
	public ModelAndView hellowWorld2(@PathVariable String nombre, @PathVariable String apellido){
		String message = "Hola, " + nombre + "!";
		String message2 = "El apellido ingresado es" + apellido;
		ModelMap model = new ModelMap();
		model.put("msg", message);
		model.put("msg2", message2);
		return new ModelAndView ("mensaje", model);
	}
	//proyecto-base-spring/hola/Juan/Alvarez
}*/
