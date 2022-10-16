package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
    
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
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
