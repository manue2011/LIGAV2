
public class Equipo {
	private final int tot_jugadores=20;
	private final int tot_tecnicos=2;
	private String nombre;
	private String estadio;
	public Jugador[]jugadores;
	public Entrenador[] entrenadores;
	/*
	public jugador[]jugadores= new jugador[tot_jugadores];  //opcion 1
	public entrenador[] entrenadores= new entrenador[tot_tecnicos];
	*/
	
	
	public Equipo() {
		
		this.jugadores = new Jugador[tot_jugadores];      //opcion 2
		this.entrenadores=new Entrenador[tot_tecnicos];
		
	}
public Equipo(String _nombre,String _estadio) {
	this.nombre=_nombre;
	this.estadio=_estadio;
	this.jugadores=new Jugador[tot_jugadores]; 
	this.entrenadores=new Entrenador[tot_tecnicos];
	
}
public Equipo(String nombre, String estadio, Jugador[] jugadores, Entrenador[] entrenadores) { // creado por IDE
	super();
	this.nombre = nombre;
	this.estadio = estadio;
	this.jugadores = jugadores;
	this.entrenadores = entrenadores;
}
public String getNombre() {return nombre;}
public void setNombre(String nombre) {this.nombre = nombre;}
public String getEstadio() {return estadio;}
public void setEstadio(String estadio) {this.estadio = estadio;}
public Jugador[] getJugadores() {return jugadores;}
public void setJugadores(Jugador[] jugadores) {this.jugadores = jugadores;}
public Entrenador[] getEntrenadores() {return entrenadores;}
public void setEntrenadores(Entrenador[] entrenadores) {this.entrenadores = entrenadores;}


}
