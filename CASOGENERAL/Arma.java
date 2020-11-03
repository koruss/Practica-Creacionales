public abstract class Arma {
    private String nombre;
    private int alcance;
    private int danio;
    public Arma(String nombre, int alcance, int danio) {
        setAlcance(alcance);
        setDanio(danio);
        setNombre(nombre);
    }
    public String toString() {
        return "Nombre: " + getNombre() + " |Alcance: " + getAlcance() + " |Daño:" + getDanio() + " ";
    }
    public String getNombre() {return this.nombre;
    }
    public void setNombre(String nombre) {this.nombre = nombre;
    }
    public int getAlcance() {return this.alcance;
    }
    public void setAlcance(int alcance) {this.alcance = alcance;
    }
    public int getDanio() {return this.danio;
    }
    public void setDanio(int danio) {this.danio = danio;
    }

}
