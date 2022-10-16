package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(){
		super();
		golesMarcados = 289;
		dorsal = 7;
	}

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	@Override
	public boolean jugarConLasManos(){
		return false;
	}
	@Override
	public int compareTo(Object obj){
		return Math.abs(this.getEdad()-((Futbolista)obj).getEdad());
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", juega de " + getPosicion()+ " con el dorsal "+ dorsal+". Ha marcado "+ golesMarcados ;
	}
	
	@Override
	public boolean equals(Futbolista f){
		return this==f;
	}	
}
