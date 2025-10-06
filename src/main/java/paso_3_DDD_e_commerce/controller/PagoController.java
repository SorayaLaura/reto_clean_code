package paso_3_DDD_e_commerce.controller;
import paso_3_DDD_e_commerce.domain.Pago;
import org.springframework.web.bind.annotation.*;
import paso_3_DDD_e_commerce.useCases.ProcesarPago;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    private final ProcesarPago procesarPago = new ProcesarPago();
    @PostMapping("/procesar")
    public String procesar(@RequestBody Pago pago){ procesarPago.ejecutar(pago); return "Pago procesado. Estado: "+pago.getEstado(); }
}
