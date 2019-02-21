package com.java.sesion02.datos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	public Connection getConection() {
		Connection conn=null;
		try {
			String url = "jdbc:mysql://192.168.99.100:2526/dbMatricula";
			String usuario = "root";
			String password = "mysql";
			Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(url, usuario, password);
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}
	
	//dll
	/*CREATE
	DROP
	ALTER
	TRUNCATE
	MODIFY
	*/
	//DML
	/*INSERT
	 DELETE
	 UPDATE
	 SELECT
	 */
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection conn = conexion.getConection();
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
