package paso_3_DDD_e_commerce.controller;
import paso_3_DDD_e_commerce.domain.Producto;
import org.springframework.web.bind.annotation.*;
import paso_3_DDD_e_commerce.useCases.CrearProducto;
import paso_3_DDD_e_commerce.repository.ProductoRepository;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController{
    private final CrearProducto crearProducto;
    private final ProductoRepository repo;
    public ProductoController(){ this.repo=new ProductoRepository(); this.crearProducto=new CrearProducto(repo);}
    @PostMapping
    public Producto crear(@RequestParam String nombre,@RequestParam double precio,@RequestParam int stock){return crearProducto.ejecutar(nombre,precio,stock);}
    @GetMapping
    public List<Producto> listar(){ return repo.obtenerTodos();}
}
