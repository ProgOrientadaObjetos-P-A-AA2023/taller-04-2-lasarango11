/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author Luis
 */
public class Universidad {

    private String nombreUni;
    private String direccion;

    public Universidad() {
        nombreUni = "UTPL";
        direccion = "San Cayetano Alto, C. París, Loja";
    }

    public Universidad(String n, String d) {
        nombreUni = n;
        direccion = d;
    }

    public void establecerNombre(String n) {
        nombreUni = n;
    }

    public String obtenerNombre() {
        return nombreUni;
    }

    public void establecerDireccion(String d) {
        direccion = d;
    }

    public String obtenerDireccion() {
        return direccion;
    }

}
