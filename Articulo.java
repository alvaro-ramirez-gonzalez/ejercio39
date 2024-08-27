package EmPresaAlmacenaje;

public  class Articulo {
    private String codigo;
    private String descripcion;
    private double alto;
    private double ancho;
    private double precio;
    private boolean asegurado;
    private Cliente cliente;

    public Articulo(String codigo, String descripcion, double alto, double ancho, double precio, boolean asegurado, Cliente cliente) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.alto = alto;
        this.ancho = ancho;
        this.precio = precio;
        this.asegurado = asegurado;
        this.cliente = cliente;
    }
}
