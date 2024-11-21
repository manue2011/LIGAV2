
public class appLigaV2 {

	public appLigaV2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		Jugador j1 = new Jugador();
		j1.setnombre("johan cruiff");
		j1.setedad(25);
		j1.setposicion(Puesto.DELANTERO);
		j1.setnumero(11);
		Jugador j2 = new Jugador("luis aragones",Puesto.DELANTERO,9,34,0,true);// constructor
		Jugador j3= new Jugador("radamel falcao",Puesto.DELANTERO,9,38,310,true);
        Jugador j4 = new Jugador("Isi palazon",Puesto.DELANTERO,7,29,0,true);
        Jugador j5 = new Jugador("Saitama",Puesto.PORTERO,1,23,0, true);
        Jugador j6 = new Jugador("Kakaroto",Puesto.DELANTERO,2,22,0, true);
        Jugador j7 = new Jugador("Sonic",Puesto.DELANTERO,3,24,0, true);
        Jugador j8 = new Jugador("Flash",Puesto.DELANTERO,4,21,0, true);
        Jugador j9 = new Jugador("Kirito",Puesto.CENTRAL,5,22,0, true);
        Jugador j10 = new Jugador("Samus",Puesto.CENTRAL,6,19,0, true);
        Jugador j11 = new Jugador("Link",Puesto.CENTRAL,7,20,0, true);
        Jugador j12 = new Jugador("Alucard",Puesto.CENTRAL,8,21,0, true);
        Jugador j13 = new Jugador("Gatsu",Puesto.DEFENSA,9,22,0, true);
        Jugador j14 = new Jugador("Koro Sensei",Puesto.DEFENSA,10,23,0, true);
        Jugador j15 = new Jugador("Izuku",Puesto.DEFENSA,11,22,0, true);
        Jugador j16 = new Jugador ("Lionel Messi", Puesto.DELANTERO,10,37,848,true);
        Jugador j17 = new Jugador ("Tierry Henry", Puesto.DELANTERO,11,43,608,false);
        Jugador j18 = new Jugador ("Samuel Eto'o", Puesto.DELANTERO,9,47,421,false);
        Jugador j19 = new Jugador ("Andres Iniesta", Puesto.CENTRAL,8,47,127,false);
        Jugador j20 = new Jugador ("Xavi Hernandez", Puesto.CENTRAL,6,49,184,false);
        Jugador j21 = new Jugador ("Sergio Busquets", Puesto.CENTRAL,5,39,104,true);
        Jugador j22 = new Jugador ("Dani Alves", Puesto.DEFENSA,2,47,311,false);
        Jugador j23 = new Jugador ("Gerard Pique", Puesto.DEFENSA,3,37,81,false);
		//---------------------- 
        
		
		Equipo e1=new Equipo();//"barcelona","nou camp");
		e1.setNombre("barcelona");
		e1.setEstadio("nou camp");
		Equipo e2 = new Equipo ("Rayo Vallecano", "Estadio de Vallecas");
        Equipo e3 = new Equipo("Deportivo La Coruña", "Abanca Riazor");
        Equipo e4 = new Equipo("Sevila","Sánchez PiJuan");
		Equipo e5=new Equipo("deportivo la coruña","abanca riazor");
		
		
		Entrenador en1=new Entrenador("jose pekerman",75,0);
		Entrenador en2 = new Entrenador ("Pep Guardiola",53, 39);
		
	
	
	} 


}

