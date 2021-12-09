public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String salaReuniaoRemota;
    private String usuarioLogado;

    public String getSalaReuniaoRemota() {
        return salaReuniaoRemota;
    }

    public void setSalaReuniaoRemota(String salaReuniaoRemota) {
        this.salaReuniaoRemota = salaReuniaoRemota;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
