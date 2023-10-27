/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;
/**
 * @author dinos
 * Es una Clase poligono que no tiene atributos
 * Se extiennde a la clase Object
 */
public abstract class Poligono extends Object {
    public Poligono (){
    }
    /**
     * Es un metodo abstract 
     * @return el area de tipo entero
     */
    public abstract int area();
    /**
     * Es un metodo abstact
     * @return el perimieto de tipo entero
     */
    public abstract int perimento();
    /**
     * Se sobreescribe la referencia de los
     * valores que se obtienen
     * @return solo se regresa que existe 
     * los metodos abstractos
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    } 
}
