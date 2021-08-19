package app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.TrabajadorDAO;
import app.dto.Trabajador;
@Service
public class TrabajadorServiceImpl implements ITrabajadorService {
	@Autowired
	TrabajadorDAO trabajadorDAO;
	@Override
	public List<Trabajador> listarTrabajadores() {
		return trabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		return trabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorXID(Integer id) {
		return trabajadorDAO.findById(id).get();
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		return trabajadorDAO.save(trabajador);
	}

	@Override
	public List<Trabajador> listarTrabajadorTrabajo(String trabajo) {
		return trabajadorDAO.findByTrabajo(trabajo);
	}

	@Override
	public void eliminarTrabajador(Integer id) {
		trabajadorDAO.deleteById(id);
	}

}
