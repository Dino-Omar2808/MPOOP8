/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author dinos
 * Es una clase Triangulo con 
 * atrubutos de alfa, beta, gamma, a, b, 
 * c, base, Alt
 * Se extiende a la Clase Poligono
 */
public class Triangulo extends Poligono{
    private int alfa, beta, gamma;
    private float a,b,c, base, alt;
    /**
     * Constructor  vacío
     */
    public Triangulo() {
    }
    /**
     * Constructor  lleno
     * @param alfa: angulo 1 del triangulo
     * @param beta: angulo 2 del triangulo
     * @param gamma: angulo 3 del triangulo
     * @param a: lado 1 del triangulo 
     * @param b: lado 2 del triangulo
     * @param c: lado 3 del triangulo
     * @param base: base del triangulo
     * @param alt: El alto del triangulo 
     */
    public Triangulo(int alfa, int beta, int 
            gamma, float a, float b, float c,
            float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }
    /**
     * metodo get
     * @return obtiene el valor del angulo 1 
     * del triangulo
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * metodo set: Modifica
     * @param alfa: el valor agulo 1 del triangulo
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }
    /**
     * metodo get
     * @return obtiene el valor del angulo 2 del 
     * triangulo 
     */
    public int getBeta() {
        return beta;
    }
    /**
     * metodo set: Modifica
     * @param beta: el valor del angulo 2 del triangulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * metodo get
     * @return obtiene el valor del angulo 3 del triangulo 
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * metodo set: Modifica 
     * @param gamma: el valor del angulo 3 del triangulo
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * Metodo get
     * @return obtiene  el lado A del triangulo
     */
    public float getA() {
        return a;
    }
    /**
     * Metodo set: Modifica
     * @param a: el lado A del triangulo
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Metodo get
     * @return obtiene el lado B del triangulo
     */
    public float getB() {
        return b;
    }
    /**
     * Metodo set: Modifica
     * @param b: el lado B del triangulo
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Metodo get
     * @return obtiene el lado C del triangulo
     */
    public float getC() {
        return c;
    }
    /**
     * Metodo set: Modifica
     * @param c: el ladon C del del triangulo
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * Metodo get
     * @return obtien el valor la base del triangulo
     */
    public float getBase() {
        return base;
    }
    /**
     * Metodo set: Modifica
     * @param base el valor de la base del triangulo  
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Metodo get
     * @return obtine el valor de la altuta del triangulo
     */
    public float getAlt() {
        return alt;
    }
    /**
     * Metodo set: Modificar
     * @param alt: el valor de la altura del triangulo 
     */
    public void setAlt(float alt) {
        this.alt = alt;
    }
    /**
     * metodo sobre escrito debido a que ya existe el 
     * metodo "area" en la clase superior
     * @return un valor entero que corresponde al valor del area
     */
    @Override
    public int area(){
        //se agrega int parea truncar 
        //el valor y solo ocupar la parte entera
        return (int)((base*alt)/2);
    }
    /**
     *metodo sobre escrito debido a que 
     * ya existe el metodo 
     * "perimetro" en la clase superior
     * @return un valor entero que corresponde 
     * al valor del perimetro
     */
    @Override
    public int perimento(){
        return(int) (a+b+c);
    }
    /**
     * Se sobre escribe la referencia
     * @return los valores de los variables de la clase:
     * alfa + beta + gamma + a + b + c + base + altura
     */
    @Override
    public String toString() {
        return super.toString()+ "Triangulo{" + "alfa=" + alfa +
                ", beta=" + beta + ", gamma=" + gamma + ", a=" + a +
                ", b=" + b + ", c=" + c + ", base=" + base + ", alt="
                + alt + '}';
    }   
}
