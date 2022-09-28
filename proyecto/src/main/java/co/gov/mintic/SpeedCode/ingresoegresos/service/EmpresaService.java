package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import co.gov.mintic.SpeedCode.ingresoegresos.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresa {
    @Autowired
    private IEmpresaRepository empresaRepository;
    @Override
    public Empresa findByIdEmpresa(long id) {
        Optional<Empresa> em=empresaRepository.findById(id);
        return em.get();
    }

    @Override
    public ArrayList<Empresa> findAllEmpresa() {
        ArrayList<Empresa>empresas=(ArrayList<Empresa>)empresaRepository.findAll();
        return empresas;
    }

    @Override
    public Empresa createEmpresa(Empresa nuevo) {
        Empresa em=empresaRepository.save(nuevo);
        return em;
    }

    @Override
    public Empresa updateEmpresa(long id, Empresa nuevo) {
        Empresa em=empresaRepository.save(nuevo);
        return em;
    }

    @Override
    public void deleteEmpresa(long id) {
        empresaRepository.deleteById(id);
    }
}
