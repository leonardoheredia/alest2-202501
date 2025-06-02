package aula27_grafos_dijkstra;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> verticesNomes = new HashMap<>();
        verticesNomes.put("P", 0);
        verticesNomes.put("Z", 1);
        verticesNomes.put("M", 2);
        verticesNomes.put("K", 3);
        verticesNomes.put("F", 4);

        DigrafoPonderado digrafo = new DigrafoPonderado(verticesNomes.size());
        digrafo.adicionarAresta(verticesNomes.get("P"), verticesNomes.get("Z"), 30);
        digrafo.adicionarAresta(verticesNomes.get("P"), verticesNomes.get("M"), 200);
        digrafo.adicionarAresta(verticesNomes.get("Z"), verticesNomes.get("K"), 20);
        digrafo.adicionarAresta(verticesNomes.get("K"), verticesNomes.get("M"), 60);
        digrafo.adicionarAresta(verticesNomes.get("K"), verticesNomes.get("F"), 10);
        digrafo.adicionarAresta(verticesNomes.get("M"), verticesNomes.get("F"), 40);

        System.out.println(digrafo.toDot());



    }
}
