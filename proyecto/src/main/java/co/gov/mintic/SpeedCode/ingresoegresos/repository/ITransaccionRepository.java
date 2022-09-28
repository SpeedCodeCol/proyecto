package co.gov.mintic.SpeedCode.ingresoegresos.repository;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Transaccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ITransaccionRepository extends CrudRepository<Transaccion,Long> {
    @Query(
            value = "SELECT * FROM transacciones WHERE id_usuario = :id",
            nativeQuery = true
    )
    ArrayList<Transaccion> obtenerTransaccionIdUsuario(@Param("id") long id);

}