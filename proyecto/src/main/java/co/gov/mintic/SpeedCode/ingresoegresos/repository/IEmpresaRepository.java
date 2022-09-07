package co.gov.mintic.SpeedCode.ingresoegresos.repository;
import co.gov.mintic.SpeedCode.ingresoegresos.entity.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends CrudRepository<Empresa,Long>{

}