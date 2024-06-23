public class Montante {
    private Double valorFinal;
    private Double valorInicial;
    private Double jurosAplicados;
    private int tempoAplicado;
    private String tipoJuros;

    public Montante(
        Double valorInicial,
        Double valorFinal,
        Double jurosAplicados,
        int tempoAplicado,
        String tipoJuros
    ) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.jurosAplicados = jurosAplicados;
        this.tempoAplicado = tempoAplicado;
        this.tipoJuros = tipoJuros;
    }

    public Double getValorFinal() {
        return tipoJuros.equals("JUROS_SIMPLES") ? valorFinal + valorInicial : valorFinal;
    }

    public Double getValorInicial() {
        return valorInicial;
    }

    public Double getJurosAplicados() {
        return jurosAplicados;
    }

    public int getTempoAplicado() {
        return tempoAplicado;
    }

    public String getTipoJuros() {
        return tipoJuros;
    }

    @Override
    public String toString() {
        return String.format(
                "\nDados: valorFinal=%.3f, valorInicial=%.3f, jurosAplicados=%.2f, tempoAplicado=%d anos, tipoJuros='%s'\n",
                valorFinal, getValorInicial(), getJurosAplicados(), tempoAplicado, tipoJuros);
    }
}
