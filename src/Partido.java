import java.util.Date;

class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;



    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        local.jugarPartido(this);
        visitante.jugarPartido(this);
    }

    public Partido(Date fecha, Equipo local, Equipo visitante, Resultado resultado){
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.resultado = resultado;
        local.jugarPartido(this);
        visitante.jugarPartido(this);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {


        return resultado;
    }

    public void setResultado(Resultado resultado) {

        this.resultado = resultado;
    }
}