package paso_3_DDD_e_commerce.domain;
public class Producto {
    private final String nombre;
    private double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void disminuirStock(int cantidad) { this.stock -= cantidad; }
}
