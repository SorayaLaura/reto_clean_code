package paso_3_DDD_e_commerce.domain;

public class Pago {
    private final Pedido pedido;
    private final double monto;
    private String estado;
    public Pago(Pedido pedido, double monto) {
        this.pedido = pedido;
        this.monto = monto;
        this.estado = "PENDIENTE";
    }
    public void procesarPago() {
        this.estado = "PAGADO";
        pedido.setEstado("CONFIRMADO");
    }
    public String getEstado() { return estado; }
    public double getMonto() { return monto; }
}
