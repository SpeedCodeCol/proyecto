package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Rol;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import co.gov.mintic.SpeedCode.ingresoegresos.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Override
    public Usuario findByIdUsuario(long id) {
        Optional<Usuario> persona=usuarioRepository.findById(id);
        return persona.get();
    }

    @Override
    public ArrayList<Usuario> findallUsuario() {
        ArrayList<Usuario>usuarios= (ArrayList<Usuario>) usuarioRepository.findAll();
        return usuarios;
    }

    @Override
    public Usuario createdUsuario(Usuario nuevo) {
        Usuario persona=usuarioRepository.save(nuevo);
        return persona;
    }

    @Override
    public Usuario updateUsuario(long id, Usuario nuevo) {
        Usuario persona=usuarioRepository.save(nuevo);
        return persona;
    }

    @Override
    public void deleteUsuario(long id) {

        usuarioRepository.deleteById(id);
    }
}
