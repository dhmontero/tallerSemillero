package com.clearminds.dhm.bdd.test;

import com.clearminds.dhm.dtos.Estudiante;
import com.clearminds.dhm.excepciones.BDDException;
import com.clearminds.dhm.servicios.ServicioEstudiante;

public class TestActualizar {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navaja",2));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
