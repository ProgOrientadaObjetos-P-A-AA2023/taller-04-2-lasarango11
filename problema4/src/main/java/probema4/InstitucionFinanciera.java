/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probema4;

/**
 *
 * @author Luis
 */
public class InstitucionFinanciera{
    private Cliente cliente;
    private EntidadBancaria banco;
    private double valorCheque;
    private double comision;

    public InstitucionFinanciera() {
        valorCheque = 1500;
    }

    public InstitucionFinanciera(Cliente cli, EntidadBancaria eb, double vc) {
        cliente = cli;
        banco = eb;
        valorCheque =vc;
    }

    public void establecerCliente(Cliente cli) {
        cliente = cli;
    }

    public void establecerBanco(EntidadBancaria eb) {
        banco = eb;
    }

    public void calcularVCheque(double vc) {
        valorCheque = vc;
    }

    public void calcularComision() {
        comision = 0.00003 * valorCheque;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public EntidadBancaria obtenerBanco() {
        return banco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = String.format("""
                               Nombres: %s
                               Apellidos: %s
                               Identificacion o cedula: %s
                               Nombre de su banco: %s
                               Numero de sucursales de su banco: %d
                               Valor del cheque: %.2f
                               Comision: %.2f\n """,
                obtenerCliente().obtenerNombres(),
                obtenerCliente().obtenerApellidos(),
                obtenerCliente().obtenerIdentificacion(),
                obtenerBanco().obtenerNombreBanco(),
                obtenerBanco().obtenerNumeroSucursales(),
                obtenerValorCheque(),
                obtenerComision());
        return mensaje;
    }
}
