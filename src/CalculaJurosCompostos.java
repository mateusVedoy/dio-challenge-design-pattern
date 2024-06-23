public class CalculaJurosCompostos implements ICalculaJuros {
    private static final String TIPO_JUROS = "JUROS_COMPOSTOS";

    @Override
    public Montante calcular(double capital, double taxaJuros, int tempoEmAnos) {
        Double valorFinal = capital * Math.pow((1 + (taxaJuros / 100)), tempoEmAnos);
        return new Montante(capital, valorFinal, taxaJuros, tempoEmAnos, TIPO_JUROS);
    }
}
