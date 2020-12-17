import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
	public static final String BD="Socios";
	private String cadenaConex;
	private String driver;
	private Connection cn;
	public BaseDatos () {
		cadenaConex="jdbc:mysql://192.168.6.132/:3306/bdprueba"+BD;
		driver="com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void conectar() {
		try {
			cn=DriverManager.getConnection(cadenaConex, "joni", "Almi123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
