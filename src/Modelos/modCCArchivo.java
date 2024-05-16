package Modelos;

public class modCCArchivo {
    
    private int id_ccarchivo;
    private int id_cctabla;
    private String nombre_ccarchivo;
    private String direc_ccarchivo;

    public modCCArchivo(int id_ccarchivo, int id_cctabla, String nombre_ccarchivo, String direc_ccarchivo) {
        this.id_ccarchivo = id_ccarchivo;
        this.id_cctabla = id_cctabla;
        this.nombre_ccarchivo = nombre_ccarchivo;
        this.direc_ccarchivo = direc_ccarchivo;
    }

    public modCCArchivo() {
    }

    public int getId_ccarchivo() {
        return id_ccarchivo;
    }

    public int getId_cctabla() {
        return id_cctabla;
    }

    public String getNombre_ccarchivo() {
        return nombre_ccarchivo;
    }

    public String getDirec_ccarchivo() {
        return direc_ccarchivo;
    }

    public void setId_ccarchivo(int id_ccarchivo) {
        this.id_ccarchivo = id_ccarchivo;
    }

    public void setId_cctabla(int id_cctabla) {
        this.id_cctabla = id_cctabla;
    }

    public void setNombre_ccarchivo(String nombre_ccarchivo) {
        this.nombre_ccarchivo = nombre_ccarchivo;
    }

    public void setDirec_ccarchivo(String direc_ccarchivo) {
        this.direc_ccarchivo = direc_ccarchivo;
    }

}
