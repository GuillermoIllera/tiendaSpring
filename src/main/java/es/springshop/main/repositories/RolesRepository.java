package es.springshop.main.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import es.springshop.main.models.Roles;
import es.springshop.main.services.IRoles;
@Repository
@Transactional
public class RolesRepository implements IRoles{


	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Roles> getRoles() {
		return null;
	}

	@Override
	public void borrarRol(Long id) {
		
	}

	@Override
	public void registrarRol(Roles rol) {
		
	}

}
