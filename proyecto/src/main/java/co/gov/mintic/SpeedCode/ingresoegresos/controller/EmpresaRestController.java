package co.gov.mintic.SpeedCode.ingresoegresos.controller;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaRestController {

    @GetMapping("/{id}")//este id q pasa la pagina la guarda como argumento de la funcion que sigue
    public Empresa findByIdEmpresa(@PathVariable long id){//este nombre id debe ser igual al de arriba si no digitara error
        Date date = new Date();
        ArrayList<Transaccion> transaccion=new ArrayList<>();
        TipoDocumento tp=new TipoDocumento();
        ArrayList< Usuario >usuarios=new ArrayList<>();
        Empresa em=new Empresa();
        em.setIdEmpresa(id);
        em.setAddress("calle 48#99-20");
        em.setEstadoEmpresa(true);
        em.setCreacion(date);
        em.setName("cocacola");
        em.setEmpleados(usuarios);
        em.setPhone("3012415382");
        em.setTipoDocumentoE(tp);
        em.setTransacciones(transaccion);
        em.setUltimaEdicion(date);

        return em;
    }
    //encontrar
    @GetMapping("/")
    public ArrayList<Empresa> findAllEmpresa(){
        Date date = new Date();
        ArrayList<Transaccion> transaccion=new ArrayList<>();
        TipoDocumento tp=new TipoDocumento();
        ArrayList< Usuario >usuarios=new ArrayList<>();
        Empresa em=new Empresa();
        em.setIdEmpresa(1);
        em.setAddress("calle 48#99-20");
        em.setEstadoEmpresa(true);
        em.setCreacion(date);
        em.setName("cocacola");
        em.setEmpleados(usuarios);
        em.setPhone("3012415382");
        em.setTipoDocumentoE(tp);
        em.setTransacciones(transaccion);
        em.setUltimaEdicion(date);
        Empresa em2=new Empresa();
        em2.setIdEmpresa(2);
        em2.setAddress("calle 48#99-20");
        em2.setEstadoEmpresa(true);
        em2.setCreacion(date);
        em2.setName("manzana");
        em2.setEmpleados(usuarios);
        em2.setPhone("3012415382");
        em2.setTipoDocumentoE(tp);
        em2.setTransacciones(transaccion);
        em2.setUltimaEdicion(date);
        ArrayList<Empresa>empresas=new ArrayList<>();
        empresas.add(em);
        empresas.add(em2);
        return empresas;
    }
    //crear un nuevo dato
    @PostMapping("/")
    public Empresa createEmpresa(@RequestBody Empresa nuevo){
        Empresa em=new Empresa();
        em.setIdEmpresa(4);
        em.setAddress(nuevo.getAddress());
        em.setEstadoEmpresa(nuevo.isEstadoEmpresa());
        em.setCreacion(nuevo.getCreacion());
        em.setName(nuevo.getName());
        em.setEmpleados(nuevo.getEmpleados());
        em.setPhone(nuevo.getPhone());
        em.setTipoDocumentoE(nuevo.getTipoDocumentoE());
        em.setTransacciones(nuevo.getTransacciones());
        em.setUltimaEdicion(nuevo.getUltimaEdicion());
        return em;
    }
    //ACTUALIZAR
    @PutMapping("/{id}")
    public Empresa updateEmpresa (@PathVariable long id,@RequestBody Empresa nuevo){
        Empresa em= findByIdEmpresa(id);
        em.setAddress(nuevo.getAddress());
        em.setEstadoEmpresa(nuevo.isEstadoEmpresa());
        em.setCreacion(nuevo.getCreacion());
        em.setName(nuevo.getName());
        em.setEmpleados(nuevo.getEmpleados());
        em.setPhone(nuevo.getPhone());
        em.setTipoDocumentoE(nuevo.getTipoDocumentoE());
        em.setTransacciones(nuevo.getTransacciones());
        em.setUltimaEdicion(nuevo.getUltimaEdicion());
        return em;
    }
    //Delete
    @DeleteMapping("/{id}")
    public void deleteEmpresa(@PathVariable long id){
        Empresa delete = findByIdEmpresa(id);
        //despues de encontrarlo lo elimina;
    }
}
