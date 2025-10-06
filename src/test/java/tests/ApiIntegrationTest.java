package tests;
import paso_3_DDD_e_commerce.controller.ProductoController;
import paso_3_DDD_e_commerce.controller.CarritoController;
import paso_3_DDD_e_commerce.controller.PedidoController;
import paso_3_DDD_e_commerce.controller.PagoController;
import paso_3_DDD_e_commerce.domain.Producto;
import paso_3_DDD_e_commerce.domain.Carrito;
import paso_3_DDD_e_commerce.domain.Pedido;
import paso_3_DDD_e_commerce.domain.Pago;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ApiIntegrationTest {
    private ProductoController productoController;
    private CarritoController carritoController;
    private PedidoController pedidoController;
    private PagoController pagoController;

    @BeforeEach
    void setUp() {
        productoController = new ProductoController();
        carritoController = new CarritoController();
        pedidoController = new PedidoController();
        pagoController = new PagoController();
    }

    @Test
    void testRegistrarYListarProducto() {
        Producto laptop = productoController.crear("Laptop",1000,10);
        List<Producto> productos = productoController.listar();
        assertEquals(1,productos.size());
        assertEquals("Laptop",productos.get(0).getNombre());
    }

    @Test
    void testAgregarProductoCarritoYTotal() {
        Producto mouse = productoController.crear("Mouse",50,5);
        carritoController.agregar("Mouse",2,mouse);
        assertEquals(100,carritoController.total());
    }

    @Test
    void testConfirmarPedido() {
        Carrito carrito = new Carrito();
        Producto teclado = productoController.crear("Teclado",100,5);
        carritoController.agregar("Teclado",1,teclado);
        Pedido pedido = pedidoController.crear(carrito);
        assertEquals("CREADO",pedido.getEstado());
        pedidoController.confirmar(pedido);
        assertEquals("CONFIRMADO",pedido.getEstado());
    }

    @Test
    void testProcesarPago() {
        Carrito carrito = new Carrito();
        Producto monitor = productoController.crear("Monitor",200,3);
        carritoController.agregar("Monitor",1,monitor);
        Pedido pedido = pedidoController.crear(carrito);
        pedidoController.confirmar(pedido);
        Pago pago = new Pago(pedido,pedido.getTotal());
        pagoController.procesar(pago);
        assertEquals("PAGADO",pago.getEstado());
        assertEquals("CONFIRMADO",pedido.getEstado());
    }
}
