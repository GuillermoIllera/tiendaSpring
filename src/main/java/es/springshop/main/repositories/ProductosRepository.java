package es.springshop.main.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import es.springshop.main.models.Productos;
import es.springshop.main.services.IProductos;

@Repository
@Transactional
public class ProductosRepository implements IProductos{


	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Productos> getProductos() {
		return null;
	}

	@Override
	public void borrarProducto(Long id) {
		
	}

	@Override
	public void addProducto(Productos producto) {
		
	}

}
