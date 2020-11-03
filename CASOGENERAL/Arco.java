public class Arco extends Arma {
    private int numFlechas;
    public int getNumFlechas() {
        return this.numFlechas;
    }
    public void setNumFlechas(int numFlechas) {
        this.numFlechas = numFlechas;
    }
    public void reducirFlechas(){
        this.numFlechas--;
    }
    public Arco(String nombre,int alcance,int danio,int numFlechas ){
        super(nombre,alcance,danio);
        setNumFlechas(numFlechas);
    }

    @Override
    public String toString(){
        return "nombre: "+super.getNombre()+" |Alcance: "+super.getAlcance()+" |Flechas "+getNumFlechas(); 
    }
    
}
