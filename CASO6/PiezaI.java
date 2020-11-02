
package Main;

//Implementa interfaz IPieza
//Clase que tiene los metodos aplicados de la pieza I
public class PiezaI implements IPieza{

    //Atributo que contiene el color de la pieza
    String color;

    public PiezaI(String color) {
        this.color = color;
    }
    
    @Override
    public void verPieza() {
        System.out.println(color+"[][][][]");
    }

    @Override
    public void moverIzq() {
        System.out.println("La pieza I se movio un bloque a la izquierda");
    }

    @Override
    public void moverDer() {
        System.out.println("La pieza I se movio un bloque a la derecha");
    }

    @Override
    public void girar90Der() {
        System.out.println("La pieza I se giro 90 grados a la derecha");
    }

    @Override
    public void girar90Izq() {
         System.out.println("La pieza I se giro 90 grados a la izquierda");
    }
    
}
