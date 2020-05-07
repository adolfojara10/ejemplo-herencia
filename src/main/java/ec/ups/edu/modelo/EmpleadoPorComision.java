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
public class EmpleadoPorComision extends Empleado {
    private double totalDeVentas;
    private double salario;
    private double porcentajeComision;

    public EmpleadoPorComision(){
        
    }

    public EmpleadoPorComision(double totalDeVentas, double salario, double porcentajeComision, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.totalDeVentas = totalDeVentas;
        this.salario = salario;
        this.porcentajeComision = porcentajeComision;
    }
    
    
    public double getTotalDeVentas() {
        return totalDeVentas;
    }

    public void setTotalDeVentas(double totalDeVentas) {
        this.totalDeVentas = totalDeVentas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    @Override
    public double calcularSalario(){
        double valorVentas=0;
        double valorComision=0;
        
        if(totalDeVentas>20 && totalDeVentas<50){
            valorVentas=100;
            valorComision=2.5;
        } else {
            valorVentas=150;
            valorComision=3.75;
        }
        
        return(salario + valorVentas + (valorVentas*valorComision));
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" + "totalDeVentas=" + totalDeVentas 
                + ", salario=" + salario + ", porcentajeComision=" 
                + porcentajeComision + this.calcularSalario();
    }
    
    
    
}
