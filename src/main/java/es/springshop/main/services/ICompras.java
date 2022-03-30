package es.springshop.main.services;

import java.util.List;

import es.springshop.main.models.Compras;
public interface ICompras {
	
	List<Compras> getCompras();
	void borrarCompra(Long id);
	void registrarCompra(Compras compra);
	
}