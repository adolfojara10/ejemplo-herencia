/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

/**
 *
 * @author Adolfo
 */
public class EmpleadoPorHoras extends Empleado{
    private int numeroHorasTrabajadas;
    private double valorHoraTrabajada;

    public EmpleadoPorHoras() {
    }

    public EmpleadoPorHoras(int numeroHorasTrabajadas, double valorHoraTrabajada, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
    }
    
    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }
    
    @Override
    public double calcularSalario(){
        return( valorHoraTrabajada*numeroHorasTrabajadas);
    }

    @Override
    public String toString() {
        return "EmpleadoPorHoras{" + "numeroHorasTrabajadas=" 
                + numeroHorasTrabajadas + ", valorHoraTrabajada=" 
                + valorHoraTrabajada + this.calcularSalario();
    }
    
    
    
}
