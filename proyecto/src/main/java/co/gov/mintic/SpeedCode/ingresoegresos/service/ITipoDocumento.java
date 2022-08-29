package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public interface ITipoDocumento {

    public TipoDocumento findByIdTp(long id);
    public ArrayList<TipoDocumento> findAllTp();
    public TipoDocumento createTp(TipoDocumento tp);
    public TipoDocumento updateTp (long id, TipoDocumento tp);
    public void deleteTp(long id);
}
