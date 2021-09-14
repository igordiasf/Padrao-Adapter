package padroesestruturais.adapter;

public class Geladeira {

    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Geladeira() {
        avaliacao = new AvaliacaoEnergia();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String energia) {
        avaliacao.setAvaliacao(energia);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public float getNota() {
        return persistencia.getNota();
    }

}
