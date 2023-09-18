/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import clases.Documento;
import clases.DocumentoWord;

/**
 *
 * @author rosales1015
 */
public class DocumentoWordFactory implements FabricaDocumento{
    
    @Override
    public Documento crearDocumento(){
        return new DocumentoWord();
    }
    
}