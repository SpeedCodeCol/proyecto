package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TransaccionService implements ITransaccion{
    @Override
    public Transaccion findByIdTrasanccion(long id) {
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

    @Override
    public ArrayList<Transaccion> findAllTransaccion() {
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

    @Override
    public Transaccion createTransaccion(Transaccion nuevo) {
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

    @Override
    public Transaccion updateTransaccion(long id, Transaccion nuevo) {
        Transaccion tran= findByIdTrasanccion(id);
        tran.setCreacion(nuevo.getCreacion());
        tran.setAmount(nuevo.getAmount());
        tran.setUltimaEdicion(nuevo.getUltimaEdicion());
        tran.setConcepto(nuevo.getConcepto());
        tran.setEstadoTransaccion(nuevo.isEstadoTransaccion());
        tran.setUsuario(nuevo.getUsuario());
        return tran;
    }

    @Override
    public void deleteTransaccion(long id) {
        Transaccion delete = findByIdTrasanccion(id);
    }
}
