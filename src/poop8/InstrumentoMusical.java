/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 *
 * @author dinos
 * Es una interface Intrumento musical
 * No tine extencion ni atributos
 */
public interface InstrumentoMusical {
    //contratos obligado a darle funcionalidad
    /**
     * le da la funcionalidad a las 
     * clase posteriores, a los metodos objetivos 
     */
    void tocar();
    void afinar();
    String tipoInstrumento();
    
    
}
