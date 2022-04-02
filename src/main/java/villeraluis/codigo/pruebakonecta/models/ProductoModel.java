package villeraluis.codigo.pruebakonecta.models;

import java.util.Date;


import javax.persistence.*;


@Entity // etiqueta usada por jpa para saber que es un modelo
@Table(name="productos")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nombreProducto;
    @Column(nullable = false)
    private String referencia;
    @Column(nullable = false)
    private int precio; // ¡solo úso entero porque asi pide la prueba, en realidad deberia usar un tipo de dato que permita decimales, float
    @Column(nullable = false)
    private int peso;
    @Column(nullable = false)
    private String categoria;
    @Column(nullable = false)
    private int stock;

    @Column(updatable = false, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    
    


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }



  
    
    


}
