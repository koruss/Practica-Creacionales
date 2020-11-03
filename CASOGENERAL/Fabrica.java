public class Fabrica {
    public Hacha fabricarHacha(String nombre,int alcance,int danio){
        return new Hacha(nombre,alcance,danio);
    }

    public Arco fabricarArco(String nombre,int alcance,int danio,int numFlechas){
        return new Arco(nombre,alcance,danio,numFlechas);

    }

    public Lanza fabricarLanza(String nombre,int alcance,int danio,String veneno){
        return new Lanza(nombre,alcance,danio,veneno);

    }
    public Fabrica(){
        
    }
    
}
