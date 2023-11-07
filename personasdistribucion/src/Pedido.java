class Pedido {
    private final Producto producto;
    private final int cantidad;
    private final String nombrePersona;
    private final String direccionEntrega;

    public Pedido(Producto producto, int cantidad, String nombrePersona, String direccionEntrega) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.nombrePersona = nombrePersona;
        this.direccionEntrega = direccionEntrega;
    }

    public void imprimirPedido() {
        System.out.println("Pedido:");
        System.out.println("Nombre del Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Nombre de la Persona: " + nombrePersona);
        System.out.println("Dirección de Entrega: " + direccionEntrega);
        System.out.println("Costo Total: $" + (producto.getPrecio() * cantidad));

        imprimirVoucher(); // Llamar al método para imprimir el voucher
    }

    public void imprimirVoucher() {
        System.out.println("Voucher de Compra:");
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + producto.getPrecio());
        System.out.println("Total: $" + (producto.getPrecio() * cantidad));
    }
}
