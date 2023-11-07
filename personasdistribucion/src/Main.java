import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Producto producto1 = new Producto("pañales", 10.0);
            Producto producto2 = new Producto("leche en polvo", 15.0);
            Producto producto3 = new Producto("jugo", 20.0);
            
            System.out.println("Productos disponibles:");
            System.out.println("1. " + producto1.getNombre() + " - $" + producto1.getPrecio());
            System.out.println("2. " + producto2.getNombre() + " - $" + producto2.getPrecio());
            System.out.println("3. " + producto3.getNombre() + " - $" + producto3.getPrecio());
            
            System.out.print("Seleccione un producto (1, 2 o 3): ");
            int opcionProducto = scanner.nextInt();
            
            System.out.print("Ingrese la cantidad deseada: ");
            int cantidad = scanner.nextInt();
            
            scanner.nextLine();
            
            System.out.print("Ingrese su nombre: ");
            String nombrePersona = scanner.nextLine();
            
            System.out.print("Ingrese la dirección de entrega: ");
            String direccionEntrega = scanner.nextLine();
            
            Producto productoSeleccionado = null;
            switch (opcionProducto) {
                case 1 -> productoSeleccionado = producto1;
                case 2 -> productoSeleccionado = producto2;
                case 3 -> productoSeleccionado = producto3;
                default -> {
                    System.out.println("Selección de producto no válida.");
                    return;
                }
            }
            
            Pedido pedido = new Pedido(productoSeleccionado, cantidad, nombrePersona, direccionEntrega);
            pedido.imprimirPedido();
            
            System.out.println("¡Gracias por su pedido!");
        }
    }
}

