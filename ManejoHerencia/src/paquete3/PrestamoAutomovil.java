package paquete3;

import paquete1.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo {
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualPago;

    public PrestamoAutomovil(String tipoAutomovil, String marcaAutomovil, Persona garante, double valorAutomovil) {
    }

    public PrestamoAutomovil(String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil, double valorMensualPago) {
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        this.valorMensualPago = valorMensualPago;
    }

    public PrestamoAutomovil(Persona beneficiario, double tiempoPrestamo, String ciudadPrestamo, String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(beneficiario, tiempoPrestamo, ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        this.calcularValorMensualPago();
    }
    public void setCiudadPrestamo(String ciudadPrestamo){
        this.ciudadPrestamo=ciudadPrestamo.toLowerCase();
    }
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public double getValorMensualPago() {
        return valorMensualPago;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }
    public void calcularValorMensualPago() {
        this.valorMensualPago = this.valorAutomovil / super.getTiempoPrestamo();
    }

    @Override
    public String toString() {
        return super.toString() +"PrestamoAutomovil{" +
                "tipoAutomovil='" + tipoAutomovil + '\'' +
                ", marcaAutomovil='" + marcaAutomovil + '\'' +
                ", garante1=" + garante1 +
                ", valorAutomovil=" + valorAutomovil +
                ", valorMensualPago=" + valorMensualPago +
                '}';
    }

}
