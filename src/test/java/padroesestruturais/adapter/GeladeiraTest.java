package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeladeiraTest {

    @Test
    void deveRetornarenergiaGeladeira() {
        Geladeira Geladeira = new Geladeira();
        Geladeira.setAvaliacao("Selo de economia A");

        assertEquals("Selo de economia A", Geladeira.getAvaliacao());
    }

    @Test
    void deveRetornarNotaGeladeira() {
        Geladeira Geladeira = new Geladeira();
        Geladeira.setAvaliacao("Selo de economia A");

        assertEquals(10.0f, Geladeira.getNota());
    }

}