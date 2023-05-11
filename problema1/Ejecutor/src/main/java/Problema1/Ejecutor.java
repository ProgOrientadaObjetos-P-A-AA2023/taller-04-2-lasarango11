/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Problema1;

/**
 *
 * @author Luis
 */
public class Ejecutor {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Universidad universidad1 = new Universidad();

        estudiante1.establecerUniversidad(universidad1);
        estudiante1.calcularPromedio();
        System.out.printf("%S\n", estudiante1);

        
        Universidad universidad2 = new Universidad("UNL", "Av. Pio Jaramillo Alvarado, Loja ");
        Estudiante estudiante2 = new Estudiante("Ana Robles", 9.00, 8.55, 10, universidad2);
        estudiante2.calcularPromedio();
        System.out.printf("%S", estudiante2);

    }
}
