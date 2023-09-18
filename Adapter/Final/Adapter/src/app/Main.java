/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import adapter.Adapter;
/**
 *
 * @author rosales1015
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adapter motors = new Adapter();
        motors.usarMotorComun();
        motors.usarMotorEconomico();
        motors.usarMotorElectrico();
       
    }
    
}
    