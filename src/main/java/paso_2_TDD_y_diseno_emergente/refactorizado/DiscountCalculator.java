package paso_2_TDD_y_diseno_emergente.refactorizado;

import java.util.HashMap;
import java.util.Map;

public class DiscountCalculator {

    private static final Map<String, Double> tasasDescuento = new HashMap<>();
    static {
        tasasDescuento.put("preferente", 0.9);
        tasasDescuento.put("vip", 0.8);
    }

    public static double calcularDescuento(double precio, String tipoCliente) {
        return precio * tasasDescuento.getOrDefault(tipoCliente, 1.0);
    }
}
