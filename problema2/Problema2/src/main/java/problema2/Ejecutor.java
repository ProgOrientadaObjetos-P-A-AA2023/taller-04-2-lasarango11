/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package problema2;

/**
 *
 * @author Luis
 */
public class Ejecutor {

    public static void main(String[] args) {

        Profesor pro1 = new Profesor();
        Provincia pv1 = new Provincia();

        pro1.establecerProvincia(pv1);
        pro1.calcularSueldoTotal();

        System.out.printf("%S\n", pro1);

        Provincia pv2 = new Provincia("Loja", 2000);
        Profesor pro2 = new Profesor("Luis", "Leon", "11034857424", 450, pv2);

        pro2.calcularSueldoTotal();
        pro2.establecerProvincia(pv2);

        System.out.printf("%S\n", pro2);
    }
}