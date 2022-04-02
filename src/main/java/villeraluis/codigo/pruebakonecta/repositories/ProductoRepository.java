package villeraluis.codigo.pruebakonecta.repositories;

import org.springframework.stereotype.Repository;

import villeraluis.codigo.pruebakonecta.models.ProductoModel;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel,Long> {
    
    public abstract ArrayList<ProductoModel> findByNombreProducto(String nombreProducto);
}

