/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;

import ec.ups.edu.modelo.Empleado;
import ec.ups.edu.modelo.EmpleadoAsalariado;

/**
 *
 * @author Adolfo
 */
public class Principal {
    
    public static void main (String args[]){
        Empleado emple=new EmpleadoAsalariado(12, 356, 3, "Jose", "Anuel", "0101384386");
    
        System.out.println(emple.toString());
    }
       
}
