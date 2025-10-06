package paso_3_DDD_e_commerce.controller;
import paso_3_DDD_e_commerce.domain.Carrito;
import paso_3_DDD_e_commerce.domain.Pedido;
import org.springframework.web.bind.annotation.*;
import paso_3_DDD_e_commerce.useCases.ConfirmarPedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final ConfirmarPedido confirmarPedido = new ConfirmarPedido();
    @PostMapping("/crear")
    public Pedido crear(@RequestBody Carrito carrito){ return new Pedido(carrito); }
    @PostMapping("/confirmar")
    public String confirmar(@RequestBody Pedido pedido){ confirmarPedido.ejecutar(pedido); return "Pedido confirmado"; }
}
