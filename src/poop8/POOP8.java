/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author dinos
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // no se pued ecrear un objeto pologono por que es abstracto
        Poligono poligono;
        //System.out.println(poligono);
        Triangulo triangulo= new Triangulo();
        triangulo.setBase(5);
        triangulo.setAlt(3);
        System.out.println(triangulo);
        System.out.println(triangulo.area());
        
        Cadrilatero cuadri= new Cadrilatero();
        cuadri.setBase(4);
        cuadri.setAlt(6);
        System.out.println(cuadri);
        System.out.println(cuadri.area());
        
        poligono=new Triangulo();
        System.out.println(poligono);
        //System.out.println(poligono.getBase());
        
        //metodo poligono
        getPoligono(poligono);
        poligono= new Cadrilatero();
        getPoligono(poligono);
         
        Flauta flauta= new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        System.out.println(Math.PI);
        
        System.out.println(Meses.NOMBRE_MESES[Meses.UNO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.TRES]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CUATRO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.CINCO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SEIS]);
        System.out.println(Meses.NOMBRE_MESES[Meses.SIETE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.OCHO]);
        System.out.println(Meses.NOMBRE_MESES[Meses.NUEVE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DIEZ]);
        System.out.println(Meses.NOMBRE_MESES[Meses.ONCE]);
        System.out.println(Meses.NOMBRE_MESES[Meses.DOCE]);
    }

    private static void getPoligono(Poligono poligono) {
        if(poligono instanceof Triangulo){
            System.out.println("Es un triangulo");
        }
        else if(poligono instanceof Cadrilatero){
            System.out.println("Es un cuadrilatero");
        }
        else {
            System.out.println("Es un poligono");
        }
        
        
       
    }
    //TAREA 
//    //Terminar diagraMA DE DRAW.IO
    //terminar la interfaz 
            //documentar y crear gtihub
}
