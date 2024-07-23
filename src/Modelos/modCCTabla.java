package Modelos;

import javax.swing.table.DefaultTableModel;

/**
 * Proporciona atributos y métodos necesarios para la transferencia de datos modularizada según el Design Pattern "MVC".
 * <p>Además, otorga algunos métodos que realizan operaciones específicas relacionadas.</p>
 */
public class modCCTabla {
    
    /**
     * Crea una nueva instancia de la clase {@code modCCTabla}.
     * <p>Este constructor vacío no realiza ninguna acción especial y solo inicializa una nueva instancia de la clase.</p>
     */
    public modCCTabla(){
        
    }

    /** La fecha en que se registró el movimiento en la cuenta corriente. */
    private static java.util.Date fecha_cctabla;
    /** El motivo del movimiento en la cuenta corriente. */
    private static String motivo_cctabla;
    /** El monto asociado al movimiento en la cuenta corriente. */
    private static double monto_cctabla;
    /** El método de pago asociado al movimiento en la cuenta corriente. */
    private static String metodo_cctabla;
    /** El estado del movimiento en la cuenta corriente. */
    private static String estado_cctabla;
    /** El comprobante asociado al movimiento en la cuenta corriente. */
    private static String comprobante_cctabla;

    /**
     * Getter de fecha_cctabla.
     * @return <code>fecha_cctabla</code>
     */
    public static java.util.Date getFecha_cctabla() {
        return fecha_cctabla;
    }

    /**
     * Getter de motivo_cctabla.
     * @return <code>motivo_cctabla</code>
     */
    public static String getMotivo_cctabla() {
        return motivo_cctabla;
    }

    /**
     * Getter de monto_cctabla.
     * @return <code>monto_cctabla</code>
     */
    public static double getMonto_cctabla() {
        return monto_cctabla;
    }

    /**
     * Getter de metodo_cctabla.
     * @return <code>metodo_cctabla</code>
     */
    public static String getMetodo_cctabla() {
        return metodo_cctabla;
    }

    /**
     * Getter de estado_cctabla.
     * @return <code>estado_cctabla</code>
     */
    public static String getEstado_cctabla() {
        return estado_cctabla;
    }

    /**
     * Getter de comprobante_cctabla.
     * @return <code>comprobante_cctabla</code>
     */
    public static String getComprobante_cctabla() {
        return comprobante_cctabla;
    }
    
    /** El ID único y autoincremental de cada registro en la tabla. */
    private int id_cctabla;
    
    /**
     * Getter de idcctabla.
     * @return <code>id_cctabla</code>
     */
    public int getId_cctabla() {
        return id_cctabla;
    }

    /**
     * Setter de id_cctabla.
     * @param id_cctabla Recibe un ID y lo asigna a la variable de clase <code>id_cctabla</code>.
     */
    
    public void setId_cctabla(int id_cctabla) {
        this.id_cctabla = id_cctabla;
    }

    /**
     * Setter de fecha_cctabla.
     * @param fecha_cctabla Recibe una fecha y lo asigna a la variable de clase <code>fecha_cctabla</code>.
     */
    public void setFecha_cctabla(java.util.Date fecha_cctabla) {
        modCCTabla.fecha_cctabla = fecha_cctabla;
    }

    /**
     * Setter de motivo_cctabla.
     * @param motivo_cctabla Recibe un motivo y lo asigna a la variable de clase <code>motivo_cctabla</code>.
     */
    public void setMotivo_cctabla(String motivo_cctabla) {
        modCCTabla.motivo_cctabla = motivo_cctabla;
    }

    /**
     * Setter de monto_cctabla.
     * @param monto_cctabla Recibe un monto y lo asigna a la variable de clase <code>monto_cctabla</code>.
     */
    public void setMonto_cctabla(double monto_cctabla) {
        modCCTabla.monto_cctabla = monto_cctabla;
    }

    /**
     * Setter de metodo_cctabla.
     * @param metodo_cctabla Recibe un metodo y lo asigna a la variable de clase <code>metodo_cctabla</code>.
     */
    public void setMetodo_cctabla(String metodo_cctabla) {
        modCCTabla.metodo_cctabla = metodo_cctabla;
    }

    /**
     * Setter de estado_cctabla.
     * @param estado_cctabla Recibe un estado y lo asigna a la variable de clase <code>estado_cctabla</code>.
     */
    public void setEstado_cctabla(String estado_cctabla) {
        modCCTabla.estado_cctabla = estado_cctabla;
    }

    /**
     * Setter de comprobante_cctabla.
     * @param comprobante_cctabla Recibe un número de comprobante y lo asigna a la variable de clase <code>comprobante_cctabla</code>.
     */
    public void setComprobante_cctabla(String comprobante_cctabla) {
        modCCTabla.comprobante_cctabla = comprobante_cctabla;
    }

