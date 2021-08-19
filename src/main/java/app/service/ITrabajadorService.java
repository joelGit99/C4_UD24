package app.service;

import java.util.List;

import app.dto.Trabajador;

/**
 * 
 * @author Joel
 *
 */
public interface ITrabajadorService {
	
	// Métodos del CRUD
	public List<Trabajador> listarTrabajadores(); // Listar all
	public Trabajador guardarTrabajador(Trabajador trabajador); // Guardar un trabajador CREATE
	public Trabajador trabajadorXID(Integer id); // Leer datos de un trabajador READ
	public Trabajador actualizarTrabajador(Trabajador trabajador); // Actualizar trabajador PUT
	public List<Trabajador> listarTrabajadorTrabajo(String trabajo); // Listar trabajadores por trabajo
	public void eliminarTrabajador(Integer id); // Eliminar trabajadores DELETE
}
