package paso_3_DDD_e_commerce.useCases;
import paso_3_DDD_e_commerce.domain.Producto;

public class GestionInventario {
    public boolean hayStock(Producto producto, int cantidad){ return producto.getStock()>=cantidad;}
}
