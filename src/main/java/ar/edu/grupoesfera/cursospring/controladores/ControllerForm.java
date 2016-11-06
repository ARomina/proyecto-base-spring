/*package ar.edu.grupoesfera.cursospring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerForm {
	@RequestMapping ("/irform")
	public ModelAndView insertPerson(){
	ModelMap model = new ModelMap();
	Persona persona = new Persona;  //crear clase Persona
	model.put("persona", persona);
	//persona.setNombre("Juan");
	//persona.setApellido("Alvarez");
	//persona.setMail("juanalvarez@hotmail.com");
	//persona.setEdad(34);
	return new ModelAndView("personaform", model); 
	}
	
	@RequestMapping(path="/saludo", method = RequestMethod.POST)
	public ModelAndView addContact(@ModelAttribute = "persona", Persona persona){
	ModelMap modelo = new ModelMap();
	TablaPersonas tabla = TablaPersonas.getInstance();  //crear clase TablaPersonas?
	tabla.crearPersona(persona);
	modelo.put("tabla", modelo.ListarTodas());
	ModelAndView miVista = new ModelAndView();
	miVista.setViewName("tablaPersonas");
	miVista.addAllObjects(modelo);
	return miVista;
	}
}*/
