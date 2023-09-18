/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosales1015
 */
public class MotorComun extends Motor {
    
    public MotorComun(){
        super();
        System.out.println("Creando el motor comun");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el motor comun");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el motor comun");

    }

    @Override
    public void apagar() {
        System.out.println("Apagando el motor comun");

    }
    
    
}