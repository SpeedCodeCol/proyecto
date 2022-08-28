package clases;
import java.util.Date;
public class Usuario {
    //atributos
    private String idUsuario;
    private String correo;
    private String clave;
    private TipoDocumento tipoDocumento;
    private Rol role;
    private String phone;
    private Date fechaCreacion;
    private Date fechaEdicion;
    private boolean estado;
    private Empresa empresa;
    //constructor

    public Usuario(String idUsuario, String correo, String clave, TipoDocumento tipoDocumento, Rol role, Date fechaCreacion) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.clave = clave;
        this.tipoDocumento = tipoDocumento;
        this.role = role;
        this.fechaCreacion=fechaCreacion;
        this.fechaEdicion=fechaCreacion;
        this.estado=true;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Rol getRole() {
        return role;
    }

    public void setRole(Rol role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}