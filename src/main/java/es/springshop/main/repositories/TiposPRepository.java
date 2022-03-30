package es.springshop.main.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import es.springshop.main.models.Tiposp;
import es.springshop.main.services.ITiposP;
@Repository
@Transactional
public class TiposPRepository implements ITiposP{


	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Tiposp> getTiposProducto() {
		return null;
	}

	@Override
	public void deleteCompra(Long id) {
		
	}

	@Override
	public void addTipoProducto(Tiposp tipo) {
		
	}

}
