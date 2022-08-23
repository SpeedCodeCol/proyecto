package clases;
import java.util.Date;
public class Usuario {
    //atributos
    private String id;
    private String email;
    private String role;
    private Date fechaCreacion;
    private Date fechaEdicion;
    private String phone;
    private String imagen;

    //constructor
    public Usuario(String id, String email, String role, Date fechaCreacion) {
        this.id = id;
        this.email = email;
        this.role = role;
        this.fechaCreacion = fechaCreacion;
        this.fechaEdicion = fechaCreacion;
        this.phone = "0";
        this.imagen = null;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

