package aula03_analise_algoritmos_ordenacao;

import utils.ArrayUtils;

public class AnaliseAlgoritmos {
    public static void main(String[] args) {
        for (int n = 1_000; n <= 20_000; n+=1_000) {
            int[] a = new int[n];
            ArrayUtils.preencherArrayComValoresInteirosAleatorios(a, 100_000, false);

            int[] aBubble = new int[n];
            ArrayUtils.clonarArray(a, aBubble);

            BubbleSort bs = new BubbleSort();
            bs.ordenar(aBubble);
            System.out.println(n + "," + bs.getOperacoes());



        }

    }
}
