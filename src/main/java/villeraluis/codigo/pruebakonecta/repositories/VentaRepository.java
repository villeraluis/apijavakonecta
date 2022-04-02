package villeraluis.codigo.pruebakonecta.repositories;

import org.springframework.stereotype.Repository;

import villeraluis.codigo.pruebakonecta.models.VentasModel;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface VentaRepository extends CrudRepository<VentasModel,Long> {
    
}
