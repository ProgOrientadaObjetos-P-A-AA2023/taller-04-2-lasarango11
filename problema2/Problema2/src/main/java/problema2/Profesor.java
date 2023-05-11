/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author Luis
 */
public class  Profesor{
    private String nombre;
    private String apellido;
    private String cedula;

    private Provincia provincia;

    private double sueldoBasico;
    private double sueldoTotal;

    public Profesor(String nomb, String apel, String id, double sueldoB,
            Provincia prov) {
        nombre = nomb;
        apellido = apel;
        cedula = id;
        provincia = prov;
        sueldoBasico = sueldoB;
    }

    public Profesor() {
        nombre = "Luis";
        apellido = "Sarango";
        cedula = "1722894524";
        sueldoBasico = 450;

    }

    public void establecerNombreProfesor(String n) {
        nombre = n;
    }

    public void establecerApellidoProfesor(String a) {
        apellido = a;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double sueldo) {
        sueldoBasico = sueldo;
    }

    public void establecerProvincia(Provincia pv) {
        provincia = pv;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = (sueldoBasico * 0.2) + sueldoBasico;
    }

    public String obtenerNombreProfesor() {
        return nombre;
    }

    public String obtenerApellidoProfesor() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
     public String toString() {
        String mensaje = String.format("""
                                 Nombre de profesor: %s
                                 Apellido: %s
                                 Sueldo basico $%.2f
                                 Sueldo total es: $%.2f
                                 Numero de cedula: %s
                                 Provincia de nacimiento: %s
                                 Numero de habitantes: %d\n """,
                obtenerNombreProfesor(), obtenerApellidoProfesor(),
                obtenerSueldoBasico(), obtenerSueldoTotal(), obtenerCedula(),
                provincia.obtenerNombreProvincia(),
                provincia.obtenerHabitantes());
        return mensaje;

    }
}

