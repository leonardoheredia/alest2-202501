package aula25_grafos_ponderados;

import java.util.ArrayList;

public class GrafoPonderado {
    private ArrayList<Aresta>[] listaAdjacencia;
    private int numVertices;
    private int numArestas;
    public GrafoPonderado(int numVertices) {
        this.numVertices = numVertices;
        this.numArestas = 0;
        listaAdjacencia = new ArrayList[numVertices];
        for (int v = 0; v < this.numVertices; v++) {
            listaAdjacencia[v] = new ArrayList<>();
        }
    }
    public void adicionarAresta(int v, int w, int peso) {
        Aresta e = new Aresta(v, w, peso);
        listaAdjacencia[v].add(e);
        listaAdjacencia[w].add(e);
        numArestas++;
    }
    public void imprimir() {
        for (int i = 0; i < numVertices; i++) {
            for(Aresta e:listaAdjacencia[i]) {
                if(e.getV()!=i) System.out.println(e);
            }
        }
    }
}
