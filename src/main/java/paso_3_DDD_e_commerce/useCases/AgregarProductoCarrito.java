package paso_3_DDD_e_commerce.useCases;
import paso_3_DDD_e_commerce.domain.Carrito;
import paso_3_DDD_e_commerce.domain.Producto;

public class AgregarProductoCarrito {
    public void ejecutar(Carrito carrito, Producto producto, int cantidad) {
        if(producto.getStock() < cantidad) throw new RuntimeException("Stock insuficiente");
        for(int i=0;i<cantidad;i++){ carrito.agregarProducto(producto); producto.disminuirStock(1);}
    }
}
