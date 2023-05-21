package esporte;

public class EsporteTipo implements EsporteCadastro {
    private String esporte;
    private String tipoQuadra;

    @Override
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    @Override
    public void setTipoQuadra(String tipoQuadra) {
        this.tipoQuadra = tipoQuadra;
    }

    public String getEsporte() {
        return esporte;
    }

    public String getTipoQuadra() {
        return tipoQuadra;
    }
}