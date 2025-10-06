package paso_3_DDD_e_commerce.domain;

public class Pedido {
    private static int contador = 1;
    private final int id;
    private final Carrito carrito;
    private String estado;
    public Pedido(Carrito carrito) {
        this.id = contador++;
        this.carrito = carrito;
        this.estado = "CREADO";
    }
    public int getId() { return id; }
    public Carrito getCarrito() { return carrito; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public double getTotal() { return carrito.calcularTotal(); }
}
