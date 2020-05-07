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
public class EmpleadoAsalariado extends Empleado {
    
    private int añosAntiguedad;
    private double salario;
    private int cargasFamiliares;
    
    public EmpleadoAsalariado(){
        
    }

    public EmpleadoAsalariado(int añosAntiguedad, double salario, int cargasFamiliares) {
        this.añosAntiguedad = añosAntiguedad;
        this.salario = salario;
        this.cargasFamiliares = cargasFamiliares;
    }

    public EmpleadoAsalariado(int añosAntiguedad, double salario, int cargasFamiliares, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.añosAntiguedad = añosAntiguedad;
        this.salario = salario;
        this.cargasFamiliares = cargasFamiliares;
    }
    
    
    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargasFamiliares() {
        return cargasFamiliares;
    }

    public void setCargasFamiliares(int cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }
    

    @Override
    public double calcularSalario(){
        double valorAntiguedad=0;
        int valorCargas=0;
        
        if(añosAntiguedad>=2 && añosAntiguedad<=5){
            valorAntiguedad=30;
        } else {
            valorAntiguedad=50;
        }
        
        if(cargasFamiliares==1){
            valorCargas=30;
        } else {
            valorCargas=50;
        }
        return(salario + valorAntiguedad + valorCargas);
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoAsalariado{" + "a\u00f1osAntiguedad="
                + añosAntiguedad + ", salario=" + salario 
                + ", cargasFamiliares=" + cargasFamiliares 
                + this.calcularSalario();
    }
    
    
}
