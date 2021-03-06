package com.elorrieta.proyectofinal.connectionhelper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Clase para obtener conexion a la BDD de SQLite.
 * 
 * @author Nyhz
 * @version 1.0
 *
 */
public class ConnectionHelper implements AutoCloseable {

	private static Connection con = null;
	private static final String DIRECCION_BBDD = "jdbc:sqlite:C:\\DesarrolloJava\\Workspace\\ProyectoFinal\\webfinal.db";

	public static Connection getConnection() throws Exception {

		// cargar el driver de sqlite
		Class.forName("org.sqlite.JDBC");

		con = DriverManager.getConnection(DIRECCION_BBDD);

		return con;
	}

	@Override
	public void close() throws Exception {

		if (con != null) {
			con.close();
		}

	}

}