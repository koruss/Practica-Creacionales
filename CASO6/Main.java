public class Main {
    //Colores para las piezas
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    //Color de fondo para las piezas
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    public static void main(String[] args) {
        Creador creator = new Creador();
        
        //Cliente donde se crean las distintas piezas y se muestran los metodos aplicados
        
        System.out.println("Pieza I");
        IPieza piezaI = creator.crearPieza(Creador.I, ANSI_WHITE_BACKGROUND+ANSI_RED);
        piezaI.verPieza();
        piezaI.moverDer();
        
        System.out.println("\nPieza J");
        IPieza piezaJ = creator.crearPieza(Creador.J, ANSI_WHITE_BACKGROUND+ANSI_PURPLE);
        piezaJ.verPieza();
        piezaJ.moverIzq();
        
        System.out.println("\nPieza L");
        IPieza piezaL = creator.crearPieza(Creador.L, ANSI_WHITE_BACKGROUND+ANSI_BLUE);
        piezaL.verPieza();
        piezaL.girar90Der();
        
        System.out.println("\nPieza O");
        IPieza piezaO = creator.crearPieza(Creador.O, ANSI_WHITE_BACKGROUND+ANSI_YELLOW);
        piezaO.verPieza();
        piezaL.girar90Izq();
        
        System.out.println("\nPieza S");
        IPieza piezaS = creator.crearPieza(Creador.S, ANSI_WHITE_BACKGROUND+ANSI_GREEN);
        piezaS.verPieza();
        
        System.out.println("\nPieza T");
        IPieza piezaT = creator.crearPieza(Creador.T, ANSI_WHITE_BACKGROUND+ANSI_BLACK);
        piezaT.verPieza();
        
        System.out.println("\nPieza Z");
        IPieza piezaZ = creator.crearPieza(Creador.Z, ANSI_WHITE_BACKGROUND+ANSI_CYAN);
        piezaZ.verPieza();
    }
    
}
