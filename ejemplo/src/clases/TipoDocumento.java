package clases;

public class TipoDocumento {
    private long idTipoDocumento;
    private String descripcion;
    private String siglas;
    private boolean estado;

    public TipoDocumento(long idTipoDocumento, String descripcion, String siglas) {
        this.idTipoDocumento = idTipoDocumento;
        this.descripcion = descripcion;
        this.siglas = siglas;
        this.estado = true;
    }

    public long getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(long idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "idTipoDocumento=" + idTipoDocumento +
                ", descripcion='" + descripcion + '\'' +
                ", siglas='" + siglas + '\'' +
                ", estado=" + estado +
                '}';
    }
}
