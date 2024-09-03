package EmPresaAlmacenaje;

import java.util.Date;

public class Ubicacion {
    private String pasillo;
    private String altura;
    private String hueco;
    private Articulo articulo;
    private int unidades;
    private int unidadesReservadas;
    private Date fechaUbicacion;
    private Date fechaUltimaModificacion;
    private Date fechaCierre;

    public Ubicacion(String pasillo, String altura, String hueco) {
        this.pasillo = pasillo;
        this.altura = altura;
        this.hueco = hueco;
    }

    public void asignarArticulo(Articulo articulo, int unidades) {
        this.articulo = articulo;
        this.unidades = unidades;
        this.fechaUbicacion = new Date();
        this.fechaUltimaModificacion = new Date();
    }

  
}
