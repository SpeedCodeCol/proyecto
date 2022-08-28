package co.gov.mintic.SpeedCode.ingresoegresos.entity;

import java.util.Date;

public class Transaccion {
    private long idTransaccion;
    private String concepto;
    private float amount;
    private Usuario usuario;
    private Date creacion;
    private Date ultimaEdicion;
    private boolean ingreso;
    private boolean estadoTransaccion;

    public Transaccion(){
    }

    public long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(long idTransaccion) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public boolean isIngreso() {
        return ingreso;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
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
                "idTransaccion=" + idTransaccion +
                ", concepto='" + concepto + '\'' +
                ", amount=" + amount +
                ", usuario=" + usuario +
                ", creacion=" + creacion +
                ", ultimaEdicion=" + ultimaEdicion +
                ", ingreso=" + ingreso +
                ", estadoTransaccion=" + estadoTransaccion +
                '}';
    }
}
