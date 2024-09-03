package EmPresaAlmacenaje;

public class Destinatario {
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private Cliente cliente;

    public Destinatario(String codigo, String nombre, String direccion, String telefono, Cliente cliente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cliente = cliente;
    }
}
