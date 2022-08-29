package co.gov.mintic.SpeedCode.ingresoegresos.controller;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/td")
public class TipoDocumentoRestController {

    //encontrar el dato  por id
    @GetMapping("/{id}")//este id q pasa la pagina la guarda como argumento de la funcion que sigue
    public TipoDocumento findById(@PathVariable long id){//este nombre id debe ser igual al de arriba si no digitara error
        TipoDocumento tp=new TipoDocumento();
        tp.setIdTipoDocumento(id);
        tp.setDescripcion("Cedula de ciudadania");
        tp.setEstado(true);
        tp.setSiglas("cc");
        return tp;
    }
    //encontrar
    @GetMapping("/")
    public ArrayList<TipoDocumento> findAll(){
        TipoDocumento tp=new TipoDocumento();
        tp.setIdTipoDocumento(1);
        tp.setDescripcion("Cedula de ciudadania");
        tp.setEstado(true);
        tp.setSiglas("cc");
        TipoDocumento tp2=new TipoDocumento();
        tp2.setIdTipoDocumento(2);
        tp2.setDescripcion("pasaporte");
        tp2.setEstado(true);
        tp2.setSiglas("PP");
        ArrayList<TipoDocumento> listaTp=new ArrayList<>();
        listaTp.add(tp);
        listaTp.add(tp2);
        return listaTp;
    }
    //crear un nuevo dato
    @PostMapping("/")
    public TipoDocumento createTp(@RequestBody TipoDocumento tp){
        TipoDocumento newtp=new TipoDocumento();
        newtp.setIdTipoDocumento(3);
        newtp.setDescripcion(tp.getDescripcion());
        newtp.setEstado(tp.isEstado());
        newtp.setSiglas(tp.getSiglas());
        return newtp;
    }
    //ACTUALIZAR
    @PutMapping("/{id}")
    public TipoDocumento updateTp (@PathVariable long id,@RequestBody TipoDocumento tp){
        TipoDocumento actualizado = findById(id);
        actualizado.setSiglas(tp.getSiglas());
        actualizado.setEstado(tp.isEstado());
        actualizado.setDescripcion(tp.getDescripcion());
        return actualizado;
    }
    //Delete
    @DeleteMapping("/{id}")
    public void deleteTp(@PathVariable long id){
        TipoDocumento delete = findById(id);
        //despues de encontrarlo lo elimina;
    }


}
