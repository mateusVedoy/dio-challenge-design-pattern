public class CalculoJurosFactory {
    
    public ICalculaJuros geraCalculadora(int tipoJuros) {
        return tipoJuros == 1 ? new CalculaJurosSimples() : new CalculaJurosCompostos();
    }
}
