package es.springshop.main.services;

import java.util.List;

import es.springshop.main.models.Productos;

public interface IProductos {

	List<Productos> getProductos();
	void borrarProducto(Long id);
	void addProducto(Productos producto);
	
}
