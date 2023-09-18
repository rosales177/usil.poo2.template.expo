/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author rosales1015
 */
public class MotorElectricoAdapter extends Motor {
    
    private final MotorElectrico motorElectrico;
    
    public MotorElectricoAdapter(){
        super();
        this.motorElectrico=new MotorElectrico();
        System.out.println("Creaando Motor Adapter");
    }
 
    @Override
    public void encender() {
        System.out.println("Encende motor electrico adapter");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar motor electrico adapter");
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagar motor electrico adapter");
        this.motorElectrico.detener();
    }
    
}
