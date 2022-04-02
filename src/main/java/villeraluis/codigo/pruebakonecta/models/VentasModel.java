package villeraluis.codigo.pruebakonecta.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ventas")
public class VentasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    private Long id_venta;

    @Column(name="cantidad_venta",nullable = false)
    private int cantidadVenta;
    
    
    @Column(name="fecha_venta", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;


    @ManyToOne()
    @JoinColumn(name = "fk_producto", insertable = true, nullable = false, updatable = false)
    private ProductoModel producto;

    public int getCantidadVenta() {
        return cantidadVenta;
    }

    public void setCantidadVenta(int cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public ProductoModel getProducto() {
        return producto;
    }

    public void setProducto(ProductoModel producto) {
        this.producto = producto;
    }

    public Long getId_venta() {
        return id_venta;
    }

    public void setId_venta(Long id_venta) {
        this.id_venta = id_venta;
    }









    





    

    



    




    
}
