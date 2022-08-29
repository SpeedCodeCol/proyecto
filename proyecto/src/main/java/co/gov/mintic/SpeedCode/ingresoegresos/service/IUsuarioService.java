package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public interface IUsuarioService {
    public Usuario findByIdUsuario(long id);
    public ArrayList<Usuario> findallUsuario();
    public Usuario createdUsuario(Usuario nuevo);
    public Usuario updateUsuario(long id,Usuario nuevo);
    public void deleteUsuario(long id);
}
