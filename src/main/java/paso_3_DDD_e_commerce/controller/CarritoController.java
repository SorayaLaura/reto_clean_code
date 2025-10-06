package paso_3_DDD_e_commerce.controller;
import paso_3_DDD_e_commerce.domain.Carrito;
import paso_3_DDD_e_commerce.domain.Producto;
import org.springframework.web.bind.annotation.*;
import paso_3_DDD_e_commerce.useCases.AgregarProductoCarrito;

@RestController
@RequestMapping("/carrito")
public class CarritoController {
    private final Carrito carrito = new Carrito();
    private final AgregarProductoCarrito useCase = new AgregarProductoCarrito();
    @PostMapping("/agregar")
    public String agregar(@RequestParam String nombre,@RequestParam int cantidad,@RequestBody Producto producto){
        useCase.ejecutar(carrito,producto,cantidad);
        return "Producto agregado al carrito";
    }
    @GetMapping("/total")
    public double total(){ return carrito.calcularTotal();}
}
