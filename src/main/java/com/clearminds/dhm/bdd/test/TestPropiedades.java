package com.clearminds.dhm.bdd.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.clearminds.dhm.bdd.ConexionBDD;

public class TestPropiedades {

	public static void main(String[] args) {
		String valor;
		try {
			valor = ConexionBDD.leerPropiedad("propiedad1");
			System.out.println(valor);
			valor = ConexionBDD.leerPropiedad("xx");
			System.out.println(valor);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
