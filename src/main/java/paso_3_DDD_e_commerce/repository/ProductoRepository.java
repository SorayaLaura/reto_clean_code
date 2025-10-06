package paso_3_DDD_e_commerce.repository;
import paso_3_DDD_e_commerce.domain.Producto;

import java.util.ArrayList;
import java.util.List;
public class ProductoRepository {
    private final List<Producto> productos = new ArrayList<>();
    public void guardar(Producto producto){ productos.add(producto);}
    public List<Producto> obtenerTodos(){ return List.copyOf(productos);}
    public Producto buscarPorNombre(String nombre){return productos.stream().filter(p->p.getNombre().equals(nombre)).findFirst().orElse(null);}
}
