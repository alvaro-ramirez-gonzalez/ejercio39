package EmPresaAlmacenaje;

public class Proveedor {
    private String nombreSocial;
    private String nif;
    private String direccion;
    private String ciudad;
    private String telefono;
    private String email;

    public Proveedor(String nombreSocial, String nif, String direccion, String ciudad, String telefono, String email) {
        this.nombreSocial = nombreSocial;
        this.nif = nif;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.email = email;
    }

    public String toString() {
        return "Proveedor{" +
                "nombreSocial='" + nombreSocial + '\'' +
                ", nif='" + nif + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
