package paso_3_DDD_e_commerce.domain;
public class Cliente {
    private final String nombre;
    private final String tipo;
    public Cliente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
}
