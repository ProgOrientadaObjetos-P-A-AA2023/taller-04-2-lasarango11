/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author Luis
 */
public class Estudiante {
    // calificación de materia 1, calificación de materia 2, calificación de materia 3, 
    // promedio de calificaciones y universidad (este atributo se considera como un objeto de tipo Universidad, 
    // que tiene atributos como: nombre de universidad y dirección)

    private String nombre;
    private double materia1, materia2, materia3, promedio;
    private Universidad universidad;

    public Estudiante() {
        nombre = "Luis Sarango";
        materia1 = 8.75;
        materia2 = 7.00;
        materia3 = 6.75;
        promedio = 7.5;

    }

    public Estudiante(String n, double m1, double m2, double m3, Universidad u) {
        nombre = n;
        materia1 = m1;
        materia2 = m2;
        materia3 = m3;
        universidad = u;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerMateria1(double m1) {
        materia1 = m1;
    }

    public void establecerMateria2(double m2) {
        materia2 = m2;
    }

    public void establecerMateria3(double m3) {
        materia3 = m3;
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public void establecerUniversidad(Universidad u) {
        universidad = u;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerMateria1() {
        return materia1;
    }

    public double obtenerMateria2() {
        return materia2;
    }

    public double obtenerMateria3() {
        return materia3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       
                                       Estudiante/a: %s
                                       Calificacion 1: %.2f
                                       Calificacion 2: %.2f
                                       Calificacion 3: %.2f
                                       Promedio Total: %.2f
                                       Universidad: %s
                                       Direccion: %s
                                       """,
                nombre,
                materia1,
                materia2,
                materia3,
                promedio,
                obtenerUniversidad().obtenerNombre(),
                obtenerUniversidad().obtenerDireccion());
        return mensaje;
    }
}
