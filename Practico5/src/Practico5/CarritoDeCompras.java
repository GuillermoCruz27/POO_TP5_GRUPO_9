package Practico5;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private int id;
    private List<ItemCarrito> items;

    public CarritoDeCompras(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public void agregar(Producto p, int cantidad) {
        if (!p.isActivo()) {
            System.out.println("El producto " + p.getNombre() + " no está disponible.");
            return;
        }

        for (ItemCarrito item : items) {
            if (item.getProducto().getCodigo().equals(p.getCodigo())) {
                item.setCantidad(item.getCantidad() + cantidad);
                return;
            }
        }
        items.add(new ItemCarrito(items.size() + 1, p, cantidad));
    }

    public void remover(Producto p) {
        items.removeIf(item -> item.getProducto().getCodigo().equals(p.getCodigo()));
    }

    public double total() {
        double acum = 0;
        for (ItemCarrito item : items) {
            acum += item.subTotal();
        }
        return acum;
    }

    public void vaciar() {
        items.clear();
    }

    public List<ItemCarrito> getItems() {
        return items;
    }
}