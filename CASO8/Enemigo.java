import java.util.concurrent.atomic.AtomicInteger;

public class Enemigo {
    private static final AtomicInteger contador = new AtomicInteger(0);
    private final int id;
    public int getId() {
        return id;
    }


    public Enemigo(){
        id=contador.incrementAndGet();
    }

    @Override
    public String toString(){
        return "ID= "+getId();
    }

}
