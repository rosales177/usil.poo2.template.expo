/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import clases.Documento;
import factory.DocumentoPDFFactory;
import factory.DocumentoTextoFactory;
import factory.DocumentoWordFactory;
import factory.FabricaDocumento;

/**
 *
 * @author rosales1015
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaDocumento factory_p = new DocumentoPDFFactory();
        Documento doc = factory_p.crearDocumento();
        doc.abrir();
        
        FabricaDocumento factory_w = new DocumentoWordFactory();
        Documento doc_w = factory_w.crearDocumento();
        doc_w.abrir();
        
        FabricaDocumento factory_t = new DocumentoTextoFactory();
        Documento doc_t = factory_t.crearDocumento();
        doc_t.abrir();
    }
    
}
