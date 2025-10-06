package paso_3_DDD_e_commerce.useCases;
import paso_3_DDD_e_commerce.domain.Producto;
import paso_3_DDD_e_commerce.domain.Cliente;

public class CalcularDescuento {
    public double aplicar(Producto producto, Cliente cliente){
        double descuento=0.0;
        switch(cliente.getTipo()){case "PREMIUM": descuento=0.15; break; case "REGULAR": descuento=0.05; break;}
        return producto.getPrecio()*(1-descuento);
    }
}
