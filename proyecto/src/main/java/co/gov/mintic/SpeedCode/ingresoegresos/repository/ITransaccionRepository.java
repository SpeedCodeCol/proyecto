package co.gov.mintic.SpeedCode.ingresoegresos.repository;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransaccionRepository extends CrudRepository<Transaccion,Long> {
}
