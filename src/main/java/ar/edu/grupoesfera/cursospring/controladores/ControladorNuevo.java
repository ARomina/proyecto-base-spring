/*package ar.edu.grupoesfera.cursospring.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;
import ar.edu.grupoesfera.cursospring.servicios.ServicioUsuario;

@RestController
//@Controller
public class ControladorNuevo {

	@Inject
	private ServicioUsuario personaService;
	/*
	@RequestMapping(value="/login")
	public ModelAndView verLogin(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView ("login", modelo);
	}
	*//*
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("usuario") Usuario usuario, HttpServletRequest request) {
		Usuario usuarioValidado = personaService.validarUsuario(usuario.getUsuario(), usuario.getPassword());
		if(usuarioValidado != null){
		request.getSession().setAttribute("ROL",usuarioValidado.getRol());
		return new ModelAndView("home");
		} else {
		ModelMap model = new ModelMap();
		model.put("error", "usuario-invalido");
		return new ModelAndView("login", model);
		}
	}
	
	@RequestMapping(value="/usuarioLoginMensaje")
	public ModelAndView verLoginMensaje(){
		ModelMap modelo = new ModelMap();
		String info = "YEAH LOGIN!";
		modelo.put("info", info);
		return new ModelAndView ("usuarioLoginMensaje", modelo);
	}

	//Getters y Setters
	public ServicioUsuario getPersonaService() {
		return personaService;
	}

	public void setPersonaService(ServicioUsuario personaService) {
		this.personaService = personaService;
	}
	
	
}
*/