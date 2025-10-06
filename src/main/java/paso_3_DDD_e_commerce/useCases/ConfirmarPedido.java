package paso_3_DDD_e_commerce.useCases;
import paso_3_DDD_e_commerce.domain.Pedido;

public class ConfirmarPedido {
    public void ejecutar(Pedido pedido){ pedido.setEstado("CONFIRMADO"); }
}
