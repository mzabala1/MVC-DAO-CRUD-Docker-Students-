/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.List;

import modelo.Estudiante;

/**
 *
 * @author Mateo
 */

public class ViewEstudiante {
	public void verEstudiante(Estudiante estudiante) {
		System.out.println("Datos del estudiante: "+estudiante);
	}
	
	public void verEstudiantes(List<Estudiante> estudiantes) {
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Datos del estudiante: "+estudiante);
		}		
	}
}