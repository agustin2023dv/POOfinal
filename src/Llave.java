import java.util.ArrayList;
import java.util.List;

public class Llave extends EtapaMundial{



    private int cantEquiposClasifican;

    public Llave (String descripcionEtapa,  int cantEquiposClasifican){
        super(descripcionEtapa);

        this.cantEquiposClasifican= cantEquiposClasifican;
    }




    public int getCantEquiposClasifican() {
        return cantEquiposClasifican;
    }

    public void setCantEquiposClasifican(int cantEquiposClasifican) {
        this.cantEquiposClasifican = cantEquiposClasifican;
    }



    @Override
    public List<Equipo> getEquiposQueAvanzan() {

        ArrayList<Equipo> equiposQueAvanzan= new ArrayList<>();


        for(int i= 0;i<this.cantEquiposClasifican;i++){

            if(this.getPartidos().get(i).getResultado().ganoLocal()){
                equiposQueAvanzan.add(this.getPartidos().get(i).getLocal());
            }
            else if(this.getPartidos().get(i).getResultado().empate()){

                boolean equipClasificado = Math.random() < 0.5 ? true : false;

                if(equipClasificado) {
                    equiposQueAvanzan.add(this.getPartidos().get(i).getLocal());
                }
                else{
                    equiposQueAvanzan.add(this.getPartidos().get(i).getVisitante());
                    }
                }
            else{
                equiposQueAvanzan.add(this.getPartidos().get(i).getVisitante());
            }
        }
        return equiposQueAvanzan;
    }
}
