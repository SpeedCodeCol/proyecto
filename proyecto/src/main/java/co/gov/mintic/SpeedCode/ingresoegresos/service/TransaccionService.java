package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import co.gov.mintic.SpeedCode.ingresoegresos.repository.ITransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class TransaccionService implements ITransaccion{
    @Autowired
    private ITransaccionRepository transaccionRepository;
    @Override
    public Transaccion findByIdTrasanccion(long id) {
        Optional<Transaccion> tran=transaccionRepository.findById(id);
        return tran.get();
    }

    @Override
    public ArrayList<Transaccion> findAllTransaccion() {
        ArrayList<Transaccion>transacciones= (ArrayList<Transaccion>) transaccionRepository.findAll();
        return transacciones;
    }

    @Override
    public Transaccion createTransaccion(Transaccion nuevo) {
        Transaccion tran=transaccionRepository.save(nuevo);
        return tran;
    }

    @Override
    public Transaccion updateTransaccion(long id, Transaccion nuevo) {
        Transaccion tran= transaccionRepository.save(nuevo);
        return tran;
    }

    @Override
    public void deleteTransaccion(long id) {
        transaccionRepository.deleteById(id);
    }
}
