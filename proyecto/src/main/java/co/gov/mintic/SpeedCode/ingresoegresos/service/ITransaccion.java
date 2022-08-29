package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public interface ITransaccion {
    public Transaccion findByIdTrasanccion(long id);
    public ArrayList<Transaccion> findAllTransaccion();
    public Transaccion createTransaccion(Transaccion nuevo);
    public Transaccion updateTransaccion (long id,Transaccion nuevo);
    public void deleteTransaccion(long id);
}
