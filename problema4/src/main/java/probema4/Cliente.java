/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probema4;

/**
 *
 * @author Luis
 */
public class Cliente{
    private String nombres;
    private String apellidos;
    private String identificacion;

    public Cliente() {
        nombres = "Carlos Enrrique";
        apellidos = "Sarango Figeroa";
        identificacion = "1134527845";
    }

    public Cliente(String nom, String apel, String id) {
        nombres = nom;
        apellidos = apel;
        identificacion = id;
    }

    public void establecerNombres(String nom) {
        nombres = nom;
    }

    public void establecerApellidos(String apel) {
        apellidos = apel;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

}
