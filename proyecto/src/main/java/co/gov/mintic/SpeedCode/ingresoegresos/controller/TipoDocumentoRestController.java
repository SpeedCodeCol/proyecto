package co.gov.mintic.SpeedCode.ingresoegresos.controller;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import co.gov.mintic.SpeedCode.ingresoegresos.service.ITipoDocumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/td")
public class TipoDocumentoRestController {
    //inyecto interfaces
    @Autowired
    private ITipoDocumento tipoDoc;

    //encontrar el dato  por id
    @GetMapping("/{id}")//este id q pasa la pagina la guarda como argumento de la funcion que sigue
    public TipoDocumento findByIdTd(@PathVariable long id){//este nombre id debe ser igual al de arriba si no digitara error
        return tipoDoc.findByIdTp(id);
    }
    //encontrar
    @GetMapping("/")
    public ArrayList<TipoDocumento> findAllTp(){
        return tipoDoc.findAllTp();
    }
    //crear un nuevo dato
    @PostMapping("/")
    public TipoDocumento createTp(@RequestBody TipoDocumento tp){
        return tipoDoc.createTp(tp);
    }
    //ACTUALIZAR
    @PutMapping("/{id}")
    public TipoDocumento updateTp (@PathVariable long id,@RequestBody TipoDocumento tp){
        return tipoDoc.updateTp(id,tp);
    }
    //Delete
    @DeleteMapping("/{id}")
    public void deleteTp(@PathVariable long id){
        tipoDoc.deleteTp(id);
    }


}
