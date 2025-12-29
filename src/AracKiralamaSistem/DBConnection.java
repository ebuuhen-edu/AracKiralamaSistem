package AracKiralamaSistem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL="jdbc:mysql://localhost:3306/arac_kiralama";
	private static final String USER="root";
	private static final String PASS="root1234";
	private static Connection connection=null;
	public static  Connection getConnection() {
		if (connection==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection(URL, USER, PASS);
				System.out.println("VeriTabanlı bağlantısı başarırı!");
				} catch
			(ClassNotFoundException | SQLException e) {
					System.err.println("Bağlantı hatası: "+e.getMessage());
				}
		}
		return connection;
	}
	public static void closeConnection()
	{
		if (connection !=null) {
			try {
				connection.close();
				connection=null;
				System.out.println("Bağlantı kapatıldı!");
			} catch (SQLException e) {
				System.err.println("Bağlantı kapatma hatası: " + e.getMessage());
			}
		}
	}
	public static Connection connect() {
		// TODO Auto-generated method stub
		return getConnection();
	}
	
	}


