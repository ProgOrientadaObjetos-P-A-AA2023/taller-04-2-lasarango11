/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author Luis
 */
public class Provincia {
     private String nombreProvincia;
     private int habitantes;

    public Provincia() {
        nombreProvincia = "Loja";
        habitantes = 2000;
    }

    public Provincia(String nom, int h) {
        nombreProvincia = nom;
        habitantes = h;
    }

    public void establecerNombreProvincia(String nom) {
        nombreProvincia = nom;
    }

    public void establecerHabitantes(int h) {
        habitantes = h;
    }

    public String obtenerNombreProvincia() {
        return nombreProvincia;
    }

    public int obtenerHabitantes() {
        return habitantes;
    }
    
}
