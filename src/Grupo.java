import java.util.ArrayList;


class Grupo extends EtapaMundial {

    private String nombre;


    public Grupo(String descripcionEtapa, String nombre) {
        super(descripcionEtapa);
        this.nombre = nombre;
        this.setCantidadPartidos(6);
    }


    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>(2);
        ArrayList<Equipo> equiposGrupo = new ArrayList<>(4);

        for (Partido partido: getPartidos()
             ) {
            if(!equiposGrupo.contains(partido.getLocal())){
                equiposGrupo.add(partido.getLocal());
            } else if (!equiposGrupo.contains(partido.getVisitante())) {
                equiposGrupo.add(partido.getVisitante());
            }
        }

        Equipo primerClasificado = null;
        Equipo segundoClasificado = null;

        int primero = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;

        for (int i = 0; i < equiposGrupo.size(); i++) {

            if (equiposGrupo.get(i).getPuntaje() > primero) {
                segundo = primero;
                segundoClasificado = primerClasificado;
                primero = equiposGrupo.get(i).getPuntaje();
                    primerClasificado = equiposGrupo.get(i);
            }
            else if (equiposGrupo.get(i).getPuntaje() > segundo &&
                    equiposGrupo.get(i).getPuntaje() < primero) {
                segundo = equiposGrupo.get(i).getPuntaje();
                segundoClasificado = equiposGrupo.get(i);
            }
        }


        equiposQueAvanzan.add(primerClasificado);
        equiposQueAvanzan.add(segundoClasificado);
        return equiposQueAvanzan;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
