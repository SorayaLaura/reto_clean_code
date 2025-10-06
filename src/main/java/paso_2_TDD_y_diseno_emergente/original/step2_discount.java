package paso_2_TDD_y_diseno_emergente.original;

/**
 * Clase utilitaria para calcular descuentos según el tipo de cliente.
 */
class DiscountCalculator {
    public static double calcularDescuento(double precio, String tipoCliente) {
        switch (tipoCliente) {
            case "preferente":
                return precio * 0.9;
            case "vip":
                return precio * 0.8;
            default:
                return precio;
        }
    }
}