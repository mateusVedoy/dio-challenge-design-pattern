public class Template {
    
    public void exibeValorFinal(ICalculaJuros calculaJuros, double capital, double taxaJuros, int tempoEmAnos) {

        Montante montante = calculaJuros.calcular(capital, taxaJuros, tempoEmAnos);
        System.out.printf("\nAo final de %d anos de investimento, seu patrimônio final será de %.2f\n", tempoEmAnos, montante.getValorFinal());
        System.out.println("Informações da aplicação abaixo: ");
        System.out.println(montante.toString());
    }
}
