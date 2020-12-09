package com.clearminds.dhm.servicios;

import com.clearminds.dhm.bdd.ConexionBDD;
import com.clearminds.dhm.dtos.Estudiante;
import com.clearminds.dhm.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	
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
	
	public void insertarEstudiante(Estudiante est) throws BDDException{
		abrirConexion();
		System.out.println("Insertando Estudiante: " +est);
		cerrarConexion();
	}
}
