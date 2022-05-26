package futbol;

public class Portero extends Futbolista{

    public short golesRecibidos;
    public byte dorsal;

    public final String posicion = "Portero";

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }


    public int compareTo(Futbolista o){
        return Math.abs(this.golesRecibidos-((Portero)o).golesRecibidos);


    }

    public boolean jugarConLasManos(){
        return true;
    }

    public String toString(){
        return super.toString()+ " con el dorsal " + this.dorsal + ". Le han marcado "+ this.golesRecibidos;
    }

}

