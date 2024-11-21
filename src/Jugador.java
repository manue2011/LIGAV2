
public class Jugador {

	private String nombre;
	private Puesto posicion;
	private int numero;
	private int edad;
	private int numgoles=0;
	private boolean activo;
	
	public Jugador(){		
	this.numero=-1;
	this.activo=true;
		

	}
	public Jugador(String _nombre,Puesto _posicion,int _numero,int _edad,int _numgoles, boolean _activo) {
		this.nombre=_nombre;
		this.posicion=_posicion;
		this.numero=_numero;
		this.edad=_edad;
		this.numgoles=_numgoles;
		this.activo=_activo;
	
	}
	public int getedad() {return this.edad;}
    public void setedad(int _edad) {this.edad=_edad;}
    public String getnombre() {return this.nombre;}
    public void setnombre(String _nombre) {this.nombre=_nombre;}
    public Puesto getposicion() {return this.posicion;}
    public void setposicion(Puesto _puesto) {this.posicion=_puesto;}
    public int getnumero() {return this.numero;}
    public void setnumero(int _numero) {this.numero=_numero;}
    public int getnumgoles() {return this.numgoles;}
    public void setnumgoles(int _numgoles) {this.numgoles=_numgoles;}
    public boolean isactivo() {return this.activo;}
    public void setactivo(boolean _activo) {this.activo=_activo;}
}   

