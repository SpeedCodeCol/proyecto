package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Rol;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
@Service
public class UsuarioService implements IUsuarioService {

    @Override
    public Usuario findByIdUsuario(long id) {
        Usuario persona=new Usuario();
        persona.setIdUsuario(id);
        persona.setClave("4040");
        persona.setCorreo("santycanal@.com");
        persona.setEmpresa(new Empresa());
        persona.setEstado(true);
        persona.setFechaCreacion(new Date());
        persona.setFechaEdicion(new Date());
        persona.setNombre("santiago");
        persona.setPhone("3012415382");
        persona.setRole(Rol.empleado);
        persona.setTipoDocumento(new TipoDocumento());
        return persona;
    }

    @Override
    public ArrayList<Usuario> findallUsuario() {
        Usuario persona=new Usuario();
        persona.setIdUsuario(1);
        persona.setClave("4040");
        persona.setCorreo("santycanal@.com");
        persona.setEmpresa(new Empresa());
        persona.setEstado(true);
        persona.setFechaCreacion(new Date());
        persona.setFechaEdicion(new Date());
        persona.setNombre("santiago");
        persona.setPhone("3012415382");
        persona.setRole(Rol.empleado);
        persona.setTipoDocumento(new TipoDocumento());
        Usuario persona2=new Usuario();
        persona2.setIdUsuario(2);
        persona2.setClave("401401");
        persona2.setCorreo("sANDREScanal@.com");
        persona2.setEmpresa(new Empresa());
        persona2.setEstado(false);
        persona2.setFechaCreacion(new Date());
        persona2.setFechaEdicion(new Date());
        persona2.setNombre("sandres");
        persona2.setPhone("3004434582");
        persona2.setRole(Rol.administrador);
        persona2.setTipoDocumento(new TipoDocumento());
        ArrayList<Usuario>usuarios=new ArrayList<>();
        usuarios.add(persona);
        usuarios.add(persona2);
        return usuarios;
    }

    @Override
    public Usuario createdUsuario(Usuario nuevo) {
        Usuario persona=new Usuario();
        persona.setIdUsuario(3);
        persona.setClave(nuevo.getClave());
        persona.setCorreo(nuevo.getCorreo());
        persona.setEmpresa(nuevo.getEmpresa());
        persona.setEstado(nuevo.isEstado());
        persona.setFechaCreacion(nuevo.getFechaCreacion());
        persona.setFechaEdicion(nuevo.getFechaEdicion());
        persona.setNombre(nuevo.getNombre());
        persona.setPhone(nuevo.getPhone());
        persona.setRole(nuevo.getRole());
        persona.setTipoDocumento(nuevo.getTipoDocumento());
        return persona;
    }

    @Override
    public Usuario updateUsuario(long id, Usuario nuevo) {
        Usuario persona=findByIdUsuario(id);
        persona.setIdUsuario(id);
        persona.setClave(nuevo.getClave());
        persona.setCorreo(nuevo.getCorreo());
        persona.setEmpresa(nuevo.getEmpresa());
        persona.setEstado(nuevo.isEstado());
        persona.setFechaCreacion(nuevo.getFechaCreacion());
        persona.setFechaEdicion(nuevo.getFechaEdicion());
        persona.setNombre(nuevo.getNombre());
        persona.setPhone(nuevo.getPhone());
        persona.setRole(nuevo.getRole());
        persona.setTipoDocumento(nuevo.getTipoDocumento());
        return persona;
    }

    @Override
    public void deleteUsuario(long id) {
        Usuario us=findByIdUsuario(id);
    }
}
