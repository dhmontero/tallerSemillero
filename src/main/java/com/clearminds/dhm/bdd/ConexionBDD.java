package com.clearminds.dhm.bdd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.dhm.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad) throws FileNotFoundException, IOException {
		File f=new File("conexion.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());
		Properties p = new Properties();
		p.load(new FileReader(
				"C:\\Users\\dario\\Documents\\DATA\\Curso Java\\Fase2\\tallerSemillero\\conexion.properties"));
		if (p.getProperty(propiedad) != null) {
			return p.getProperty(propiedad);
		} else {
			return null;
		}

	}

	public static Connection obtenerConexion() throws BDDException {
		try {
			String user = leerPropiedad("usuario");
			String password = leerPropiedad("password");
			String url = leerPropiedad("urlConexion");
			System.out.println(user + password + url);

			Connection c = null;
			c = DriverManager.getConnection(url, user, password);
			return c;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}
	}
}
