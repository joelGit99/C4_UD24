package app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Joel
 *
 */

enum trabajos {
	JUNIOR,MID,SENIOR
}

@Entity
@Table(name = "trabajador")
public class Trabajador {
	
	// Atributos del trabajador
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre")
	private java.lang.String nombre;
	@Column(name = "trabajo")
	private trabajos trabajo;
	@Column(name = "salario")
	private int salario;
	
	// Constructores
	public Trabajador() {
		
	}
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param trabajo
	 */
	public Trabajador(int id, String nombre, trabajos trabajo) {
		this.id = id;
		this.nombre = nombre;
		// Si el trabajo pasado por parámetro, es alguno de los que está en el enum, se asigna el valor
		// Sino, se setea a null
		if(trabajo.equals(trabajos.JUNIOR) || trabajo.equals(trabajos.MID) || trabajo.equals(trabajos.SENIOR)) {
			this.trabajo = trabajo;
		} else {
			this.trabajo = null;
		}
		
		// Dependiendo del trabajo, se seteará un salario u otro
		if(trabajo.equals(trabajos.JUNIOR)) {
			this.salario = 1200;
		} else if(trabajo.equals(trabajos.MID)) {
			this.salario = 1500;		
		} else if(trabajo.equals(trabajos.SENIOR)) {
			this.salario = 1800;
		} else {
			this.salario = 0;
		}
	}
	
	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public trabajos getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(trabajos trabajo) {
		this.trabajo = trabajo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}
}
