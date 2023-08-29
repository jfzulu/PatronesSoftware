/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Composite
 * Tipo de Clase: Java
 * Clase para configurar los productos compuestos.
 * Hereda de AbstraccionProducto para mantener una estructura compatible con los productos de configuración simple.
 */
package composicion.productos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ConfiguracionCompuestaProducto extends AbstraccionProducto {
    private List<AbstraccionProducto> productos = new ArrayList<AbstraccionProducto>();

    public ConfiguracionCompuestaProducto(String nombre, double cantidad) {
        super(nombre, 0, cantidad);
    }

    @Override
    public double getPrecio() {
        double preciolocal = 0d;
        for (AbstraccionProducto child : productos) {
            preciolocal += child.getPrecio();
        }
        return preciolocal;
    }
    
    @Override
    public double getImpuesto() {
        double impuestoLocal=0d;
        for (AbstraccionProducto child : productos) {
            impuestoLocal += child.getImpuesto();
        }
        
        return impuestoLocal;
    }

    @Override
    public void setPrecio(double precio) {
        throw new UnsupportedOperationException();
    }
    
     public void AgregarProducto(AbstraccionProducto producto) {
        this.productos.add(producto);
    }
    
    public boolean RemoverProductos(AbstraccionProducto producto) {
        return this.productos.remove(producto);
    }
}