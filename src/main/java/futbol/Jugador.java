package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(){
		this(null,0,null,(short) 289, (byte) 7);
	}


	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super();
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
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
