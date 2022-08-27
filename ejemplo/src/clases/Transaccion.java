package clases;
import java.util.*;
public class Transaccion {
    private String idTransaccion;
    private String concepto;
    private float amount;
    private Usuario usuario;
    private Date creacion;
    private Date ultimaEdicion;
    private boolean ingreso;
    private boolean estadoTransaccion;


    public Transaccion(String idTransaccion, String concepto, float amount,Usuario usuario, Date creacion,boolean ingreso) {
        this.idTransaccion = idTransaccion;
        this.concepto = concepto;
        this.amount = amount;
        this.usuario=usuario;
        this.creacion = creacion;
        this.ultimaEdicion = creacion;
        this.estadoTransaccion=true;
        this.ingreso=ingreso;

    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getUltimaEdicion() {
        return ultimaEdicion;
    }

    public void setUltimaEdicion(Date ultimaEdicion) {
        this.ultimaEdicion = ultimaEdicion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(boolean estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "idTransaccion='" + idTransaccion + '\'' +
                ", concepto='" + concepto + '\'' +
                ", amount=" + amount +
                ", usuario=" + usuario +
                ", creacion=" + creacion +
                ", ultimaEdicion=" + ultimaEdicion +
                ", estadoTransaccion=" + estadoTransaccion +
                '}';
    }
}
