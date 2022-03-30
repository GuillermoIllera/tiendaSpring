package es.springshop.main.services;

import java.util.List;

import es.springshop.main.models.Usuarios;

public interface IUsuario {
	List<Usuarios> getUsuarios();
	void borrarUsuario(Long id);
	void registrarUsuario(Usuarios usuario);
	boolean loguearUsuario(Usuarios usuario);
}
