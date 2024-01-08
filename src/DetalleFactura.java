import java.util.Scanner;
public class DetalleFactura {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar y obtener el nombre de la factura
        System.out.print("Ingrese el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();

        // Solicitar y obtener los precios de los productos
        System.out.print("Ingrese el precio del primer producto: ");
        double precioProducto1 = scanner.nextDouble();

        System.out.print("Ingrese el precio del segundo producto: ");
        double precioProducto2 = scanner.nextDouble();

        // Calcular el total bruto y el impuesto
        double totalBruto = precioProducto1 + precioProducto2;
        double impuesto = totalBruto * 0.19;

        // Calcular el monto total neto incluyendo impuesto
        double totalNeto = totalBruto + impuesto;

        // Mostrar el resultado
        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + totalBruto +
                ", con un impuesto de " + impuesto + " y el monto después de impuesto es de " + totalNeto);

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }
}

