package Modelos;

import java.sql.*;
import Controladores.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class modCCTabla {
    //CAMPOS DE CONEXIÓN
    private logConexion con;
    
    //CAMPOS DE LA BBDD
    private int id_cctabla;
    private java.util.Date fecha_cctabla;
    private String motivo_cctabla;
    private double monto_cctabla;
    private String metodo_cctabla;
    private String estado_cctabla;
    private String comprobante_cctabla;

    //CONSTRUCTORES
    public modCCTabla(int id_cctabla, java.util.Date fecha_cctabla, String motivo_cctabla, double monto_cctabla, String metodo_cctabla, String estado_cctabla, String comprobante_cctabla) {
        this.id_cctabla = id_cctabla;
        this.fecha_cctabla = fecha_cctabla;
        this.motivo_cctabla = motivo_cctabla;
        this.monto_cctabla = monto_cctabla;
        this.metodo_cctabla = metodo_cctabla;
        this.estado_cctabla = estado_cctabla;
        this.comprobante_cctabla = comprobante_cctabla;
    }

    public modCCTabla() {
        
    } 

    //GETTERS
    public int getId_cctabla() {
        return id_cctabla;
    }

    public java.util.Date getFecha_cctabla() {
        return fecha_cctabla;
    }

    public String getMotivo_cctabla() {
        return motivo_cctabla;
    }

    public double getMonto_cctabla() {
        return monto_cctabla;
    }

    public String getMetodo_cctabla() {
        return metodo_cctabla;
    }

    public String getEstado_cctabla() {
        return estado_cctabla;
    }

    public String getComprobante_cctabla() {
        return comprobante_cctabla;
    }
    
    //SETTERS
    public void setId_cctabla(int id_cctabla) {
        this.id_cctabla = id_cctabla;
    }

    public void setFecha_cctabla(java.util.Date fecha_cctabla) {
        this.fecha_cctabla = fecha_cctabla;
    }

    public void setMotivo_cctabla(String motivo_cctabla) {
        this.motivo_cctabla = motivo_cctabla;
    }

    public void setMonto_cctabla(double monto_cctabla) {
        this.monto_cctabla = monto_cctabla;
    }

    public void setMetodo_cctabla(String metodo_cctabla) {
        this.metodo_cctabla = metodo_cctabla;
    }

    public void setEstado_cctabla(String estado_cctabla) {
        this.estado_cctabla = estado_cctabla;
    }

    public void setComprobante_cctabla(String comprobante_cctabla) {
        this.comprobante_cctabla = comprobante_cctabla;
    }
    
    //MÉTODOS ESPECÍFICOS
    public double calcSaldo(DefaultTableModel tblModel){
        double sum = 0;
        int colIndex = 2;
        int rowCount = tblModel.getRowCount();
        for(int i = 0; i < rowCount; i++){
            Object valueAt = tblModel.getValueAt(i, colIndex);
            
            if(valueAt instanceof Double){
                sum += (Double) valueAt;
            }
        }
        return sum;
    }
    
    //MÉTODOS SQL
    private PreparedStatement ps;
    private ResultSet rs;
    private List<Object[]> result = new ArrayList<>();
    
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
            
            if(comprobante_cctabla.isEmpty()){
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
            
        } catch(Exception e){
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
    
    private static int idRow;
    public void setIdOfEditWindow(int idRow){
        this.idRow = idRow;
    }
    public int getIdOfEditWindow(){
        return idRow;
    }
    
    private Object[] rowValues;
    private int columnCount;
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
    
    private static boolean isEditWindowOpened;
    public void setIfEditWindowOpened(boolean isEditWindowOpened){
        this.isEditWindowOpened = isEditWindowOpened;
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
            ps.setInt(6, idRow);
            
            int filasEditadas = ps.executeUpdate();
            if (filasEditadas > 0){
                JOptionPane.showMessageDialog(null, "Filas editadas con éxito (SQL)");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se han editado las filas (SQL)");
            }  
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}