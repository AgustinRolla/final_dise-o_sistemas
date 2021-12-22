package ar.edu.davinci.dvds20212cg7.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.edu.davinci.dvds20212cg7.domain.Prenda;
import ar.edu.davinci.dvds20212cg7.domain.TipoPrenda;
import ar.edu.davinci.dvds20212cg7.exception.BusinessException;

public interface PrendaService {
	
	// Métodos de creación, modificación y borrado.
	Prenda save(Prenda prenda) throws BusinessException;
	Prenda update(Prenda prenda) throws BusinessException;
	void delete(Prenda prenda);
	void delete(Long id);

	// Método de búsqueda.
	Prenda findById(Long id) throws BusinessException;
	
	
	// Método de listado.
	List<Prenda> list();
	Page<Prenda> list(Pageable pageable);
	
	// Método para contar cantidad de datos.
	long count();
	
	// Retorna la lista de tipos de prenda
	List<TipoPrenda> getTipoPrendas();
	

}



