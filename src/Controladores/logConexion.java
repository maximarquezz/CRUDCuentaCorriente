/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class logConexion {
    
    public String db="clubsoftcuentacorriente";
    public String host="jdbc:mysql://localhost/"+db;
    public String user="root";
    public String pass="admin";
    
    public Connection conectar(){
        Connection link=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            link=DriverManager.getConnection(this.host,this.user,this.pass);
            JOptionPane.showMessageDialog(null, "La conexión con la base de datos se ha realizado correctamente.");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Conexión con base de datos fallida: " + e.toString());
        }
            
        return link;
    }
    
}
