/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package problema3;

/**
 *
 * @author Luis
 */
public class Automotor {

    private String cedula;

    private Fabricante fabricante;

    private int anioFabricacion;

    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String c, Fabricante f, int af, double vv) {
        cedula = c;
        fabricante = f;
        anioFabricacion = af;
        valorVehiculo = vv;
    }

    public Automotor() {
        cedula = "1722897658";
        anioFabricacion = 2018;
        valorVehiculo = 40155;

    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerFabricante(Fabricante f) {
        fabricante = f;
    }

    public void establecerAnio(int af) {
        anioFabricacion = af;
    }

    public void establecerValorVehiculo(double vv) {
        valorVehiculo =vv;
    }

    public void calcularValorMatricula() {
        valorMatricula = valorVehiculo * 0.00002 * (2023 - anioFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public int obtenerAnio() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String m = String.format("""
                                 Cedula de dueño del automotor: %s
                                 Fabricante del vehiculo: %s
                                 Ciudad de origen: %s
                                 Año de fabricacion: %d
                                 Valor del vehiculo: $%.2f
                                 Valor de matricula: $%.2f\n""",
                obtenerCedula(),
                fabricante.obtenerNombreFabricante(),
                fabricante.obtenerCiudadOrigen(),
                obtenerAnio(),
                obtenerValorVehiculo(),
                valorMatricula);
        return m;

    }
}

