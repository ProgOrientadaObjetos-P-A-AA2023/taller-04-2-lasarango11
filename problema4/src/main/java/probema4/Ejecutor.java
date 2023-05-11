/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package probema4;

/**
 *
 * @author Luis
 */
public class Ejecutor {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        EntidadBancaria banco1 = new EntidadBancaria();
        InstitucionFinanciera insti1 = new InstitucionFinanciera();
        
        
        insti1.establecerCliente(cliente1);
        insti1.establecerBanco(banco1);
        insti1.calcularComision();
        
        System.out.printf("%S\n", insti1);

        
        Cliente cliente2 = new Cliente("Luis Alonso", "Sarango Romero",
                "1722897589");
        EntidadBancaria banco2 = new EntidadBancaria("Banco de Loja", 3);
        InstitucionFinanciera insti2 = new InstitucionFinanciera(cliente2,
                                                            banco2, 1200);
        
        insti2.establecerCliente(cliente2);
        insti2.establecerBanco(banco2);
        insti2.calcularComision();
        
        System.out.printf("%S\n", insti2);    }
}
