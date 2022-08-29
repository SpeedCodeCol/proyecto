package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public interface IEmpresa {
    public Empresa findByIdEmpresa(long id);
    public ArrayList<Empresa> findAllEmpresa();
    public Empresa createEmpresa(Empresa nuevo);
    public Empresa updateEmpresa (long id, Empresa nuevo);
    public void deleteEmpresa(long id);

}
