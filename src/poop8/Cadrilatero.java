/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author dinos
 * Es una clase Cuadrilatero con
 * atributos de Alfa, beta, gamma
 * a,b, base, alt
 * Se extiende a la clase Poligono
 */
public class Cadrilatero extends Poligono {
    private int alfa, beta, gamma;
    private int a,b, base, alt;
    /**
     * Constructor vacío
     */
    public Cadrilatero() {
    }
    /**
     * Constructor lleno
     * @param alfa: angulo 1 del Cuadrilatero
     * @param beta: angulo 2 del Cuadrilatero
     * @param gamma: angulo 3 del Cuadrilatero
     * @param a: lado 1 del Cuadrilatero
     * @param b: lado 2 del Cuadrilatero
     * @param base: base del Cuadrilatero
     * @param alt : altura del Cuadrilatero
     */
    public Cadrilatero(int alfa, int beta, 
            int gamma, int a, int b, int base,
            int alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.base = base;
        this.alt = alt;
    }
    /**
     * metodo get
     * @return obtiene el angulo 1 
     * del Cuadrilatero
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * Metodo set: Modifica
     * @param alfa: el valor angulo 1 del Cuadrilatero 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * Metodo get
     * @return obtiene el valo de angulo 2
     * del Cuadrilatero
     */
    public int getBeta() {
        return beta;
    }
    /**
     * metodo set: Modifica
     * @param beta: el valor angulo 2 
     * del Cuadrilatero 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * metodo get
     * @return obtiene el valor del angulo 3
     * del Cuadrilatero
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * metodo set: Modifica
     * @param gamma: el valor del angulo 3 
     * del Cuadrilatero 
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Metodo get
     * @return obtiene el valor del lado 1 
     * del Cuadrilatero
     */
    public int getA() {
        return a;
    }
    /**
     * Metodo set: Modifica
     * @param a: el valor del lado 1 
     * del Cuadrilatero 
     */
    public void setA(int a) {
        this.a = a;
    }
    /**
     * Metodo get
     * @return obtiene el valor del lado 2 
     * del Cuadrilatero
     */
    public int getB() {
        return b;
    }
    /**
     * Metodo set: Modifica
     * @param b; el valor del lado 2 
     * del Cuadrilatero
     */
    public void setB(int b) {
        this.b = b;
    }
    /**
     * Metodo get
     * @return obtiene el valor de la base
     * del Cuadrilatero
     */
    public int getBase() {
        return base;
    }
    /**
     * Metodo set: Modifica
     * @param base el valor de la base 
     * del Cuadrilatero
     */
    public void setBase(int base) {
        this.base = base;
    }
    /**
     * Metodo get
     * @return obtiene el valor de la altura
     * del Cuadrilatero
     */
    public int getAlt() {
        return alt;
    }
    /**
     * Metodo set: Modifica
     * @param alt el valor de la altura
     * del Cuadrilatero
     */
    public void setAlt(int alt) {
        this.alt = alt;
    }
    /**
     * metodo sobre escrito debido a que 
     * ya existe el metodo 
     * "area" en la clase superior
     * @return un valor entero que corresponde
     * al valor del area del cuadrilatero
     */
    @Override
    public int area(){
        //se agrega int parea truncar el valor y 
        //solo ocupar la parte entera
        return (int)((base*alt));
    }
    /**
     * metodo sobre escrito debido a que 
     * ya existe el metodo 
     * "perimetro" en la clase superior
     * @return un valor entero que corresponde 
     * al valor del perimetro
     */
    @Override
    public int perimento(){
        return(int) 2*(a+b);
    }
    @Override
    public String toString() {
        return super.toString() +  
            "Cadrilatero{" + "alfa=" + alfa + ", "
            + "beta=" + beta + ", gamma=" + gamma + ""
            + ", a=" + a + ", b=" + b + ", base=" + base
            + ", alt=" + alt + '}';
    }
    
}
