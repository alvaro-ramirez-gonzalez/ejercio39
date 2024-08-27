package EmPresaAlmacenaje;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido<LocalDate> {
    private String codigo;
    private Cliente cliente;
    private Destinatario destinatario;
    private Date fecha;
    private List<Articulo> articulos;

    public Pedido(String codigo, Cliente cliente, Destinatario destinatario, Date fecha) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.destinatario = destinatario;
        this.fecha = fecha;
        this.articulos = new ArrayList<>();
    }

   
    public Pedido(String codigoPedido, Cliente cliente2, Destinatario destinatario2, java.time.LocalDate fechaPedido) {
        //TODO Auto-generated constructor stub
    }


    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }
}
