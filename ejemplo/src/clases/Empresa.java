package clases;

import java.util.ArrayList;
import java.util.Date;

public class Empresa {
    //atributos
    private String idEmpresa;
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


    public Empresa(String idEmpresa, String name, TipoDocumento tipoDocumentoE, String phone, String address, Usuario empleado, Date creacion) {
        this.idEmpresa = idEmpresa;
        this.name = name;
        this.tipoDocumentoE = tipoDocumentoE;
        this.phone = phone;
        this.address = address;
        ArrayList<Usuario>empleados=new ArrayList<>();
        empleados.add(empleado);
        this.empleados = empleados;
        this.transacciones = new ArrayList<Transaccion>();
        this.creacion = creacion;
        this.ultimaEdicion = creacion;
        this.estadoEmpresa=true;
    }

    public Empresa(String name) {
        this.name = name;

    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
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

