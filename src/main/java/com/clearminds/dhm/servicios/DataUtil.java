package com.clearminds.dhm.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
		public static final String FORMATO_COMPLETO = "yyyy/MM/dd HH:mm:ss";
	
		public static String obtenerFecha(Date fecha) { 
			SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_COMPLETO);
			String cadenaFormateada = formateador.format(fecha);
			return cadenaFormateada;
		}
}
