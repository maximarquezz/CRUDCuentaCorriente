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

/**
 * Proporciona la lógica de acceso a la base de datos según el Data Access Object (DAO).
 */
public class modCCTablaDAO {
    
    /**
     * Crea una nueva instancia de la clase {@code modCCTablaDAO}.
     * <p>Este constructor vacío no realiza ninguna acción especial y solo inicializa una nueva instancia de la clase.</p>
     */
    public modCCTablaDAO(){
        
    }
    
    /** El ID único que posee cada registro en la tabla. */
    private static int idRow;
    /** Determina si la ventana {@link Vistas.friCCAgregar} debe realizar operaciones de edición o agregación de datos. */
    private static boolean isEditWindowOpened;
    /** Objeto de tipo {@link Controladores.logConexion} que permite realizar las operaciones con la base de datos. */
    private logConexion con;
    /** Objeto de tipo <code>PreparedStatement</code> que permite ejecutar consultas preparadas. */
    private PreparedStatement ps;
    /** Objeto de tipo <code>ResultSet</code> que permite la persistencia de los datos obtenidos de las consultas SQL. */
    private ResultSet rs;
    /** Colección de datos <code>List</code> que permite almacenar tipos genéricos; En este caso, un array de Object. */
    private final List<Object[]> result = new ArrayList<>();
    /** Array de Object que almacena los valores obtenidos de los registros de la tabla. */
    private Object[] rowValues;
    
    /**
     * Getter de la variable <code>result</code>.
     * @return <code>result</code>
     */
    public List<Object[]> getResult(){
        return this.result;
    }
    
