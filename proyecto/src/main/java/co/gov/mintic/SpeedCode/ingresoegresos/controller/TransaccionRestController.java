package co.gov.mintic.SpeedCode.ingresoegresos.controller;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/api/transaccion")
public class TransaccionRestController {

    @GetMapping("/{id}")//este id q pasa la pagina la guarda como argumento de la funcion que sigue
    public Transaccion findByIdTrasanccion(@PathVariable long id){//este nombre id debe ser igual al de arriba si no digitara error
        Date date = new Date();
        Transaccion tran=new Transaccion();
        tran.setIdTransaccion(id);
        tran.setCreacion(date);
        tran.setAmount(20000);
        tran.setUltimaEdicion(date);
        tran.setConcepto("venta camiones");
        tran.setEstadoTransaccion(true);
        tran.setUsuario(new Usuario());

        return tran;
    }
    //encontrar
    @GetMapping("/")
    public ArrayList<Transaccion> findAllTransaccion(){
        Date date = new Date();
        Transaccion tran=new Transaccion();
        tran.setIdTransaccion(1);
        tran.setCreacion(date);
        tran.setAmount(20000);
        tran.setUltimaEdicion(date);
        tran.setConcepto("venta camiones");
        tran.setEstadoTransaccion(true);
        tran.setUsuario(new Usuario());
        Transaccion tran2=new Transaccion();
        tran2.setIdTransaccion(2);
        tran2.setCreacion(date);
        tran2.setAmount(20000);
        tran2.setUltimaEdicion(date);
        tran2.setConcepto("venta camiones");
        tran2.setEstadoTransaccion(true);
        tran2.setUsuario(new Usuario());
        ArrayList<Transaccion>transacciones=new ArrayList<>();
        transacciones.add(tran);
        transacciones.add(tran2);
        return transacciones;
    }
    //crear un nuevo dato
    @PostMapping("/")
    public Transaccion createTransaccion(@RequestBody Transaccion nuevo){
        Transaccion tran=new Transaccion();
        tran.setIdTransaccion(4);
        tran.setCreacion(nuevo.getCreacion());
        tran.setAmount(nuevo.getAmount());
        tran.setUltimaEdicion(nuevo.getUltimaEdicion());
        tran.setConcepto(nuevo.getConcepto());
        tran.setEstadoTransaccion(nuevo.isEstadoTransaccion());
        tran.setUsuario(nuevo.getUsuario());

        return tran;
    }
    //ACTUALIZAR
    @PutMapping("/{id}")
    public Transaccion updateTransaccion (@PathVariable long id,@RequestBody Transaccion nuevo){
        Transaccion tran= findByIdTrasanccion(id);
        tran.setCreacion(nuevo.getCreacion());
        tran.setAmount(nuevo.getAmount());
        tran.setUltimaEdicion(nuevo.getUltimaEdicion());
        tran.setConcepto(nuevo.getConcepto());
        tran.setEstadoTransaccion(nuevo.isEstadoTransaccion());
        tran.setUsuario(nuevo.getUsuario());
        return tran;
    }
    //Delete
    @DeleteMapping("/{id}")
    public void deleteTransaccion(@PathVariable long id){
        Transaccion delete = findByIdTrasanccion(id);
        //despues de encontrarlo lo elimina;
    }
}
