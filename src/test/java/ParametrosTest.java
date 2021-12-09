import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {
    @Test
    public void deveRetornarNomeEscola() {
        Parametros.getInstance().setSalaReuniaoRemota("Sala 1");
        assertEquals("Sala 1", Parametros.getInstance().getSalaReuniaoRemota());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Usuario 1 Logado");
        assertEquals("Usuario 1 Logado", Parametros.getInstance().getUsuarioLogado());
    }
}