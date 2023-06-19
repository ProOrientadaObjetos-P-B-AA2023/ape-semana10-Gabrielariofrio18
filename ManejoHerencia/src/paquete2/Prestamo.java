package paquete2;

import paquete1.Persona;

public class Prestamo {

    protected Persona beneficiario;
    protected double tiempoPrestamo;
    protected String ciudadPrestamo;
    public Prestamo(){}
    public Prestamo(Persona beneficiario, double tiempoPrestamo, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void setTiempoPrestamo(double tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "beneficiario=" + beneficiario +
                ", tiempoPrestamo=" + tiempoPrestamo +
                ", ciudadPrestamo='" + ciudadPrestamo + '\'' +
                '}';
    }
}
