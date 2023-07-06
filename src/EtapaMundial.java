import java.util.ArrayList;
import java.util.List;

public class EtapaMundial {

    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    private int cantidad_partidos;

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
        this.cantidad_partidos = cantidad_partidos;
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


    public void setCantidad_partidos(int cantidad_partidos){

        this.cantidad_partidos = cantidad_partidos;
    }

    public int getCantidad_partidos(){
        return cantidad_partidos;
    }
}
