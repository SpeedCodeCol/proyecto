package co.gov.mintic.SpeedCode.ingresoegresos.entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
@Entity
@Table(name="empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empresa")
    private long idEmpresa;
    @Column(name="name")
    private String name;
    @Column(name="documento")
    private String documento;
    @Column(name="celular")
    private String phone;
    @Column(name="direcion")
    private String address;
    @Column(name="creacion")
    private Date creacion;
    @Column(name="edicion")
    private Date ultimaEdicion;
    @Column(name="estado")
    private boolean estadoEmpresa;
    public Empresa(){

    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", creacion=" + creacion +
                ", ultimaEdicion=" + ultimaEdicion +
                ", estadoEmpresa=" + estadoEmpresa +
                '}';
    }
}
