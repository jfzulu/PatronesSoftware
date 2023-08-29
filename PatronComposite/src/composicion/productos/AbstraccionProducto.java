/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Composite
 * Tipo de Clase: Abstracta
 */

package composicion.productos;

/**
 *
 * @author Fabrizio Bolaño
 */
public abstract class AbstraccionProducto {
    protected String nombre;
    protected double precio;
    protected double iva;
    protected double cantidad;
    
    public AbstraccionProducto(String nombre, double precio, double cantidad) {
        super();
        this.cantidad= cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.iva = precio * 0.19;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad= cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getImpuesto() {
        return iva;
    }
    
    public void setImpuesto(double precio){
        this.iva= precio * 0.19;
    }

}
