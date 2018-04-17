/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mateo
 */

public class Estudiante {
	private int id;
	
	private String codigo;
	private String nombre;
	private String apellido;
	
	public Estudiante() {
	}
	
	public Estudiante(String codigo, String nombre, String apellido) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return this.id+", "+this.codigo+", "+this.nombre+", "+this.apellido;
	}
}