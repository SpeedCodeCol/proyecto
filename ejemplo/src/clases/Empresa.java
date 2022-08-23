package clases;

import java.util.ArrayList;
import java.util.Date;

public class Empresa {
    //atributos
    private String id;
    private String name;
    private String rut;
    private String phone;
    private String address;
    private ArrayList <Usuario> empleados;
    private ArrayList<Transaccion> transacciones;
    private Date creacion;
    private Date ultimaEdicion;
    //constructor


    public Empresa(String name, String rut, String phone, String address,ArrayList<Usuario>usuarios,Date creacion) {
        ArrayList<Transaccion>transaccions=new ArrayList<>();
        this.name = name;
        this.rut=rut;
        this.phone=phone;
        this.address=address;
        this.empleados=usuarios;
        this.transacciones=transaccions;
        this.creacion=creacion;
        this.ultimaEdicion=creacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
}
