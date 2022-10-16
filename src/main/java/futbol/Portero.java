package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
    
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", juega de " + getPosicion()+ " con el dorsal "+ dorsal+ ". Le han marcado "+ golesRecibidos ;
	}
	
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}

    @Override
    public int compareTo(Object obj){
        return Math.abs(this.golesRecibidos-((Portero)obj).golesRecibidos);
    }
	
}
