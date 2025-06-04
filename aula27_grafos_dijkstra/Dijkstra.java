package aula27_grafos_dijkstra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Dijkstra {

    private DigrafoPonderado grafo;
    private int origem;
    private boolean[] visitados;
    private int[] anteriores;
    private int[] distancia;
    private ArrayList<Integer> listaAuxiliar;
    private Queue<Integer> fila;

    public Dijkstra(DigrafoPonderado grafo, int origem) {
        this.grafo = grafo;
        this.origem = origem;
        visitados = new boolean[this.grafo.getNumVertices()];
        anteriores = new int[this.grafo.getNumVertices()];
        distancia = new int[this.grafo.getNumVertices()];
        listaAuxiliar = new ArrayList<>();
        fila = new LinkedList<>();
        for (int v = 0; v < anteriores.length; v++) {
            anteriores[v] = -1;
            distancia[v] = Integer.MAX_VALUE;
        }
        rodarDijkstra();
    }

    private void rodarDijkstra() {
        distancia[this.origem] = 0;
        visitados[this.origem] = true;
        listaAuxiliar.add(this.origem);
        //fila.add(this.origem);

        while (!listaAuxiliar.isEmpty()) {
            int v = obterVerticeMenorDistancia();
            for(DigrafoPonderado.Aresta e: grafo.getArestasAdjacentes(v)) {
                int w = e.destino;
                int peso = e.peso;
                if(!visitados[w] || distancia[w]>distancia[v]+peso) {
                    fila.add(w);
                    visitados[w] = true;
                    anteriores[w] = v;
                    distancia[w] = distancia[v] + peso;
                    if(!listaAuxiliar.contains(w)) listaAuxiliar.add(w);
                }
            }
        }



    }

    private int obterVerticeMenorDistancia() {
        //percorrer a lista auxiliar
        if(listaAuxiliar.isEmpty()) return -1;

        int menorVertice = listaAuxiliar.get(0);
        int menorDistancia = distancia[menorVertice];
        for (Integer v:listaAuxiliar) {
            int distanciaAtual = distancia[v];
            if(distanciaAtual<menorDistancia) {
                menorVertice = v;
                menorDistancia = distancia[menorVertice];
            }
        }
        int p = listaAuxiliar.indexOf(menorVertice);
        listaAuxiliar.remove(p);
        return menorVertice;
    }


    public void imprimirCaminhos() {
        System.out.println("Caminhos mais curtos a partir do vértice " + origem + ":");
        System.out.println("Vértice, Anterior, Distância");
        for (int v = 0; v < anteriores.length ; v++) {
            System.out.println(v + "," + anteriores[v] + "," + distancia[v]);
        }
    }

}
