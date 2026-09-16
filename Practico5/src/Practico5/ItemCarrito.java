package Practico5;

public class ItemCarrito {
    private int id;
    private Producto producto;
    private int cantidad;

    public ItemCarrito(int id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double subTotal() {
        return producto.getPrecio() * cantidad;
    }

    public int getId() { return id; }
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}