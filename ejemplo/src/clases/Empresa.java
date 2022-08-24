package clases;

import java.util.ArrayList;
import java.util.Date;

public class Empresa {
    //atributos
    private Long idEmpresa;
    private String name;
    private TipoDocumento tipoDocumentoE;
    private String phone;
    private String address;
    private ArrayList <Usuario> empleados;
    private ArrayList<Transaccion> transacciones;
    private Date creacion;
    private Date ultimaEdicion;
    private boolean estadoEmpresa;
    //constructor


    public Empresa(Long idEmpresa, String name, TipoDocumento tipoDocumentoE, String phone, String address, ArrayList<Usuario> empleados, ArrayList<Transaccion> transacciones, Date creacion, Date ultimaEdicion) {
        this.idEmpresa = idEmpresa;
        this.name = name;
        this.tipoDocumentoE = tipoDocumentoE;
        this.phone = phone;
        this.address = address;
        this.empleados = empleados;
        this.transacciones = transacciones;
        this.creacion = creacion;
        this.ultimaEdicion = ultimaEdicion;
        this.estadoEmpresa=true;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoDocumento getTipoDocumentoE() {
        return tipoDocumentoE;
    }

    public void setTipoDocumentoE(TipoDocumento tipoDocumentoE) {
        this.tipoDocumentoE = tipoDocumentoE;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public ArrayList<Usuario> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Usuario> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public boolean isEstadoEmpresa() {
        return estadoEmpresa;
    }

    public void setEstadoEmpresa(boolean estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", name='" + name + '\'' +
                ", tipoDocumentoE=" + tipoDocumentoE +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", empleados=" + empleados +
                ", transacciones=" + transacciones +
                ", creacion=" + creacion +
                ", ultimaEdicion=" + ultimaEdicion +
                ", estadoEmpresa=" + estadoEmpresa +
                '}';
    }
}

