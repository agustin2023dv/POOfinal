import java.util.ArrayList;
import java.util.List;

public class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

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
        this.partidos= new ArrayList<>();
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

    public List<Partido> getPartidos() {
        return partidos;
    }

}
