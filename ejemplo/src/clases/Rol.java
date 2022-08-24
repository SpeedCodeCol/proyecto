package clases;

public class Rol {

    private long idRol;
    private String tipo;
    private boolean estadoRol;

    public Rol(long idRol, String tipo) {
        this.idRol = idRol;
        this.tipo = tipo;
        this.estadoRol = true;
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

    public boolean isEstadoRol() {
        return estadoRol;
    }

    public void setEstadoRol(boolean estadoRol) {
        this.estadoRol = estadoRol;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", tipo='" + tipo + '\'' +
                ", estado=" + estadoRol +
                '}';
    }
}
