/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import clases.Documento;
import clases.DocumentoPDF;

/**
 *
 * @author rosales1015
 */
public class DocumentoPDFFactory implements FabricaDocumento{
    
    @Override
    public Documento crearDocumento(){
       return new DocumentoPDF();
    }
    
}
