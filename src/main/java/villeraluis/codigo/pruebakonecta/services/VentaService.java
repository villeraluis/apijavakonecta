package villeraluis.codigo.pruebakonecta.services;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import villeraluis.codigo.pruebakonecta.models.VentasModel;
import villeraluis.codigo.pruebakonecta.repositories.VentaRepository;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    public ArrayList<VentasModel> obtenerVentas() {

        return (ArrayList<VentasModel>) ventaRepository.findAll();
     }

     public VentasModel guardarVenta(VentasModel venta) {
      Date d = new Date();
      Date date = new java.sql.Date(d.getTime());
      venta.setFechaVenta(date);
        return ventaRepository.save(venta);
     }

    
    
}
