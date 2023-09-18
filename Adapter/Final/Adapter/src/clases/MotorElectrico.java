/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosales1015
 */
public class MotorElectrico {
    
    private boolean conectado = true;
    
    public MotorElectrico(){
        System.out.println("Creando el motor electrico");
        this.conectado=false; 
    }
    
    public void conectar(){
        System.out.println("Conectando el motor electrico");
        this.conectado=true;
    }
    
    public void activar(){
        if(!this.conectado){
            System.out.println("No se puede activar porque no esta conectado el motor electrico");
        }
        else{
            System.out.println("Esta conectado, activando motor.....c:");
        }
    }
    
    public void moverMasRapido(){
        if(!this.conectado){
            System.out.println("No se puede mover mas rapido  porque no esta conectado el motor electrico");
        }
        else{
            System.out.println("Esta conectado, aumentando  voltaje.....c:");
        }
    }
    
    public void detener(){
        if(!this.conectado){
            System.out.println("No se puede detener motor electrico porque no esta conectado el motor electrico");
        }
        else{
            System.out.println("Deteniendo motor.....c:");
        }
    }
}

