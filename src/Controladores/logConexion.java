package Controladores;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Provee de constantes que almacenan información necesaria para la conexión con la base de datos (SQL) y otorga el método para realizar la conexión a la misma.
 * <p>Esta clase contiene la configuración de conexión a la base de datos MySQL y el método {@link #conectar()} para establecer dicha conexión.</p>
 * 
 * @see java.sql.Connection
 */
public class logConexion {

    /**
     * Crea una nueva instancia de la clase {@code logConexion}.
     * <p>Este constructor vacío no realiza ninguna acción especial y solo inicializa una nueva instancia de la clase.</p>
     */
    public logConexion(){
        
    }
    
    /** Conexión a la base de datos. */
    private final String DB_NAME = "clubsoftcuentacorriente";
    
    /** Host completo de la base de datos. */
    private final String HOST = "jdbc:mysql://localhost:3306/" + DB_NAME;
    
    /** Usuario de la base de datos. */
    private final String USER = "root";
    
    /** Contraseña de la base de datos. */
    private final String PASSWORD = "";

    /**
     * Establece una conexión con la base de datos utilizando los parámetros de configuración ({@link #DB_NAME}, {@link #HOST}, {@link #USER}, {@link #PASSWORD}).
     * <p>Este método intenta cargar el controlador JDBC de MySQL y establece una conexión con la base de datos especificada.
     * En caso de fallo, muestra un mensaje de error a través de una ventana de diálogo.</p>
     *
     * @return Un objeto {@code Connection} que representa la conexión a la base de datos, 
     *         o {@code null} si la conexión falla.
     * @throws ClassNotFoundException Si el controlador JDBC no se encuentra.
     * @throws SQLException Si se produce un error en el acceso a la base de datos u otros errores relacionados.
     */
    public Connection conectar() throws ClassNotFoundException, SQLException{
        Connection link = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.HOST, this.USER, this.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión con base de datos fallida: " + e.toString());
        }

        return link;
    }
}
