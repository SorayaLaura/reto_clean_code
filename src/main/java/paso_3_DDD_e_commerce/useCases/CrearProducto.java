package paso_3_DDD_e_commerce.useCases;
import paso_3_DDD_e_commerce.domain.Producto;
import paso_3_DDD_e_commerce.repository.ProductoRepository;
public class CrearProducto {
    private final ProductoRepository repo;
    public CrearProducto(ProductoRepository repo) { this.repo = repo; }
    public Producto ejecutar(String nombre, double precio, int stock) {
        Producto p = new Producto(nombre, precio, stock);
        repo.guardar(p);
        return p;
    }
}
