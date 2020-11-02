
package Main;

//Interfaz implementada por los distintos productos de la fabrica 
public interface IPieza {
    
    //Metodo que muestra la pieza
    public void verPieza();
    
    //Metodo para mover la pieza a la izquierda
    public void moverIzq();
    
    //Metodo para mover la pieza a la derecha
    public void moverDer();
    
    //Metodo para girar 90 grados a la derecha
    public void girar90Der();
    
    //Metodo para girar 90 grados a la izquierda
    public void girar90Izq();
}
