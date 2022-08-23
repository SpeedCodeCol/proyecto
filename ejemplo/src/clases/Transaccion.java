package clases;
import java.util.*;
public class Transaccion {
    private String id;
    private String concepto;
    private float amount;
    private Usuario usuario;
    private Date creacion;
    private Date ultimaEdicion;

    public Transaccion(String id, String concepto, float amount,Usuario usuario, Date creacion) {
        this.id = id;
        this.concepto = concepto;
        this.amount = amount;
        this.usuario=usuario;
        this.creacion = creacion;
        this.ultimaEdicion = creacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
