/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idao;

import java.util.List;

import modelo.Estudiante;
/**
 *
 * @author Mateo
 */
public interface IEstudianteDao {	
	public boolean registrar(Estudiante estudiante);
	public List<Estudiante> obtener();
	public boolean actualizar(Estudiante estudiante);
	public boolean eliminar(Estudiante estudiante);
}
