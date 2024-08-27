package EmPresaAlmacenaje;

import java.util.ArrayList;
import java.util.List;

public class HistorialUbicaciones {
    private List<Ubicacion> historial;

    public HistorialUbicaciones() {
        this.historial = new ArrayList<>();
    }

    public void agregarUbicacion(Ubicacion ubicacion) {
        historial.add(ubicacion);
    }

    public List<Ubicacion> getHistorial() {
        return historial;
    }
}
