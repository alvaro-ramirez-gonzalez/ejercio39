package EmPresaAlmacenaje;

public class Transportista {
    private String nombreSocial;
    private String nif;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String email;

    public Transportista(String nombreSocial, String nif, String direccion, String ciudad, String telefono, String email) {
        this.nombreSocial = nombreSocial;
        this.nif = nif;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.email = email;
    }
}
