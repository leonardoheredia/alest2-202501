package aula03_analise_algoritmos_ordenacao;

import utils.ArrayUtils;

public class AnaliseAlgoritmos {
    public static void main(String[] args) {
        System.out.println("n;bubble;insertion;merge;quick");
        for (int n = 1_000; n <= 50_000; n+=1_000) {
            int[] a = new int[n];
            ArrayUtils.preencherArrayComValoresInteirosAleatorios(a, 100_000, false);

            int[] aBubble = new int[n];
            ArrayUtils.clonarArray(a, aBubble);
            BubbleSort bs = new BubbleSort();
            bs.ordenar(aBubble);

            int[] aInsertion = new int[n];
            ArrayUtils.clonarArray(a, aInsertion);
            InsertionSort is = new InsertionSort();
            is.ordenar(aInsertion);

            int[] aMerge= new int[n];
            ArrayUtils.clonarArray(a, aMerge);
            MergeSort ms = new MergeSort();
            ms.ordenar(aMerge);

            int[] aQuick = new int[n];
            ArrayUtils.clonarArray(a, aQuick);
            QuickSort qs = new QuickSort();
            qs.ordenar(aQuick);

            System.out.println(n + ";"
                    + bs.getOperacoes() + ";"
                    + is.getOperacoes() + ";"
                    + ms.getOperacoes() + ";"
                    + qs.getOperacoes());


        }

    }
}
