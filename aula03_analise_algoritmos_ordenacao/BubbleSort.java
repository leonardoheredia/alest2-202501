package aula03_analise_algoritmos_ordenacao;

public class BubbleSort {
    private int operacoes;
    private long tempoInicio;
    private long tempoFim;
    public long getOperacoes() {
        return operacoes;
    }

    public long getTempoExecucao() {
        long tempoExecucao = (tempoFim - tempoInicio)  ;
        return tempoExecucao;
    }

    public void ordenar(int[] arrayInteiros) {
        tempoInicio = System.nanoTime();
        operacoes = 0;
        int tamanho = arrayInteiros.length;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if(arrayInteiros[j]>arrayInteiros[j + 1]) {
                    int temp = arrayInteiros[j];
                    arrayInteiros[j] = arrayInteiros[j + 1];
                    arrayInteiros[j + 1] = temp;
                    operacoes++;
                }
                operacoes++;
            }
        }
        tempoFim = System.nanoTime();
    }

}
