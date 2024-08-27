package EmPresaAlmacenaje;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

public class empresaalmacenaje {

    public static void main(String[] args) {
        // Crear cliente
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String nifCliente = JOptionPane.showInputDialog("Ingrese el NIF del cliente:");
        String direccionCliente = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
        String ciudadCliente = JOptionPane.showInputDialog("Ingrese la ciudad del cliente:");
        String telefonoCliente = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");
        String emailCliente = JOptionPane.showInputDialog("Ingrese el email del cliente:");
        String clasificacionCliente = JOptionPane.showInputDialog("Ingrese la clasificación del cliente (Muy bueno, Bueno, Regular):");

        Cliente cliente = new Cliente(nombreCliente, nifCliente, direccionCliente, ciudadCliente, telefonoCliente, emailCliente, clasificacionCliente);

        // Crear proveedor
        String nombreProveedor = JOptionPane.showInputDialog("Ingrese el nombre del proveedor:");
        String nifProveedor = JOptionPane.showInputDialog("Ingrese el NIF del proveedor:");
        String direccionProveedor = JOptionPane.showInputDialog("Ingrese la dirección del proveedor:");
        String ciudadProveedor = JOptionPane.showInputDialog("Ingrese la ciudad del proveedor:");
        String telefonoProveedor = JOptionPane.showInputDialog("Ingrese el teléfono del proveedor:");
        String emailProveedor = JOptionPane.showInputDialog("Ingrese el email del proveedor:");

        Proveedor proveedor = new Proveedor(nombreProveedor, nifProveedor, direccionProveedor, ciudadProveedor, telefonoProveedor, emailProveedor);
        cliente.agregarProveedor(proveedor);

        // Crear transportista
        String nombreTransportista = JOptionPane.showInputDialog("Ingrese el nombre del transportista:");
        String nifTransportista = JOptionPane.showInputDialog("Ingrese el NIF del transportista:");
        String direccionTransportista = JOptionPane.showInputDialog("Ingrese la dirección del transportista:");
        String ciudadTransportista = JOptionPane.showInputDialog("Ingrese la ciudad del transportista:");
        String telefonoTransportista = JOptionPane.showInputDialog("Ingrese el teléfono del transportista:");
        String emailTransportista = JOptionPane.showInputDialog("Ingrese el email del transportista:");

        Transportista transportista = new Transportista(nombreTransportista, nifTransportista, direccionTransportista, ciudadTransportista, telefonoTransportista, emailTransportista);
        cliente.agregarTransportista(transportista);

        // Crear artículo
        String codigoArticulo = JOptionPane.showInputDialog("Ingrese el código del artículo:");
        String descripcionArticulo = JOptionPane.showInputDialog("Ingrese la descripción del artículo:");
        double altoArticulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el alto del artículo (en metros):"));
        double anchoArticulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ancho del artículo (en metros):"));
        double precioArticulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
        boolean aseguradoArticulo = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Está asegurado el artículo? (true/false):"));

        Articulo articulo = new Articulo(codigoArticulo, descripcionArticulo, altoArticulo, anchoArticulo, precioArticulo, aseguradoArticulo, cliente);
        cliente.agregarArticulo(articulo);

        // Crear destinatario
        String codigoDestinatario = JOptionPane.showInputDialog("Ingrese el código del destinatario:");
        String nombreDestinatario = JOptionPane.showInputDialog("Ingrese el nombre del destinatario:");
        String direccionDestinatario = JOptionPane.showInputDialog("Ingrese la dirección del destinatario:");
        String telefonoDestinatario = JOptionPane.showInputDialog("Ingrese el teléfono del destinatario:");

        Destinatario destinatario = new Destinatario(codigoDestinatario, nombreDestinatario, direccionDestinatario, telefonoDestinatario, cliente);
        cliente.agregarDestinatario(destinatario);

        // Crear entrada de mercancía
        String codigoEntrada = JOptionPane.showInputDialog("Ingrese el código de la entrada de mercancía:");
        String camion = JOptionPane.showInputDialog("Ingrese el camión de transporte:");
        String fechaEntradaStr = JOptionPane.showInputDialog("Ingrese la fecha de la entrada de mercancía (yyyy-MM-dd):");
        LocalDate fechaEntrada = parseDate(fechaEntradaStr);

        if (fechaEntrada != null) {
            EntradaMercancia entrada = new EntradaMercancia(codigoEntrada, cliente, transportista, camion, fechaEntrada);
            entrada.agregarArticulo(articulo);
            cliente.agregarEntrada(entrada);
        }

        // Crear ubicación en el almacén
        String pasillo = JOptionPane.showInputDialog("Ingrese el pasillo de la ubicación:");
        String altura = JOptionPane.showInputDialog("Ingrese la altura de la ubicación:");
        String hueco = JOptionPane.showInputDialog("Ingrese el hueco de la ubicación:");

        Ubicacion ubicacion = new Ubicacion(pasillo, altura, hueco);
        ubicacion.asignarArticulo(articulo, 100);
        Almacen almacen = new Almacen("Almacén Principal");
        almacen.agregarUbicacion(ubicacion);

        // Crear pedido
        String codigoPedido = JOptionPane.showInputDialog("Ingrese el código del pedido:");
        String fechaPedidoStr = JOptionPane.showInputDialog("Ingrese la fecha del pedido (yyyy-MM-dd):");
        LocalDate fechaPedido = parseDate(fechaPedidoStr);

        if (fechaPedido != null) {
            Pedido pedido = new Pedido(codigoPedido, cliente, destinatario, fechaPedido);
            pedido.agregarArticulo(articulo);
            cliente.agregarPedido(pedido);
        }

        // Registrar el movimiento en el historial
        HistorialUbicaciones historial = new HistorialUbicaciones();
        historial.agregarUbicacion(ubicacion);

        // Mostrar información básica
        JOptionPane.showMessageDialog(null, "Cliente: " + cliente.getNombreSocial() +
                "\nProveedores: " + cliente.getProveedores().size() +
                "\nTransportistas: " + cliente.getTransportistas().size() +
                "\nArtículos: " + cliente.getArticulos().size() +
                "\nEntradas de Mercancías: " + cliente.getEntradas().size() +
                "\nPedidos: " + cliente.getPedidos().size() +
                "\nUbicaciones en Almacén: " + almacen.getUbicaciones().size() +
                "\nHistorial de Ubicaciones: " + historial.getHistorial().size());
    }

    private static LocalDate parseDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = null;
        try {
            date = LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha inválida. Use el formato yyyy-MM-dd.");
        }
        return date;
    }
}
