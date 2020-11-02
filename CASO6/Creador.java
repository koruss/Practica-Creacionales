
package Main;


//Clase que implementa la clase abstracta donde esta definido el metodo de la fabrica
public class Creador extends CreadorAbstracto{
    
    public void Creador() {
    }
    
    @Override
    public IPieza crearPieza(int tipo, String color) {
        
        IPieza objeto;
        
        switch( tipo )
        {
            case J:
                objeto = new PiezaJ(color);
                break;
            case L:
                objeto = new PiezaL(color);
                break;
            case T:
                objeto = new PiezaT(color);
                break;
            case Z:
                objeto = new PiezaZ(color);
                break;
            case S:
                objeto = new PiezaS(color);
            break;
            case I:
                objeto = new PiezaI(color);
            break;
            case O:
                objeto = new PiezaO(color);
            break;
            default:
                objeto = null;
        }
        
        return objeto;
    }
}
