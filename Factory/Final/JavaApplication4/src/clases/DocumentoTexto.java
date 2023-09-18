/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Interface.GuardarDocumento;

/**
 *
 * @author rosales1015
 */
public class DocumentoTexto extends Documento implements GuardarDocumento{
    
    @Override
    public void abrir(){
        System.out.println("Abriendo el documento TEXTO");
    }
    
    @Override
    public void guardar(){
        System.out.println("Guardando el documento");
    }
    
}
