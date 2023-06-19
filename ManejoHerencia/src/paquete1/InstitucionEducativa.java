package paquete1;

public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    public InstitucionEducativa() {
    }

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    @Override
    public String toString() {
        return "InstitucionEducativa{" +
                "nombre='" + nombre + '\'' +
                ", siglas='" + siglas + '\'' +
                '}';
    }
}
