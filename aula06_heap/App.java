package aula06_heap;

import utils.ArrayUtils;

public class App {
    public static void main(String[] args) {
        HeapMax heap = new HeapMax();
        heap.inserir(50);
        heap.inserir(30);
        heap.inserir(19);
        heap.inserir(40);
        heap.inserir(15);
        heap.inserir(10);
        heap.inserir(80);
        System.out.println(heap);
        heap.removerMaximo();
        System.out.println(heap);
        heap.removerMaximo();
        System.out.println(heap);
        heap.removerMaximo();
        System.out.println(heap); //BUG!!! - CORRIGIR








/*
        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);

        h.removerMaximo();
        System.out.println(h);
*/

    }
}
