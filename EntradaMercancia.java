package EmPresaAlmacenaje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EntradaMercancia {
    private String codigo;
    private Cliente cliente;
    private Transportista transportista;
    private String camion;
    private Date fecha;
    private List<Articulo> articulos;

    public EntradaMercancia(String codigo, Cliente cliente, Transportista transportista, String camion, Date fecha) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.transportista = transportista;
        this.camion = camion;
        this.fecha = fecha;
        this.articulos = new ArrayList<>();
    }

    EntradaMercancia(String codigoEntrada, Cliente cliente, Transportista transportista, String camion, LocalDate fechaEntrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }
}