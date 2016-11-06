package ar.edu.grupoesfera.cursospring.modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TablaUsuarios {

	private static TablaUsuarios instance = new TablaUsuarios();
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	
	public static TablaUsuarios getInstance(){
		return instance;
	}
	
	//Constructor
	public TablaUsuarios(){}
	
	//Métodos
	//Crea un usuario (se le pasa el mismo)y lo agrega a la lista de usuarioS
	public Boolean creaAgregaUsuarioALista(Usuario usuario){
		return this.usuarios.add(usuario);
	}
	
	//Ver el LISTADO de usuarioS
	public List<Usuario> verListaUsuarios(){
		return this.usuarios;
	}
	/*
	//Busca el USUARIO en la LISTA (usuarioS)
	public Usuario buscaUsuarioEnLista(String nombreIngresado){
		//Iterador de tipo Usuario, itera en LISTA usuarioS, mientras haya un próximo elemento
		for(Iterator<Usuario> it = usuarios.iterator(); it.hasNext();){
			//Usuario siendo el próximo elemento
			Usuario eachUsuario = it.next();
			if(eachUsuario.getUsuario().equals(nombreIngresado)){
				eachUsuario.getUsuario();
				eachUsuario.getPassword();
				eachUsuario.getRol();
				//Duda al retornar ese usuario
				return eachUsuario;
			}
		}
		//por qué retorna null?
		return null;
	}*/
	
	//Validación de usuario
	public Usuario validarUsuario(String nombre, String password){
		//Iterador de tipo Usuario, itera en LISTA usuarioS, mientras haya un próximo elemento
				for(Iterator<Usuario> it = usuarios.iterator(); it.hasNext();){
					//Usuario siendo el próximo elemento
					Usuario eachUsuario = it.next();
					if(eachUsuario.getUsuario().equals(nombre) && eachUsuario.getPassword().equals(password)){
						return eachUsuario;
					}
				}
		return null;
	}
	
}