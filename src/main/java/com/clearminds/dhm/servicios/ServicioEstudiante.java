package com.clearminds.dhm.servicios;

import java.sql.SQLException;
import java.sql.Statement;

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

			String sql = "insert into estudiantes(nombre,apellido) values('" + est.getNombre() + "','"
					+ est.getApellido() + "')";
			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}
}
