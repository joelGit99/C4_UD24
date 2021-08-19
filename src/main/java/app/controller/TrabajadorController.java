package app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.dto.Trabajador;
import app.service.TrabajadorServiceImpl;

@RestController
@RequestMapping("/api")
public class TrabajadorController {
	
	@Autowired
	TrabajadorServiceImpl trabajadorServImpl;
	
	@GetMapping("/trabajador")
	public List<Trabajador> listarTrabajadores() {
		return trabajadorServImpl.listarTrabajadores();
	}
	
	@GetMapping("/trabajador/trabajo/{trabajo}")
	public List<Trabajador> listarTrabajadoresTrabajo(@PathVariable(name="trabajo")String trabajo) {
		return trabajadorServImpl.listarTrabajadorTrabajo(trabajo);
	}
	
	@PostMapping("/trabajador")
	public Trabajador guardarTrabajador(@RequestBody Trabajador trabajador) {
		return trabajadorServImpl.guardarTrabajador(trabajador);
	}
	
	@GetMapping("/trabajador/{id}")
	public Trabajador trabajadorXID(@PathVariable(name="id") Integer id) {
		Trabajador trabajador_xid = new Trabajador();
		
		trabajador_xid = trabajadorServImpl.trabajadorXID(id);
		
		System.out.println("Cliente por id " +  trabajador_xid);
		
		return trabajador_xid;
	}
	
	@PutMapping("/trabajador/{id}")
	public Trabajador actualizarCliente(@PathVariable(name="id")Integer id,@RequestBody Trabajador trabajador) {
		
		Trabajador trabajador_seleccionado= new Trabajador();
		Trabajador trabajador_actualizado= new Trabajador();
		
		trabajador_seleccionado= trabajadorServImpl.trabajadorXID(id);
		
		trabajador_seleccionado.setNombre(trabajador.getNombre());
		trabajador_seleccionado.setTrabajo(trabajador.getTrabajo());
		
		trabajador_actualizado = trabajadorServImpl.actualizarTrabajador(trabajador_seleccionado);
		
		System.out.println("El trabajador actualizado es: "+ trabajador_actualizado);
		
		return trabajador_actualizado;
	}
	
	@DeleteMapping("/trabajador/{id}")
	public void eliminarTrabajador(@PathVariable(name="id") Integer id) {
		trabajadorServImpl.eliminarTrabajador(id);
	}
}
