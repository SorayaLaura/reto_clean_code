package paso_3_DDD_e_commerce.useCases;
import paso_3_DDD_e_commerce.domain.Pago;

public class ProcesarPago {
    public void ejecutar(Pago pago){ pago.procesarPago(); }
}
