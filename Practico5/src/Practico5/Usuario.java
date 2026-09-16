package Practico5;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private CarritoDeCompras carrito;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.carrito = new CarritoDeCompras(1);
    }

    public void agregarAlCarrito(Producto p, int cantidad) {
        carrito.agregar(p, cantidad);
    }

    public void removerDelCarrito(Producto p) {
        carrito.remover(p);
    }

    public void verTotalCarrito() {
        System.out.println("Importe Total del Carrito: $" + carrito.total());
    }

    public void mostrarCarrito() {
        System.out.println("--- Carrito de " + nombre + " ---");
        if (carrito.getItems().isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            for (ItemCarrito item : carrito.getItems()) {
                System.out.println("- " + item.getProducto().getNombre() + 
                                   " | Cantidad: " + item.getCantidad() + 
                                   " | Subtotal: $" + item.subTotal());
            }
        }
    }

    public CarritoDeCompras getCarrito() { return carrito; }
}
