/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Maxi
 */
public class modCCArchivo {
    
    private int id_ccarchivo;
    private int id_cctabla;
    private String nombre_ccarchivo;
    private String tipo_ccarchivo;
    private String datos_archivo;

    public modCCArchivo(int id_ccarchivo, int id_cctabla, String nombre_ccarchivo, String tipo_ccarchivo, String datos_archivo) {
        this.id_ccarchivo = id_ccarchivo;
        this.id_cctabla = id_cctabla;
        this.nombre_ccarchivo = nombre_ccarchivo;
        this.tipo_ccarchivo = tipo_ccarchivo;
        this.datos_archivo = datos_archivo;
    }

    public modCCArchivo() {
    }

    public int getId_ccarchivo() {
        return id_ccarchivo;
    }

    public void setId_ccarchivo(int id_ccarchivo) {
        this.id_ccarchivo = id_ccarchivo;
    }

    public int getId_cctabla() {
        return id_cctabla;
    }

    public void setId_cctabla(int id_cctabla) {
        this.id_cctabla = id_cctabla;
    }

    public String getNombre_ccarchivo() {
        return nombre_ccarchivo;
    }

    public void setNombre_ccarchivo(String nombre_ccarchivo) {
        this.nombre_ccarchivo = nombre_ccarchivo;
    }

    public String getTipo_ccarchivo() {
        return tipo_ccarchivo;
    }

    public void setTipo_ccarchivo(String tipo_ccarchivo) {
        this.tipo_ccarchivo = tipo_ccarchivo;
    }

    public String getDatos_archivo() {
        return datos_archivo;
    }

    public void setDatos_archivo(String datos_archivo) {
        this.datos_archivo = datos_archivo;
    }
    
}
