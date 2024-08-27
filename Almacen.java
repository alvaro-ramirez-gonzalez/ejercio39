package EmPresaAlmacenaje;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private String nombre;
    private List<Ubicacion> ubicaciones;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.ubicaciones = new ArrayList<>(); 
    }

    public void agregarUbicacion(Ubicacion ubicacion) {
        ubicaciones.add(ubicacion);
    }

    public List<Ubicacion> getUbicaciones() {
        return ubicaciones;
    }
}
    