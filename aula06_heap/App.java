package aula06_heap;

public class App {
    public static void main(String[] args) {
        HeapMax heap = new HeapMax();
        heap.inserir(50);
        System.out.println(heap);
        heap.inserir(30);
        System.out.println(heap);
        heap.inserir(19);
        System.out.println(heap);
        heap.inserir(40);
        System.out.println(heap);
        heap.inserir(15);
        System.out.println(heap);
        heap.inserir(10);
        System.out.println(heap);
        heap.inserir(80);
        System.out.println(heap);

        heap.removerMaximo();
        System.out.println(heap);








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
