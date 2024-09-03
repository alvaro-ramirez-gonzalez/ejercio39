package EmPresaAlmacenaje;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombreSocial;
    private String nif;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String email;
    private String clasificacion;
    private List<Proveedor> proveedores;
    private List<Transportista> transportistas;
    private List<Articulo> articulos;
    private List<EntradaMercancia> entradas;
    private List<Pedido> pedidos;
    private List<Destinatario> destinatarios;

    public Cliente(String nombreSocial, String nif, String direccion, String ciudad, String telefono, String email, String clasificacion) {
        this.nombreSocial = nombreSocial;
        this.nif = nif;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.email = email;
        this.clasificacion = clasificacion;
        this.proveedores = new ArrayList<>();
        this.transportistas = new ArrayList<>();
        this.articulos = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.destinatarios = new ArrayList<>();
    }

    public String getNombreSocial() {
        return nombreSocial;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public List<Transportista> getTransportistas() {
        return transportistas;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public List<EntradaMercancia> getEntradas() {
        return entradas;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void agregarProveedor(Proveedor proveedor) {
        if (proveedor != null) {
            proveedores.add(proveedor);
        }
    }

    public void agregarTransportista(Transportista transportista) {
        if (transportista != null) {
            transportistas.add(transportista);
        }
    }

    public void agregarArticulo(Articulo articulo) {
        if (articulo != null) {
            articulos.add(articulo);
        }
    }

    public void agregarEntrada(EntradaMercancia entrada) {
        if (entrada != null) {
            entradas.add(entrada);
        }
    }

    public void agregarPedido(Pedido pedido) {
        if (pedido != null) {
            pedidos.add(pedido);
        }
    }

    public void agregarDestinatario(Destinatario destinatario) {
        if (destinatario != null) {
            destinatarios.add(destinatario);
        }
    }
    public String toString() {
        return "Cliente{" +
                "nombreSocial='" + nombreSocial + '\'' +
                ", nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                '}';
    }
}
