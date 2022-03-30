package es.springshop.main.services;

import java.util.List;

import es.springshop.main.models.Tiposp;

public interface ITiposP {
	List<Tiposp> getTiposProducto();
	void deleteCompra(Long id);
	void addTipoProducto(Tiposp tipo);
}
