package Modelos;

import javax.swing.table.DefaultTableModel;

public class modCCTabla {

    //ATRIBUTOS
    private static java.util.Date fecha_cctabla;
    private static String motivo_cctabla;
    private static double monto_cctabla;
    private static String metodo_cctabla;
    private static String estado_cctabla;
    private static String comprobante_cctabla;

    //GETTERS
    public static java.util.Date getFecha_cctabla() {
        return fecha_cctabla;
    }

    public static String getMotivo_cctabla() {
        return motivo_cctabla;
    }

    public static double getMonto_cctabla() {
        return monto_cctabla;
    }

    public static String getMetodo_cctabla() {
        return metodo_cctabla;
    }

    public static String getEstado_cctabla() {
        return estado_cctabla;
    }

    public static String getComprobante_cctabla() {
        return comprobante_cctabla;
    }
    
    //ID
    private int id_cctabla;
    public int getId_cctabla() {
        return id_cctabla;
    }

    //SETTERS
    public void setId_cctabla(int id_cctabla) {
        this.id_cctabla = id_cctabla;
    }

    public void setFecha_cctabla(java.util.Date fecha_cctabla) {
        modCCTabla.fecha_cctabla = fecha_cctabla;
    }

    public void setMotivo_cctabla(String motivo_cctabla) {
        modCCTabla.motivo_cctabla = motivo_cctabla;
    }

    public void setMonto_cctabla(double monto_cctabla) {
        modCCTabla.monto_cctabla = monto_cctabla;
    }

    public void setMetodo_cctabla(String metodo_cctabla) {
        modCCTabla.metodo_cctabla = metodo_cctabla;
    }

    public void setEstado_cctabla(String estado_cctabla) {
        modCCTabla.estado_cctabla = estado_cctabla;
    }

    public void setComprobante_cctabla(String comprobante_cctabla) {
        modCCTabla.comprobante_cctabla = comprobante_cctabla;
    }

    //MÉTODOS ESPECÍFICOS
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