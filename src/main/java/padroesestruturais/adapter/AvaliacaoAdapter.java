package padroesestruturais.adapter;

public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoEnergia;

    public AvaliacaoAdapter(IAvaliacao avaliacaoenergia) {
        this.avaliacaoEnergia = avaliacaoenergia;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() >= 10.0f)
            avaliacaoEnergia.setAvaliacao("Selo de economia A");
        else
        if (this.getNota() >= 6.0f)
            avaliacaoEnergia.setAvaliacao("Selo de economia B");
        else
        if (this.getNota() >= 3.0f)
            avaliacaoEnergia.setAvaliacao("Selo de economia C");
        else
            avaliacaoEnergia.setAvaliacao("Selo de economia D");
        return avaliacaoEnergia.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoEnergia.getAvaliacao().equals("Selo de economia A"))
            this.setNota(10.0f);
        else
        if (avaliacaoEnergia.getAvaliacao().equals("Selo de economia B"))
            this.setNota(6.0f);
        else
        if (avaliacaoEnergia.getAvaliacao().equals("Selo de economia C"))
            this.setNota(3.0f);
        else
            this.setNota(0.0f);
    }
}
