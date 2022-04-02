package villeraluis.codigo.pruebakonecta.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import villeraluis.codigo.pruebakonecta.models.ProductoModel;
import villeraluis.codigo.pruebakonecta.models.VentasModel;
import villeraluis.codigo.pruebakonecta.services.ProductoService;
import villeraluis.codigo.pruebakonecta.services.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    VentaService ventaService;

    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ArrayList<VentasModel> obtenerVentas() {

        return ventaService.obtenerVentas();
    }

    @PostMapping()
    public String guardarVenta(@RequestBody VentasModel venta) {

        ProductoModel pro = this.productoService.obtenerPorId(venta.getProducto().getId());
        int cantidad=venta.getCantidadVenta();

        if(pro.getStock()-cantidad < 0){
            return "El producto actual en elstock no es Suficiente , Solo quedan "+pro.getStock()+" unidades";
        }else
        {
            pro.setStock(pro.getStock()-cantidad);
            venta.setProducto(this.productoService.guardarProducto(pro));
            this.ventaService.guardarVenta(venta);
            return "se guardo la venta corectamente";
        }

    }

}
