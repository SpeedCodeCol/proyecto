package co.gov.mintic.SpeedCode.ingresoegresos.controller;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import co.gov.mintic.SpeedCode.ingresoegresos.service.ITransaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/transaccion")
public class TransaccionRestController {
    @Autowired
    private ITransaccion itrans;
    @GetMapping("/usuario/{id}")
    public ArrayList<Transaccion> obtenerTransaccionId(@PathVariable long id){
        ArrayList<Transaccion> trans=itrans.obtenerTransaccionIdUsuario(id);
        return trans;
    }
    @GetMapping("/{id}")//este id q pasa la pagina la guarda como argumento de la funcion que sigue
    public Transaccion findByIdTrasanccion(@PathVariable long id){//este nombre id debe ser igual al de arriba si no digitara error
        return itrans.findByIdTrasanccion(id);
    }
    @GetMapping("/")
    public ArrayList<Transaccion> findAllTransaccion(){
        return itrans.findAllTransaccion();
    }
    @PostMapping("/")
    public Transaccion createTransaccion(@RequestBody Transaccion nuevo){
        return itrans.createTransaccion(nuevo);
    }
    @PutMapping("/{id}")
    public Transaccion updateTransaccion (@PathVariable long id,@RequestBody Transaccion nuevo){
        return itrans.updateTransaccion(id,nuevo);
    }
    @DeleteMapping("/{id}")
    public void deleteTransaccion(@PathVariable long id){
        itrans.deleteTransaccion(id);
    }
}
