package villeraluis.codigo.pruebakonecta.services;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import villeraluis.codigo.pruebakonecta.models.ProductoModel;
import villeraluis.codigo.pruebakonecta.repositories.ProductoRepository;

@Service
public class ProductoService {

   @Autowired
   ProductoRepository productoRepository;

   public ArrayList<ProductoModel> obtenerProductos() {

      return (ArrayList<ProductoModel>) productoRepository.findAll();
      
   }


   public ProductoModel guardarProducto(ProductoModel producto) {
      Date d = new Date();
      Date date = new java.sql.Date(d.getTime());
      producto.setFechaCreacion(date);
      return productoRepository.save(producto);
   }

   public ArrayList<ProductoModel> obtenerPorNombre(String nombre_producto) {
      return productoRepository.findByNombreProducto(nombre_producto);
   } 

   public ProductoModel obtenerPorId(Long id) {
      return productoRepository.findById(id).get();
   }


  
   public boolean eliminarProducto(Long id) {
      try {
         productoRepository.deleteById(id);
         return true;
      } catch (Exception e) {
         return false;
      }
   }

}
