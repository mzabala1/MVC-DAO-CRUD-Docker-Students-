/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import controlador.ControllerEstudiante;
import modelo.Estudiante;

/**
 *
 * @author Mateo
 */

public class CrudJavaDemo {

	public static void main(String[] args) {

		Estudiante estudiante = new Estudiante("20180104", "mateo", "zabala");			
		
		// controlador
		ControllerEstudiante controller = new ControllerEstudiante();

		// guarda un estudiante a través del controlador
		controller.registrar(estudiante);

		// ver estudiantes
		controller.verEstudiantes();

		// editar un estudiante por medio del id
		estudiante.setId(2);
		estudiante.setNombre("mateo");
		controller.actualizar(estudiante);

		// eliminar un estudiante por medio del id
		estudiante.setId(1);
		controller.eliminar(estudiante);
	}
}