package co.gov.mintic.SpeedCode.ingresoegresos.controller;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import co.gov.mintic.SpeedCode.ingresoegresos.service.IEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaRestController {
    @Autowired
    private IEmpresa iempresa;
    @GetMapping("/{id}")//este id q pasa la pagina la guarda como argumento de la funcion que sigue
    public Empresa findByIdEmpresa(@PathVariable long id){//este nombre id debe ser igual al de arriba si no digitara error
        return iempresa.findByIdEmpresa(id);
    }
    @GetMapping("/")
    public ArrayList<Empresa> findAllEmpresa(){
        return iempresa.findAllEmpresa();
    }
    @PostMapping("/")
    public Empresa createEmpresa(@RequestBody Empresa nuevo){
        return iempresa.createEmpresa(nuevo);
    }
    @PutMapping("/{id}")
    public Empresa updateEmpresa (@PathVariable long id,@RequestBody Empresa nuevo){
        return iempresa.updateEmpresa(id,nuevo);
    }
    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable long id){
        iempresa.deleteEmpresa(id);
        //despues de encontrarlo lo elimina;
    }
}
