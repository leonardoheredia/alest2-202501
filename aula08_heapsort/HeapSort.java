package aula08_heapsort;

import utils.ArrayUtils;

public class HeapSort {
    private int operacoes;
    private long tempoInicio;
    private long tempoFim;
    public long getOperacoes() {
        return operacoes;
    }
    public long getTempoExecucao() {
        return 0;
    }
    public void ordenar(int[] a) {
        //ordenar
        int pUltimo = a.length-1;
        int pPaiUltimo = (pUltimo-1)/2;
        afundar(a, pPaiUltimo);
        ArrayUtils.imprimir(a);

    }

    private void gerarHeap(int[] a) {
        //percorrer apenas os pais
        int p = (a.length-1-1)/2;
        while(p>=0) {

        }
    }
    private void afundar(int[] a, int k) {
        int maior = k;
        int fe = 2*k + 1;
        int fd = 2*k + 2;

        if(fe < a.length && a[fe]>a[maior]) maior = fe;
        if(fd < a.length && a[fd]>a[maior]) maior = fd;

        if(maior!=k) { //filho maior que o pai
            int temp = a[maior];
            a[maior] = a[k];
            a[k] = temp;
            ArrayUtils.imprimir(a);
            afundar(a, maior);
        }
    }

    public static void main(String[] args) {
        int[] a = {33,40,23,67,18,31,59};
        ArrayUtils.imprimir(a);
        HeapSort hs = new HeapSort();
        hs.ordenar(a);

    }
}
