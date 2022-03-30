package es.springshop.main.services;

import java.util.List;

import es.springshop.main.models.RolUsuario;

public interface IRolUsuario {
	List<RolUsuario> getRolesDeUsuario(Long id);
	void otorgarRol(Long idRol, Long idUsuario);
	void revocarRol(Long idRol, Long idUsuario);
}
