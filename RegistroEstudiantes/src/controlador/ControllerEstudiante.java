/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;

import dao.EstudianteDaoImpl;
import idao.IEstudianteDao;
import modelo.Estudiante;
import vista.ViewEstudiante;
/**
 *
 * @author Mateo
 */

public class ControllerEstudiante {
	
	private ViewEstudiante vista= new ViewEstudiante();
	
	public ControllerEstudiante() {
            
	}
	
	//llama al DAO para guardar un estudiante
	public void registrar(Estudiante estudiante ) {
		IEstudianteDao dao= new  EstudianteDaoImpl();
		dao.registrar(estudiante);
	}
	
	//llama al DAO para actualizar un estudiante
	public void actualizar(Estudiante estudiante) {
		IEstudianteDao dao= new  EstudianteDaoImpl();
		dao.actualizar(estudiante);
	}
	
	//llama al DAO para eliminar un estudiante
	public void eliminar(Estudiante estudiante) {
		IEstudianteDao dao= new  EstudianteDaoImpl();
		dao.eliminar(estudiante);
	}
	
	//llama al DAO para obtener todos los estudiantes y luego los muestra en la vista
	public void verEstudiantes(){
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		IEstudianteDao dao= new  EstudianteDaoImpl();
		estudiantes=dao.obtener();
		vista.verEstudiantes(estudiantes);
	}
}