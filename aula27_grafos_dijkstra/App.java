package aula27_grafos_dijkstra;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> verticesNomes = new HashMap<>();
        verticesNomes.put(0, "A");
        verticesNomes.put(1, "B");
        verticesNomes.put(2, "C");
        verticesNomes.put(3, "D");

        DigrafoPonderado grafo = new DigrafoPonderado(5);

        // Adicionando arestas com pesos

        // Imprimindo o grafo
        grafo.imprimir();

        // Convertendo para formato DOT
        String dotRepresentation = grafo.toDot();
        System.out.println(dotRepresentation);


        HeapMinimo heap = new HeapMinimo();
        heap.inserir(10);
        heap.inserir(5);
        heap.inserir(3);
        heap.inserir(8);
        System.out.println("Heap antes de remover o mínimo:");
        System.out.println(heap);
        System.out.println("Removendo mínimo: " + heap.removerMinimo());
        System.out.println("Heap após remover o mínimo:");
        System.out.println(heap);
    }
}
