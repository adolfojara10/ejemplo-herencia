/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.modelo;

import java.util.Date;

/**
 *
 * @author Adolfo
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private Date fechaNacimiento;
    private String telefono;
    private String cargo;
    private String direccion;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, String apellido, String cedula){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double calcularSalario(){
        return 0;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido 
                + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento 
                + ", telefono=" + telefono + ", cargo=" + cargo + ", direccion=" 
                + direccion + this.calcularSalario();
    }
    
    
    
}
