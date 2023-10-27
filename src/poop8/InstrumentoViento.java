/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author dinos
 * Es una clase Instrumento de viento sin atributos
 * Se estinede a la clase Objet y se implenta la 
 * interfaz "InstrumentoMusical"
 */
public class InstrumentoViento extends 
        Object implements InstrumentoMusical {
    /**
     * Constructor vacío
     */
    public InstrumentoViento() {
    }
    /**
     * Metodo sobre escrito "TipoInstrumento" 
     * devido que en la interdaz se integro 
     * la codificacion de este mismo
     * @return una cadena "String" que es el 
     * tipo de intrumento musical de viento
     */
    @Override
    public String tipoInstrumento(){
        return "intrumentoViento";
    }
    /**
     * Metodo sobre escrito "tocar" devido 
     * que en la interdaz se integro la 
     * codificacion de este mismo
     */
    @Override
    public void tocar() {
        System.out.println("Tocar instrumento "
                + "de viendo.");
    }
    /**
     * Metodo sobre escrito "afinar" devido que
     * en la interdaz se integro la codificacion
     * de este mismo
     */
    @Override
    public void afinar() {
      System.out.println("Afinar instrumento de "
              + "viento.");  
    }
    /**
     * Se sobreescribe la referencia
     * @return el valor string que se regresa en 
     * el metodo "tipoInstrumentos"
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
