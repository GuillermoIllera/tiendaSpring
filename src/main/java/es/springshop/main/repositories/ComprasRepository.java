package es.springshop.main.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import es.springshop.main.models.Compras;
import es.springshop.main.services.ICompras;

@Repository
@Transactional
public class ComprasRepository implements ICompras{


	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Compras> getCompras() {
		return null;
	}

	@Override
	public void borrarCompra(Long id) {
		
	}

	@Override
	public void registrarCompra(Compras compra) {
		
	}

}
