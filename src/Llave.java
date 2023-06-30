import java.util.List;

public class Llave extends EtapaMundial{

    private String codigoLlave;


    public Llave (String codigoLlave){
        this.codigoLlave = codigoLlave;
    }


    public String getCodigoLlave() {
        return codigoLlave;
    }

    public void setCodigoLlave(String codigoLlave) {
        this.codigoLlave = codigoLlave;
    }




 //   public List<Equipo> getEquiposQueAvanzan() {
        // Implementación de la lógica para obtener los equipos que avanzan
        // ...
   //     return equipos;
    //}
}
