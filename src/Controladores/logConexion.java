package Controladores;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class logConexion {
    private final String db = "clubsoftcuentacorriente";
    private final String host = "jdbc:mysql://localhost:3306/" + db;
    private final String user = "root";
    private final String pass = "";
    
    public Connection conectar() {
        Connection link = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.host, this.user, this.pass);
            // JOptionPane.showMessageDialog(null, "La conexión con la base de datos se ha realizado correctamente.");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión con base de datos fallida: " + e.toString());
        }
            
        return link;
    }
}
