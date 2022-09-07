package co.gov.mintic.SpeedCode.ingresoegresos.repository;

import co.gov.mintic.SpeedCode.ingresoegresos.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Long> {
}
