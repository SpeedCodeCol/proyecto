package co.gov.mintic.SpeedCode.ingresoegresos.service;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.TipoDocumento;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
@Service
public class EmpresaService implements IEmpresa {
    @Override
    public Empresa findByIdEmpresa(long id) {
        Date date = new Date();
        ArrayList<Transaccion> transaccion=new ArrayList<>();
        TipoDocumento tp=new TipoDocumento();
        ArrayList<Usuario>usuarios=new ArrayList<>();
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

    @Override
    public ArrayList<Empresa> findAllEmpresa() {
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

    @Override
    public Empresa createEmpresa(Empresa nuevo) {
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

    @Override
    public Empresa updateEmpresa(long id, Empresa nuevo) {
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

    @Override
    public void deleteEmpresa(long id) {
        Empresa delete = findByIdEmpresa(id);
    }
}
