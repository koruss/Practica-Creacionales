public class PoolEnemigos extends Pool<Enemigo>{

    @Override
    protected Enemigo create() {
        
        return new Enemigo();
    }


}
