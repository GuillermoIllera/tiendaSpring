package es.springshop.main.services;

import java.util.List;

import es.springshop.main.models.Roles;

public interface IRoles {
	List<Roles> getRoles();
	void borrarRol(Long id);
	void registrarRol(Roles rol);
}
