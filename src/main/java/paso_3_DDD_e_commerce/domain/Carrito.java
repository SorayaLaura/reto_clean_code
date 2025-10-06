package paso_3_DDD_e_commerce.domain;
import java.util.ArrayList;
import java.util.List;
public class Carrito {
    private final List<Producto> productos = new ArrayList<>();
    public void agregarProducto(Producto producto) { productos.add(producto); }
    public List<Producto> getProductos() { return List.copyOf(productos); }
    public double calcularTotal() { return productos.stream().mapToDouble(Producto::getPrecio).sum(); }
}
