/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import idao.IEstudianteDao;
import modelo.Estudiante;
/**
 *
 * @author Mateo
 */

public class EstudianteDaoImpl implements IEstudianteDao {	
	
	@Override
	public boolean registrar(Estudiante estudiante) {
		boolean registrar = false;
		
		Statement stm= null;
		Connection con=null;
		
		String sql="INSERT INTO estudiantes values (NULL,'"+estudiante.getCodigo()+"','"+estudiante.getNombre()+"','"+estudiante.getApellido()+"')";
		
		try {			
			con=Conexion.conectar();
			stm= con.createStatement();
			stm.execute(sql);
			registrar=true;
			stm.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase EstudianteDaoImple, método registrar");
			e.printStackTrace();
		}
		return registrar;
	}

	@Override
	public List<Estudiante> obtener() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM ESTUDIANTES ORDER BY ID";
		
		List<Estudiante> listaEstudiante= new ArrayList<Estudiante>();
		
		try {			
			co= Conexion.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Estudiante c=new Estudiante();
				c.setId(rs.getInt(1));
				c.setCodigo(rs.getString(2));
				c.setNombre(rs.getString(3));
				c.setApellido(rs.getString(4));
				listaEstudiante.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase EstudianteDaoImple, método obtener");
			e.printStackTrace();
		}
		
		return listaEstudiante;
	}

	@Override
	public boolean actualizar(Estudiante estudiante) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE estudiantes SET codigo='"+estudiante.getCodigo()+"', nombre='"+estudiante.getNombre()+"', apellido='"+estudiante.getApellido()+"'" +" WHERE ID="+estudiante.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase EstudianteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}

	@Override
	public boolean eliminar(Estudiante estudiante) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM estudiantes WHERE ID="+estudiante.getId();
		try {
			connect=Conexion.conectar();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase EstudianteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}

}