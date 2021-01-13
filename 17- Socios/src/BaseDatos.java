
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDatos {
	public static final String BD="socios";
	private String cadenaConex;
	private Connection cn;
	private PreparedStatement sentencia;

	public BaseDatos () {
		cadenaConex="jdbc:mysql://192.168.6.132:3306/"+BD+"?useSSL=false&allowPublicKeyRetrieval=true";
	}
	public void conectar() {
		try {
			cn=DriverManager.getConnection(cadenaConex, "joni1", "Almi123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet obtenerDatos() {
		String sent; 
		ResultSet rs;
		sent="SELECT * FROM socios";
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
	public int obtenerMaxNumSocio () {
		String sent; 
		ResultSet rs;
		sent="SELECT max(id_socios) FROM socios";
		try {
			sentencia=cn.prepareStatement(sent);
			rs=sentencia.executeQuery();
			rs.first();
			return rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int ejecutarSQL (String sent) { //VALE PARA AÑADIR, MODIFICAR Y ELIMINAR
		int regAffec=0;
		try {
			sentencia=cn.prepareStatement(sent);
			regAffec=sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	public int editar (String nombre, String direccion, String tlfno, String id_socio) {
		String sent;
		
		try {
			sent="UPDATE socios SET nombre=?, direccion=?, telefono=? where id_socios=?";
			sentencia=cn.prepareStatement(sent);
			sentencia.setString(1, nombre);
			sentencia.setString(2, direccion);
			sentencia.setString(3, tlfno);
			sentencia.setString(4, id_socio);
			sentencia.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	
	}
}
