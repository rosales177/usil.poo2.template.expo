/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import clases.Motor;
import clases.MotorComun;
import clases.MotorEconomico;

/**
 *
 * @author rosales1015
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Motor motor_c = new MotorComun();
        Motor motor_e = new MotorEconomico();
        
        motor_c.encender();
        motor_c.acelerar();
        motor_c.apagar();
        
        motor_e.encender();
        motor_e.acelerar();
        motor_e.apagar();
        
    }
    
}
