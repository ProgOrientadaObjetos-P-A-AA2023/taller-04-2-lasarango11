/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author Luis
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Fabricante fabri1 = new Fabricante ();
        Automotor auto1 = new Automotor ();
        
        auto1.establecerFabricante(fabri1);
        auto1.calcularValorMatricula();
        
        System.out.printf("%S\n", auto1);
        
        
        Fabricante fabri2 = new Fabricante ("Chevrolet", "Detroit");
        Automotor auto2 = new Automotor ("1785488876", fabri2 , 2021, 47490);
        
        auto2.establecerFabricante(fabri2);
        auto2.calcularValorMatricula();
            
        System.out.printf("%S\n", auto2);
    }
    
}
