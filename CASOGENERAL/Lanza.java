public class Lanza extends Arma {
    private String veneno;

    public String getVeneno() {
        return this.veneno;
    }

    public void setVeneno(String veneno) {
        this.veneno = veneno;
    }

    public Lanza(String nombre,int alcance,int danio,String veneno){
        super(nombre,alcance,danio);
        setVeneno(veneno);
    }

    public String toString(){
        return super.toString()+" Veneno: "+getVeneno();
    }

}
