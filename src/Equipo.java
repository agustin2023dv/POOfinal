import java.util.ArrayList;


class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;

    private int[] golesEtapaGrupo;

    private int puntajeFaseGrupos;

    public Equipo(String nombre){
        this.partidosJugados = new ArrayList<Partido>();
        this.puntajeFaseGrupos = 0;
        this.golesEtapaGrupo= new int[]{0, 2};
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public void jugarPartido(Partido partido){
        this.partidosJugados.add(partido);
    }

    public int[] getGolesEtapaGrupo() {
        int golesAFavor = 0;
        int golesEnContra = 0;

        for (int i = 0; i < 3; i++) {
            Partido partido = getPartidosJugados().get(i);

            if (partido.getLocal().getNombre().equals(this.getNombre())) {
                golesAFavor += partido.getResultado().getGolesLocal();
                golesEnContra += partido.getResultado().getGolesVisitante();
            } else {
                golesEnContra += partido.getResultado().getGolesLocal();
                golesAFavor += partido.getResultado().getGolesVisitante();
            }
        }

        int[] goles = new int[] { golesAFavor, golesEnContra };

        this.golesEtapaGrupo = goles;

        return golesEtapaGrupo;
    }

    public void setGolesEtapaGrupo(int[] golesEtapaGrupo) {

        this.golesEtapaGrupo = golesEtapaGrupo;
    }

    public int getPuntaje() {
        puntajeFaseGrupos = 0;

        for (int i = 0; i < getPartidosJugados().size(); i++) {

            Partido partido = getPartidosJugados().get(i);
            Resultado resultado = partido.getResultado();

            if (resultado.empate()) {
                puntajeFaseGrupos += 1;
            } else if (!partido.getResultado().ganoLocal() && partido.getLocal().getNombre() != getNombre() ||
                    partido.getResultado().ganoLocal() && partido.getLocal().getNombre() == getNombre()
            ) {
                puntajeFaseGrupos += 3;
            }
            else {
                puntajeFaseGrupos += 0;
            }
        }

        return puntajeFaseGrupos;
    }


    public void setPuntaje(int puntaje) {
        this.puntajeFaseGrupos = puntajeFaseGrupos;
    }

    public String verEquipo(){

        return "Nombre: "+getNombre()+"\nPuntaje etapa de grupos:"+ getPuntaje()
                +"\nGoles a favor etapa de grupos:"+ getGolesEtapaGrupo()[0]+
                "\nGoles en contra etapa de grupos:"+ getGolesEtapaGrupo()[1];
    }
}