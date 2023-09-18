/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import clases.Documento;
import clases.DocumentoTexto;

/**
 *
 * @author rosales1015
 */
public class DocumentoTextoFactory implements FabricaDocumento {
    
    @Override
    public Documento crearDocumento(){
        return new DocumentoTexto();
    }
    
}
