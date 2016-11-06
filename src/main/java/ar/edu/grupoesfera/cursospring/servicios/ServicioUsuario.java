package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface ServicioUsuario {

	public Boolean creaAgregaUsuarioALista(Usuario usuario);
	public List<Usuario> verListaUsuarios();
	public Usuario validarUsuario(String nombre, String password);

}