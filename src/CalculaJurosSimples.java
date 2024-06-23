public class CalculaJurosSimples implements ICalculaJuros {
    private static final String TIPO_JUROS = "JUROS_SIMPLES";

    @Override
    public Montante calcular(double capital, double taxaJuros, int tempoEmAnos) {
        Double valorFinal = ((capital * taxaJuros) / 100) * tempoEmAnos;
        return new Montante(capital, valorFinal, taxaJuros, tempoEmAnos, TIPO_JUROS);
    }
    
}
