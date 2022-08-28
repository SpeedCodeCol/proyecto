package clases;

public class Rol {

    private long idRol;
    private String tipo;

    public Rol(long idRol, String tipo) {
        this.idRol = idRol;
        this.tipo = tipo;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}