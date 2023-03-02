package com.programs;

import java.sql.*;

public class ConnectTheDB {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","System","saran");
        return conn;
	}
}
