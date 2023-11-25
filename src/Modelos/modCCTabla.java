/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author Maxi
 */
public class modCCTabla {
    private int id_cctabla;
    private Date fecha_cctabla;
    private String motivo_cctabla;
    private double monto_cctabla;
    private String metodo_cctabla;
    private String estado_cctabla;
    private String comprobante_cctabla;

    public modCCTabla(int id_cctabla, Date fecha_cctabla, String motivo_cctabla, double monto_cctabla, String metodo_cctabla, String estado_cctabla, String comprobante_cctabla) {
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

    public int getId_cctabla() {
        return id_cctabla;
    }

    public void setId_cctabla(int id_cctabla) {
        this.id_cctabla = id_cctabla;
    }

    public Date getFecha_cctabla() {
        return fecha_cctabla;
    }

    public void setFecha_cctabla(Date fecha_cctabla) {
        this.fecha_cctabla = fecha_cctabla;
    }

    public String getMotivo_cctabla() {
        return motivo_cctabla;
    }

    public void setMotivo_cctabla(String motivo_cctabla) {
        this.motivo_cctabla = motivo_cctabla;
    }

    public double getMonto_cctabla() {
        return monto_cctabla;
    }

    public void setMonto_cctabla(double monto_cctabla) {
        this.monto_cctabla = monto_cctabla;
    }

    public String getMetodo_cctabla() {
        return metodo_cctabla;
    }

    public void setMetodo_cctabla(String metodo_cctabla) {
        this.metodo_cctabla = metodo_cctabla;
    }

    public String getEstado_cctabla() {
        return estado_cctabla;
    }

    public void setEstado_cctabla(String estado_cctabla) {
        this.estado_cctabla = estado_cctabla;
    }

    public String getComprobante_cctabla() {
        return comprobante_cctabla;
    }

    public void setComprobante_cctabla(String comprobante_cctabla) {
        this.comprobante_cctabla = comprobante_cctabla;
    }
    
}
