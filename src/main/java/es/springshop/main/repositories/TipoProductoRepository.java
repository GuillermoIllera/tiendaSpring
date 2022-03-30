package es.springshop.main.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import es.springshop.main.services.ITipoProducto;

@Repository
@Transactional
public class TipoProductoRepository implements ITipoProducto{

	@PersistenceContext
	private EntityManager entityManager;
	
}
