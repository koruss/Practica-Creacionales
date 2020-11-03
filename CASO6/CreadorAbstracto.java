

//Clase abstracta que define el metodo de fabricacion de productos
//Tambien posee los distintos productos soportados por la fabrica actualmente
public abstract class CreadorAbstracto {
    public static final int J = 1;
    public static final int L = 2;
    public static final int T = 3;
    public static final int Z = 4;
    public static final int S = 5;
    public static final int I = 6;
    public static final int O = 7;
    // --------------------------------
    public abstract IPieza crearPieza(int tipo, String color);
}
