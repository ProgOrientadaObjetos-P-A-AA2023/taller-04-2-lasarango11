/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probema4;

/**
 *
 * @author Luis
 */
public class EntidadBancaria {
    private String nombreBanco;
    private int numeroSucursales;

    public EntidadBancaria() {
        nombreBanco = "Banco del Pichincha";
        numeroSucursales = 20;
    }

    public EntidadBancaria(String nom, int numeros) {
        nombreBanco = nom;
        numeroSucursales = numeros;
    }

    public void establecerNombreBanco(String nb) {
        nombreBanco = nb;
    }

    public void establecerNumeroSucursales(int ns) {
        numeroSucursales = ns;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public int obtenerNumeroSucursales() {
        return numeroSucursales;
    }
}
