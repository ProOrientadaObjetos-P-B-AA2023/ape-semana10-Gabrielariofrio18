package paquete1;

import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PrestamoAutomovil> prestamos1 = new ArrayList<>();
        List<PrestamoEducativo> prestamos2 = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("-----------------------------------");
            System.out.println("| Ingrese Prestamo Automovil  [1] |");
            System.out.println("| Ingrese Prestamo Educativo  [2] |");
            System.out.println("-----------------------------------");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    PrestamoAutomovil prestamoAutomovil = crearPrestamoAutomovil();
                    prestamos1.add(prestamoAutomovil);
                    break;
                case 2:
                    PrestamoEducativo prestamoEducativo = crearPrestamoEducativo();
                    prestamos2.add(prestamoEducativo);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println("¿Desea ingresar otro préstamo?");
            System.out.println("Seleccione la tecla (S) si desea ingresar otro prestamo");
            System.out.println("Seleccione la tecla (N) para presentar");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.println("Lista de préstamos generados:");
        System.out.println("-------------------------------------");
        for (PrestamoAutomovil prestamo : prestamos1) {
            System.out.println("| Nombre de Beneficiario: " + prestamo.getBeneficiario().getNombre());
            System.out.println("| Apellido de Beneficiario: " + prestamo.getBeneficiario().getApellido());
            System.out.println("| Usuario de Beneficiario: " + prestamo.getBeneficiario().getUsername());
            System.out.println("| Tiempo de préstamo en meses: " + prestamo.getTiempoPrestamo());
            System.out.println("| Ciudad de préstamo: " + prestamo.getCiudadPrestamo());
            System.out.println("| Tipo de automóvil: " + prestamo.getTipoAutomovil());
            System.out.println("| Marca de automóvil: " + prestamo.getMarcaAutomovil());
            System.out.println("| Valor del automóvil: " + prestamo.getValorAutomovil());
            System.out.println("| Nombre de Garante: " + prestamo.getGarante1().getNombre());
            System.out.println("| Apellido de Garante: " + prestamo.getGarante1().getApellido());
            System.out.println("| Usuario de Garante: " + prestamo.getGarante1().getUsername());
            System.out.println("| Valor mensual de pago: " + prestamo.getValorMensualPago());
        }
        System.out.println("----------------------------------");
        for (PrestamoEducativo prestamo : prestamos2) {
            System.out.println("| Nombre de Beneficiario: " + prestamo.getBeneficiario().getNombre());
            System.out.println("| Apellido de Beneficiario: " + prestamo.getBeneficiario().getApellido());
            System.out.println("| Usuario de Beneficiario: " + prestamo.getBeneficiario().getUsername());
            System.out.println("| Tiempo de préstamo en meses: " + prestamo.getTiempoPrestamo());
            System.out.println("| Ciudad de préstamo: " + prestamo.getCiudadPrestamo());
            System.out.println("| Nivel de estudio: " + prestamo.getNivelEstudio());
            System.out.println("| Nombre de Centro educativo: " + prestamo.getCentroEducativo().getNombre());
            System.out.println("| siglas de Centro educativo: " + prestamo.getCentroEducativo().getSiglas());
            System.out.println("| Valor de la carrera: " + prestamo.getValorCarrera());
            System.out.println("| Valor mensual de pago: " + prestamo.getValorMensualPago());
            System.out.println("-----------------------------------");
        }

    }
    private static Prestamo crearPrestamo(){
        Scanner entrada = new Scanner(System.in);
        Persona beneficiario = crearPersona();
        System.out.println("Ingrese tiempo de Prestamo en meses");
        double tiempoPrestamo = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese ciudad de Prestamo");
        String ciudadPrestamo = entrada.nextLine();
        return new Prestamo(beneficiario, tiempoPrestamo,ciudadPrestamo);
    }

    public static PrestamoAutomovil crearPrestamoAutomovil() {
        Prestamo prestamo = crearPrestamo();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los datos del préstamo de automóvil:");
        System.out.println("Tipo de automóvil:");
        String tipoAutomovil = entrada.next();
        System.out.println("Marca de automóvil:");
        String marcaAutomovil = entrada.next();
        System.out.println("Valor del automóvil:");
        double valorAutomovil = entrada.nextDouble();
        System.out.println("Ingrese los datos del garante:");
        Persona garante = crearPersona();

        return new PrestamoAutomovil(prestamo.getBeneficiario(),
                prestamo.getTiempoPrestamo(),
                prestamo.getCiudadPrestamo(),
                tipoAutomovil,
                marcaAutomovil,
                garante,
                valorAutomovil);
    }

    private static PrestamoEducativo crearPrestamoEducativo() {
        Prestamo prestamo = crearPrestamo();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los datos del préstamo educativo:");
        System.out.println("Nivel de estudio:");
        String nivelEstudio = entrada.next();
        System.out.println("Valor de la carrera:");
        double valorCarrera = entrada.nextDouble();
        System.out.println("Ingrese los datos del centroEducativo:");
        InstitucionEducativa centroEducativo = crearCentroEducativo();

        return new PrestamoEducativo(prestamo.getBeneficiario(),
                prestamo.getTiempoPrestamo(),
                prestamo.getCiudadPrestamo(),
                nivelEstudio,
                centroEducativo,
                valorCarrera);
    }

    private static Persona crearPersona() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = entrada.next();
        System.out.println("Apellido:");
        String apellido = entrada.next();
        entrada.nextLine();
        System.out.println("Usuario:");
        String usuario = entrada.nextLine();
        return new Persona(nombre, apellido, usuario);
    }
    private static InstitucionEducativa crearCentroEducativo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre Institucion Educativa");
        String nombre2 = entrada.nextLine();
        System.out.println("Ingrese siglas");
        String siglas= entrada.nextLine();
        return new InstitucionEducativa(nombre2,siglas);
    }
}