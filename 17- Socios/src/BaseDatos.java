
public class BaseDatos {
	public static final String BD="Socios";
	private String cadenaConex;
	private String driver;
	
	public BaseDatos () {
		cadenaConex="jdbc:mysql://localhost:3306/bdprueba"+BD;
		driver="com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
