/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import clases.Motor;
import clases.MotorComun;
import clases.MotorEconomico;
import clases.MotorElectricoAdapter;

/**
 *
 * @author rosales1015
 */
public class Adapter {
    Motor motor;
    public void usarMotorComun(){
        motor=new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
    public void usarMotorEconomico(){
        motor=new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();   
    }
    public void usarMotorElectrico(){
        motor=new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();   
    }
}
