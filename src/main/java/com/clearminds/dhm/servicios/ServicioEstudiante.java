package com.clearminds.dhm.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.rmi.CORBA.Util;

import com.clearminds.dhm.bdd.ConexionBDD;
import com.clearminds.dhm.dtos.Estudiante;
import com.clearminds.dhm.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	@Override
	public void abrirConexion() throws BDDException {
		// TODO Auto-generated method stub
		super.abrirConexion();
	}

	@Override
	public void cerrarConexion() {
		// TODO Auto-generated method stub
		super.cerrarConexion();
	}

	public void insertarEstudiante(Estudiante est) throws BDDException {
		abrirConexion();
		System.out.println("Insertando Estudiante: " + est);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String fecha = DataUtil.obtenerFecha(new Date());
			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion) values('" + est.getNombre() + "','"
					+ est.getApellido() + "','" + est.getEdad() + "','"+fecha+"')";
			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}
	
	public void actualizarEstudiante(Estudiante est) throws BDDException {
		abrirConexion();
		System.out.println("Actualizando Estudiante: " + est);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			String fecha = DataUtil.obtenerFecha(new Date());
			String sql = "update estudiantes set nombre='"+est.getNombre()+"', apellido='"+est.getApellido()+"',edad='"+est.getEdad()+"',fecha_modificacion='"+fecha+"' where id='"+est.getNumero()+"'";
			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}
}
