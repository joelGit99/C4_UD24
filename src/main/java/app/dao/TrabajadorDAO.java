package app.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import app.dto.Trabajador;
/**
 * 
 * @author Joel
 *
 */
public interface TrabajadorDAO extends JpaRepository<Trabajador, Integer> {
	
	// Listar trabajadores por trabajo
	public List<Trabajador> findByTrabajo(String trabajo);
}
