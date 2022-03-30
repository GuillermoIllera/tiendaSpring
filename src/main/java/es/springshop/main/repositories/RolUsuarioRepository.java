package es.springshop.main.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import es.springshop.main.models.RolUsuario;
import es.springshop.main.services.IRolUsuario;

@Repository
@Transactional
public class RolUsuarioRepository implements IRolUsuario{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<RolUsuario> getRolesDeUsuario(Long id) {
		return null;
	}

	@Override
	public void otorgarRol(Long idRol, Long idUsuario) {
		
	}

	@Override
	public void revocarRol(Long idRol, Long idUsuario) {
		
	}

}
