package esporte;

public class EsporteLocal {
    private String local;
    private String hora;

    public EsporteLocal(String local, String hora) {
        this.local = local;
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}