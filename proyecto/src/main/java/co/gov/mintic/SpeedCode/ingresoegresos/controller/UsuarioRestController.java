package co.gov.mintic.SpeedCode.ingresoegresos.controller;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import co.gov.mintic.SpeedCode.ingresoegresos.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {
    @Autowired
    private IUsuarioService iusu;
    @GetMapping("/{id}")//este id q pasa la pagina la guarda como argumento de la funcion que sigue
    public Usuario findByIdUsuario(@PathVariable long id) {
        return iusu.findByIdUsuario(id);
    }
    @GetMapping("/")
    public ArrayList<Usuario> findallUsuario(){
        return iusu.findallUsuario();
    }
    @PostMapping("/")
    public Usuario createdUsuario(@RequestBody Usuario nuevo){
        return iusu.createdUsuario(nuevo);
    }
    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable long id,@RequestBody Usuario nuevo){
        return iusu.updateUsuario(id,nuevo);
    }
    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable long id){
        iusu.deleteUsuario(id);
        //borras este usuario
    }
}
