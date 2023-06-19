package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    protected String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPago;

    public PrestamoEducativo(Persona beneficiario, String nivelEstudio, double valorCarrera) {}

    public PrestamoEducativo(String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera, double valorMensualPago) {
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        this.valorMensualPago = valorMensualPago;
    }

    public PrestamoEducativo(Persona beneficiario, double tiempoPrestamo, String ciudadPrestamo, String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        calcularValorMensualPago();
    }
    public void setCiudadPrestamo(String ciudadPrestamo){
        this.ciudadPrestamo=ciudadPrestamo.toUpperCase();
    }
    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public double getValorMensualPago() {
        return valorMensualPago;
    }

    public void calcularValorMensualPago() {
        double valorMensual = this.valorCarrera / super.getTiempoPrestamo();
        double descuento = valorMensual * 0.1;
        this.valorMensualPago = valorMensual - descuento;
    }

    @Override
    public String toString() {
        return super.toString() +"PrestamoEducativo{" +
                "nivelEstudio='" + nivelEstudio + '\'' +
                ", centroEducativo=" + centroEducativo +
                ", valorCarrera=" + valorCarrera +
                ", valorMensualPago=" + valorMensualPago +
                '}';
    }
}
