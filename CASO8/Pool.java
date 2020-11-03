import java.util.HashSet;
import java.util.Set;
//una clase abstracta que se encarga de modelar la logica del Pool 
// se utiliza un template para que se pueda utilizar independientemente
// de la clase de objetos que se quieran guardar


public abstract class Pool<T> {
    private final Set<T> disponible = new HashSet<>();
    private final Set<T> activos = new HashSet<>();

    protected abstract T create();


    //esta funcion como su nombre lo dice lo que 
    //hace es crear el objeto si no esta y lo guarda en la hash 
    // de objetos activos
    public T aEscena(){//checkOut
        if(disponible.isEmpty()){
            disponible.add(create());
        }
        var instance = disponible.iterator().next();
        disponible.remove(instance);//
        activos.add(instance);
        return instance;
    }

// este metodo lo que hace es sacar de escena el objeto 
// y lo guarda para su reutilizacion
    public void sacarEscena(T instance){
        activos.remove(instance);
        disponible.add(instance);
    }
    
    public String toString(){
        return "Pool disponibles: "+ disponible.size()+"| Pool activos: "+activos.size();
    }
    
}
