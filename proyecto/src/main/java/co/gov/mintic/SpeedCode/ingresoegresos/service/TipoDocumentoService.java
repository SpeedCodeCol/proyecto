package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TipoDocumentoService implements ITipoDocumento{

    @Override
    public TipoDocumento findByIdTp(long id) {
        TipoDocumento tp=new TipoDocumento();
        tp.setIdTipoDocumento(id);
        tp.setDescripcion("Cedula de ciudadania");
        tp.setEstado(true);
        tp.setSiglas("cc");
        return tp;
    }

    @Override
    public ArrayList<TipoDocumento> findAllTp() {
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

    @Override
    public TipoDocumento createTp(TipoDocumento tp) {
        TipoDocumento newtp=new TipoDocumento();
        newtp.setIdTipoDocumento(3);
        newtp.setDescripcion(tp.getDescripcion());
        newtp.setEstado(tp.isEstado());
        newtp.setSiglas(tp.getSiglas());
        return newtp;
    }

    @Override
    public TipoDocumento updateTp(long id, TipoDocumento tp) {
        TipoDocumento actualizado = findByIdTp(id);
        actualizado.setSiglas(tp.getSiglas());
        actualizado.setEstado(tp.isEstado());
        actualizado.setDescripcion(tp.getDescripcion());
        return actualizado;
    }

    @Override
    public void deleteTp(long id) {
        TipoDocumento delete = findByIdTp(id);
    }
}
