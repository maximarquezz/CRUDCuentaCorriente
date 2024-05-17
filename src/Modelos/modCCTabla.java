package Modelos;

import java.sql.*;
import Controladores.*;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class modCCTabla {
    //CAMPOS DE CONEXIÓN
    private logConexion con;
    
    //CAMPOS DE LA BBDD
    private int id_cctabla;
    private LocalDate fecha_cctabla;
    private String motivo_cctabla;
    private double monto_cctabla;
    private String metodo_cctabla;
    private String estado_cctabla;
    private String comprobante_cctabla;

    //CONSTRUCTORES
    public modCCTabla(int id_cctabla, LocalDate fecha_cctabla, String motivo_cctabla, double monto_cctabla, String metodo_cctabla, String estado_cctabla, String comprobante_cctabla) {
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

    public LocalDate getFecha_cctabla() {
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

    public void setFecha_cctabla(LocalDate fecha_cctabla) {
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
    
    public void Borrar(int selectedRow, Object idRow){
        con = new logConexion();
        Connection accesoBBDD = con.conectar();
        try{
            ps = accesoBBDD.prepareStatement("DELETE FROM cctabla WHERE id_cctabla = ?");
            ps.setObject(1, idRow);
            
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0){
                JOptionPane.showMessageDialog(null, "Fila borrada con éxito");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se encontró la fila");
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
}