    /**
     * Se encarga de filtrar los registros de la base de datos según un "combo box" que determina el campo por el cuál se filtrará la información, y su respectiva cadena de caracteres que funciona como filtro.
     * @param filtroBusqueda Almacena la cadena de caracteres que funcionan como filtro en la consulta SQL para realizar la búsqueda de uno o más registros (se recibe de {@link Vistas.friCCListar}.
     * @param tipoBusqueda Almacena la cadena de caracteres que determinan por qué campo de la base de datos se filtrarán los registros (se recibe de {@link Vistas.friCCListar}.
     * @throws ClassNotFoundException Si el controlador JDBC no se encuentra.
     * @throws SQLException Si se produce un error en el acceso a la base de datos u otros errores relacionados.
     */
    public void Filtrar(String filtroBusqueda, String tipoBusqueda) throws ClassNotFoundException, SQLException{
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
    
    /**
     * Se encarga de hacer una consulta general de todos los datos almacenados en la base de datos.
     * @throws ClassNotFoundException Si el controlador JDBC no se encuentra.
     * @throws SQLException Si se produce un error en el acceso a la base de datos u otros errores relacionados.
     */
    public void Filtrar() throws ClassNotFoundException, SQLException{
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
    
    /**
     * Se encarga de borrar un registro en la base de datos por ID.
     * @param idRow Almacena el ID del registro seleccionado en la tabla del formulario que se encuentra en {@link Vistas.friCCListar}.
     * @throws ClassNotFoundException Si el controlador JDBC no se encuentra.
     * @throws SQLException Si se produce un error en el acceso a la base de datos u otros errores relacionados.
     */
    public void Borrar(Object idRow) throws ClassNotFoundException, SQLException {
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
    
    /**
     * Obtiene el ID de una determinada fila de la tabla en {@link Vistas.friCCListar} (véanse los eventos btnEliminarMouseClicked y btnEditarMouseClicked).
     * @param selectedRow Devuelve un entero que identifica el índice de la fila seleccionada en la tabla en {@link Vistas.friCCListar}.
     * @return El <code>id</code> del registro en la tabla asociado al registro de la base de datos. 
     * @throws ClassNotFoundException Si el controlador JDBC no se encuentra.
     * @throws SQLException Si se produce un error en el acceso a la base de datos u otros errores relacionados.
     */
    public int getIDSelectedRow(int selectedRow) throws ClassNotFoundException, SQLException{
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
    
    /**
     * Inserta un registro en la base de datos según los parámetros recibidos de {@link Vistas.friCCListar}.
     * @param fecha_cctabla Recibe la fecha en que se realizó el movimiento en la cuenta corriente determinada.
     * @param motivo_cctabla Recibe el motivo por el cuál se realizó el movimiento en la cuenta corriente determinada.
     * @param monto_cctabla Recibe el monto asociado al movimiento específico de la cuenta corriente.
     * @param metodo_cctabla Recibe el método de pago asociado al movimiento específico de la cuenta corriente.
     * @param estado_cctabla Recibe el estado del movimiento específico de la cuenta corriente.
     * @param comprobante_cctabla Recibe el número de comprobante del movimiento específico de la cuenta corriente.
     * @throws ClassNotFoundException Si el controlador JDBC no se encuentra.
     * @throws SQLException Si se produce un error en el acceso a la base de datos u otros errores relacionados.
     */
    public void Insertar(java.sql.Date fecha_cctabla, String motivo_cctabla, Double monto_cctabla, String metodo_cctabla, String estado_cctabla, String comprobante_cctabla) throws ClassNotFoundException, SQLException{
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
    
    /**
     * Setter de <code>idRow</code>.
     * @param idRow Se almacena temporalmente el ID en la variable de clase <code>modCCTablaDAO.idRow</code>
     */
    public void setIdOfEditWindow(int idRow){
        modCCTablaDAO.idRow = idRow;
    }
    /**
     * Getter de <code>idRow</code>.
     * @return idRow.
     */
    public int getIdOfEditWindow(){
        return idRow;
    }
    
    /**
     * Setter del Object[] <code>rowValues</code>.
     * @param rowValues Se almacenan los valores asociados a todas las filas de la tabla en {@link Vistas.friCCListar}.
     */
    public void setRowValues(Object[] rowValues){
        this.rowValues = rowValues;
    }
    
    /**
     * Getter del Object[] <code>rowValues</code>.
     * @return rowValues.
     */
    public Object[] getRowValues(){
        return rowValues;
    }
    
    /**
     * Determina si la {@link Vistas.friCCAgregar} está en modo de edición (true) o no (false).
     * @param isEditWindowOpened 
     */
    public void setIfEditWindowOpened(boolean isEditWindowOpened){
        modCCTablaDAO.isEditWindowOpened = isEditWindowOpened;
    }
    
    /**
     * Getter de <code>isEditWindowOpened</code>.
     * @return isEditWindowOpened.
     */
    public boolean getIfEditWindowOpened(){
        return isEditWindowOpened;
    }
    
    /**
     * Edita un registro en la base de datos según la fila seleccionada en la tabla en {@link Vistas.friCCAgregar}.
     * @param fecha_cctabla Recibe la fecha en que se realizó el movimiento en la cuenta corriente determinada.
     * @param motivo_cctabla Recibe el motivo por el cuál se realizó el movimiento en la cuenta corriente determinada.
     * @param monto_cctabla Recibe el monto asociado al movimiento específico de la cuenta corriente.
     * @param metodo_cctabla Recibe el método de pago asociado al movimiento específico de la cuenta corriente.
     * @param estado_cctabla Recibe el estado del movimiento específico de la cuenta corriente.
     * @param comprobante_cctabla Recibe el número de comprobante del movimiento específico de la cuenta corriente.
     * @throws ClassNotFoundException Si el controlador JDBC no se encuentra.
     * @throws SQLException Si se produce un error en el acceso a la base de datos u otros errores relacionados.
     */
    public void Editar(java.sql.Date fecha_cctabla, String motivo_cctabla, Double monto_cctabla, String metodo_cctabla, String estado_cctabla, String comprobante_cctabla) throws ClassNotFoundException, SQLException{
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
