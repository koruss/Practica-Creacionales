public class main8 {
    public static void main(String[] args) {
        var pool = new PoolEnemigos(); 
        System.out.println(pool.toString()+"\n"); 
        System.out.println("creamos el objetos y se añade a escena"); 
 
        var enemigo1= pool.aEscena();//creamos el objetos y se anade a escena 
        System.out.println(enemigo1); 
        System.out.println(pool.toString()+"\n"); 
 
        System.out.println("como no hay objetos disponibles se crea uno y se añade a escena"); 
        var enemigo2= pool.aEscena();//como no hay objetos disponibles se crea uno 
        System.out.println(enemigo2); 
        System.out.println(pool.toString()+"\n"); 
 
 
        System.out.println("Se guarda el enemigo ID= "+enemigo1.getId()+" para su reutilizacion, es decir se saca de la escena"); 
        pool.sacarEscena(enemigo1);//sacamo el primero y se guarda en el pool 
        System.out.println(pool.toString()+"\n"); 
 
        System.out.println("Pedimos un enemigo a escena, esta vez si hay disponibles por lo que nada mas lo tomamos\n y lo traemos a escena"); 
        pool.aEscena();//volvemos a  
        System.out.println(pool.toString()); 
    }
    
}
