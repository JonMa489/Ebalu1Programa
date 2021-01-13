import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDeDatos {
	public static final String BD="";
	private String cadenaConex;
	private Connection cn;
	private PreparedStatement sentencia;
	
	public BaseDeDatos () {
		cadenaConex="jdbc:mysql://192.168.6.132:3306/"+BD+"?useSSL=false&allowPublicKeyRetrieval=true";
	}
	public void conectar() {
		try {
			cn=DriverManager.getConnection(cadenaConex, "joni1", "Almi123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet obtenerDatos() {
		String sent; 
		ResultSet rs;
		sent="SELECT * FROM clientes";
		try {
			sentencia=cn.prepareStatement(sent, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs=sentencia.executeQuery();
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}