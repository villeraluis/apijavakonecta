package villeraluis.codigo.pruebakonecta.controllers;
import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import villeraluis.codigo.pruebakonecta.models.ProductoModel;
import villeraluis.codigo.pruebakonecta.services.ProductoService;

@CrossOrigin(origins = "http://localhost:3000/productos", maxAge = 3600)
@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ArrayList<ProductoModel> obtenerProductos(){
       
        return productoService.obtenerProductos();
    }


    @PostMapping()
    public ProductoModel guardarProducto(@RequestBody ProductoModel producto){
        return this.productoService.guardarProducto(producto);
    }

    @GetMapping(path = "/{id}")
    public ProductoModel obtenerPorId(@PathVariable("id") Long id){
        
        return productoService.obtenerPorId(id);
    }


    @GetMapping(path = "/query")
    public ArrayList<ProductoModel> obtenerPorNombre(@PathVariable("nombre") String nombre_producto ){

        return productoService.obtenerPorNombre(nombre_producto);
    } 

    

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok= this.productoService.eliminarProducto(id);
        if(ok){
            return "se elimino"+id;
        }else{
            
            return "no se elimino"+id;
        }

    }
    
}
