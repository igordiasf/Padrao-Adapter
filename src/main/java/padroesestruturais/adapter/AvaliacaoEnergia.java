package padroesestruturais.adapter;

public class AvaliacaoEnergia implements IAvaliacao {

    private String energia;

    @Override
    public String getAvaliacao() {
        return this.energia;
    }

    @Override
    public void setAvaliacao(String energia) {
        this.energia = energia;
    }
}
