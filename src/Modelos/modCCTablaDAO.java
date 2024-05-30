package Modelos;

import Controladores.logConexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class modCCTablaDAO {
    private static int idRow;
    private static boolean isEditWindowOpened;
    private logConexion con;
    private PreparedStatement ps;
    private ResultSet rs;
    private final List<Object[]> result = new ArrayList<>();
    private Object[] rowValues;
    private int columnCount;
    
    public List<Object[]> getResult(){
        return this.result;
    }
    
    public void Filtrar(String filtroBusqueda, String tipoBusqueda){
        con = new logConexion();
        Connection accesoBBDD = con.conectar();
        
        try{
            if (tipoBusqueda.equals("Ninguno")){
                ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla");
            }
            if (tipoBusqueda.equals("Fecha")){
                ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla WHERE fecha_cctabla = ?");
                ps.setString(1, filtroBusqueda);
            }
            if (tipoBusqueda.equals("Motivo")){
                ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla WHERE motivo_cctabla = ?");
                ps.setString(1, filtroBusqueda);
            }
            if (tipoBusqueda.equals("Monto")){
                ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla WHERE monto_cctabla = ?");
                ps.setString(1, filtroBusqueda);
            }
            if (tipoBusqueda.equals("Metodo")){
                ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla WHERE metodo_cctabla = ?");
                ps.setString(1, filtroBusqueda);
            }
            if (tipoBusqueda.equals("Estado")){
                ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla WHERE estado_cctabla = ?");
                ps.setString(1, filtroBusqueda);
            }
            if (tipoBusqueda.equals("Comprobante")){
                ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla WHERE comprobante_cctabla = ?");
                ps.setString(1, filtroBusqueda);
            }
                rs = ps.executeQuery();
                
                while(rs.next()){
                    Object[] rowData = new Object[]{
                        rs.getDate("fecha_cctabla"),
                        rs.getString("motivo_cctabla"),
                        rs.getDouble("monto_cctabla"),
                        rs.getString("metodo_cctabla"),
                        rs.getString("estado_cctabla"),
                        rs.getString("comprobante_cctabla")
                    };
                    result.add(rowData);
                }
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (accesoBBDD != null) {
                    accesoBBDD.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void Filtrar(){
        con = new logConexion();
        Connection accesoBBDD = con.conectar();
        
        try{
            ps = accesoBBDD.prepareStatement("SELECT * FROM cctabla");
            rs = ps.executeQuery();
                
            while(rs.next()){
                Object[] rowData = new Object[]{
                    rs.getDate("fecha_cctabla"),
                    rs.getString("motivo_cctabla"),
                    rs.getDouble("monto_cctabla"),
                    rs.getString("metodo_cctabla"),
                    rs.getString("estado_cctabla"),
                    rs.getString("comprobante_cctabla")
                };
                result.add(rowData);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (accesoBBDD != null) {
                    accesoBBDD.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void Borrar(Object idRow) {
        con = new logConexion();
        Connection accesoBBDD = con.conectar();
        
        try{
            ps = accesoBBDD.prepareStatement("DELETE FROM cctabla WHERE id_cctabla = ?");
            ps.setObject(1, idRow);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Fila borrada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la fila para borrar");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (accesoBBDD != null) {
                    accesoBBDD.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public int getIDSelectedRow(int selectedRow){
        int id = -1;
        con = new logConexion();
        Connection accesoBBDD = con.conectar();
        
        try{
            ps = accesoBBDD.prepareStatement("SELECT id_cctabla FROM cctabla LIMIT ?, 1;");
            ps.setInt(1, selectedRow);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id_cctabla");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return id;
    }
    
    public void Insertar(java.sql.Date fecha_cctabla, String motivo_cctabla, Double monto_cctabla, String metodo_cctabla, String estado_cctabla, String comprobante_cctabla){
        con = new logConexion();
        Connection accesoBBDD = con.conectar();
        
        try{
            ps = accesoBBDD.prepareStatement("INSERT INTO cctabla VALUES(default, ?, ?, ?, ?, ?, ?);");
            ps.setDate(1, fecha_cctabla);
            ps.setString(2, motivo_cctabla);
            ps.setDouble(3, monto_cctabla);
            ps.setString(4, metodo_cctabla);
            ps.setString(5, estado_cctabla);
            
            if(comprobante_cctabla.isEmpty() || comprobante_cctabla.equals("")){
                ps.setNull(6, java.sql.Types.VARCHAR);
            }
            else{
                ps.setString(6, comprobante_cctabla); 
            }
            
            int filasInsertadas = ps.executeUpdate();
            
            if(filasInsertadas > 0){
                JOptionPane.showMessageDialog(null, "Registro insertado con éxito", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "No se pudo insertar el registro", "OK", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch(HeadlessException | SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (accesoBBDD != null) accesoBBDD.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void setIdOfEditWindow(int idRow){
        modCCTablaDAO.idRow = idRow;
    }
    public int getIdOfEditWindow(){
        return idRow;
    }
    
    public void setRowValues(Object[] rowValues){
        this.rowValues = rowValues;
    }
    public Object[] getRowValues(){
        return rowValues;
    }
    public void setColumnCount(int columnCount){
        this.columnCount = columnCount;
    }
    public int getColumnCount(){
        return columnCount;
    }
    
    public void setIfEditWindowOpened(boolean isEditWindowOpened){
        modCCTablaDAO.isEditWindowOpened = isEditWindowOpened;
    }
    public boolean getIfEditWindowOpened(){
        return isEditWindowOpened;
    }
    
    public void Editar(java.sql.Date fecha_cctabla, String motivo_cctabla, Double monto_cctabla, String metodo_cctabla, String estado_cctabla, String comprobante_cctabla){
        con = new logConexion();
        Connection accesoBBDD = con.conectar();
        
        try{
            ps = accesoBBDD.prepareStatement("UPDATE `cctabla` SET `fecha_cctabla`=?,`motivo_cctabla`=?,`monto_cctabla`=?,`metodo_cctabla`=?,`estado_cctabla`=?,`comprobante_cctabla`=? WHERE id_cctabla = ?");
            ps.setDate(1, fecha_cctabla);
            ps.setString(2, motivo_cctabla);
            ps.setDouble(3, monto_cctabla);
            ps.setString(4, metodo_cctabla);
            ps.setString(5, estado_cctabla);
            ps.setString(6, comprobante_cctabla);
            ps.setInt(7, idRow);
            
            int filasEditadas = ps.executeUpdate();
            if (filasEditadas > 0){
                JOptionPane.showMessageDialog(null, "Filas editadas con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se han editado las filas");
            }  
        } catch(HeadlessException | SQLException e){
            e.printStackTrace();
        }
    }
}
