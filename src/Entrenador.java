
public class Entrenador {
	private String nombre;
	private int edad;
	private int numtitulos;

	public Entrenador() {	
	}
   public Entrenador(String _nombre,int _edad,int _numtitulos) {
	   this.nombre=_nombre;
	   this.edad=_edad;
	   this.numtitulos=_numtitulos;
	   
   }
   public String getnombre () {return this.nombre;} public void setnombre(String _nombre) {this.nombre=_nombre;}
   public int getedad() {return this.edad;} public void setedad(int _edad) {this.edad=_edad;}
   public int getnumtitulos() {return this.numtitulos;} public void setnumtitulos(int _numtitulos) {this.numtitulos=_numtitulos;}
   
  
   
}