    /**
     * Determina si un movimiento debe sumarse o restarse del saldo total dependiendo del estado del movimiento en la cuenta corriente.
     * <p>Para ello, se inicializa una variable <code>sum</code> en 0. Posteriormente, se obtiene la cantidad de filas con el método <code>getRowCount()</code> y se almacena en la variable <code>rowCount.</code></p>
     * <p>Luego, se itera un bucle una cantidad determinada de veces (determinada por <code>rowCount</code>), donde en cada iteración se obtienen los valores almacenados en la columna 5 (index 4) del DefaultTableModel obtenido (estado_cctabla) y se almacenan en <code>stateOfTransaction</code>.</p>
     * <p>Posteriormente, se crea <code>valueAt</code> que almacenará lo obtenido en la columna 3 (index 2) del DefaultTableModel (monto_cctabla) con el método <code>getValueAt(fila, columna)</code>.</p>
     * <p>Finalmente, si ocurre que lo que hay almacenado en <code>stateOfTransaction</code> coincide con "Pendiente" entonces se restarán de forma acumulativa los valores obtenidos en el objeto <code>valueAt</code>; de lo contrario, se sumarán.</p>
     * @param tblModel El DefaultTableModel de la tabla utilizada en Vistas.friCCListar.java.
     * @return La variable <code>sum</code> con la sumatoria total del saldo.
     */
    public double calcSaldo(DefaultTableModel tblModel){
        double sum = 0;
        int rowCount = tblModel.getRowCount();
        for(int i = 0; i < rowCount; i++){
            Object stateOfTransaction = tblModel.getValueAt(i, 4);
            Object valueAt = tblModel.getValueAt(i, 2);

            if(stateOfTransaction.toString().equalsIgnoreCase("Pendiente")){
                if(valueAt instanceof Double){
                    sum -= (Double) valueAt;
                }
            }
            else{
                if(valueAt instanceof Double){
                    sum += (Double) valueAt;
                }
            }
        }
        return sum;
    }

    /**
     * Calcula la deuda total dependiendo del estado del movimiento en la cuenta corriente.
     * <p>Para ello, se inicializa una variable <code>sum</code> en 0. Posteriormente, se obtiene la cantidad de filas con el método <code>getRowCount()</code> y se almacena en la variable <code>rowCount.</code></p>
     * <p>Luego, se itera un bucle una cantidad determinada de veces (determinada por <code>rowCount</code>), donde en cada iteración se obtienen los valores almacenados en la columna 5 (index 4) del DefaultTableModel obtenido (estado_cctabla) y se almacenan en <code>stateOfTransaction</code>.</p>
     * <p>Posteriormente, se crea <code>valueAt</code> que almacenará lo obtenido en la columna 3 (index 2) del DefaultTableModel (monto_cctabla) con el método <code>getValueAt(fila, columna)</code>.</p>
     * <p>Finalmente, si ocurre que lo que hay almacenado en <code>stateOfTransaction</code> coincide con "Pendiente" entonces se sumarán de forma acumulativa los valores obtenidos en el objeto <code>valueAt</code>.</p>
     * @param tblModel El DefaultTableModel de la tabla utilizada en Vistas.friCCListar.java.
     * @return La variable <code>sum</code> con la sumatoria total de la deuda.
     */
    public double calcDeuda(DefaultTableModel tblModel){
        double sum = 0;
        int rowCount = tblModel.getRowCount();
        for(int i = 0; i < rowCount; i++){
            Object stateOfTransaction = tblModel.getValueAt(i, 4);

            if(stateOfTransaction.toString().equalsIgnoreCase("Pendiente")){
                Object valueAt = tblModel.getValueAt(i, 2);

                if(valueAt instanceof Double){
                    sum += (Double) valueAt;
                }
            }
        }
        return sum;
    }

    /**
     * Calcula los ingresos que producen esta instancia de cuenta corriente dependiendo del estado del movimiento en la misma.
     * <p>Para ello, se inicializa una variable <code>sum</code> en 0. Posteriormente, se obtiene la cantidad de filas con el método <code>getRowCount()</code> y se almacena en la variable <code>rowCount.</code></p>
     * <p>Luego, se itera un bucle una cantidad determinada de veces (determinada por <code>rowCount</code>), donde en cada iteración se obtienen los valores almacenados en la columna 3 (index 4) del DefaultTableModel obtenido (estado_cctabla) y se almacenan en <code>stateOfTransaction</code>.</p>
     * <p>Posteriormente, se crea <code>valueAt</code> que almacenará lo obtenido en la columna 3 (index 2) del DefaultTableModel (monto_cctabla) con el método <code>getValueAt(fila, columna)</code>.</p>
     * <p>Finalmente, si ocurre que lo que hay almacenado en <code>stateOfTransaction</code> coincide con "Pagado" entonces se sumarán de forma acumulativa los valores obtenidos en el objeto <code>valueAt</code>.</p>
     * @param tblModel El DefaultTableModel de la tabla utilizada en Vistas.friCCListar.java.
     * @return La variable <code>sum</code> con la sumatoria total del saldo.
     */
    public double calcIngreso(DefaultTableModel tblModel){
        double sum = 0;
        int rowCount = tblModel.getRowCount();
        for(int i = 0; i < rowCount; i++){
            Object stateOfTransaction = tblModel.getValueAt(i, 4);
            Object valueAt = tblModel.getValueAt(i, 2);

            if(stateOfTransaction.toString().equalsIgnoreCase("Pagado")){
                if(valueAt instanceof Double){
                    sum += (Double) valueAt;
                }
            }
        }
        return sum;
    }
}