/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author dinos
 * Es la Clase flauta que no tiene atributos
 * Se extiende a la clase "InstrumentoViento"
 */
public class Flauta extends InstrumentoViento {
    /**
     * Es un constructor vacío
     */
    public Flauta() {
    }
    /**
     * metodo sobre escrito debido a que ya existe el metodo 
     * "tipoInstrumento" en la clase superior
     * @return el tipo de instrumento que es la flauta
     */
    @Override
    public String tipoInstrumento() {
        return "Flauta"; // Generated 
        //from nbfs://nbhost/SystemFileSystem
        // /Templates/Classes/Code/OverriddenMethodBody
    }
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }      
}
