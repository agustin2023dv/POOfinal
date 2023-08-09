import java.util.ArrayList;
import java.util.List;

public class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    private int cantidadPartidos;

    public EtapaMundial() {
        this.descripcionEtapa= "";
        this.partidos = new ArrayList<Partido>() ;
    }

    public EtapaMundial(String descripcionEtapa, ArrayList<Partido>partidos){
        this.descripcionEtapa= descripcionEtapa;
        this.partidos= partidos;
    }

    public EtapaMundial(String descripcionEtapa){
        this.descripcionEtapa= descripcionEtapa;
        this.partidos= new ArrayList<Partido>();
    }

    public EtapaMundial(String descripcionEtapa, int cantidad_partidos){
        this.descripcionEtapa= descripcionEtapa;
        this.cantidadPartidos = cantidad_partidos;
        this.partidos= new ArrayList<Partido>(cantidad_partidos);
    }



    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public void addPartido(Partido partido) {
        partidos.add(partido);
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }


    public void setCantidadPartidos(int cantidad_partidos){

        this.cantidadPartidos = cantidad_partidos;
    }

    public int getCantidadPartidos(){
        return cantidadPartidos;
    }

    public void mostrarPartidos() {
        for (Partido partido : partidos) {
            System.out.println("Equipo Local: " + partido.getLocal().getNombre());
            System.out.println("Goles del Equipo Local: " + partido.getResultado().getGolesLocal());
            System.out.println("Equipo Visitante: " + partido.getVisitante().getNombre());
            System.out.println("Goles del Equipo Visitante: " + partido.getResultado().getGolesVisitante());
            System.out.println("-----------------------------");
        }
    }
}
