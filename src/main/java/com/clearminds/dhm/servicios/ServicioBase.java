package com.clearminds.dhm.servicios;

import java.sql.Connection;

import com.clearminds.dhm.bdd.ConexionBDD;
import com.clearminds.dhm.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion = null;

	
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public void abrirConexion() throws BDDException{
		this.conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion(){
		try {
			if(this.conexion != null){
				this.conexion.close();
				System.out.println("Conexion cerrada");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexion");
		}
	}
	
	
}
