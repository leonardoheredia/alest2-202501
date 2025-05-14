package aula21_grafos_caminhamento.matriz_adjacencia;

import aula20_grafos.Grafo;

import java.util.LinkedList;
import java.util.Queue;

public class BuscaEmLargura {
    private Grafo grafo;
    private int origem;
    private boolean[] visitados;
    private int[] anteriores;
    private int[] distancia;

    public BuscaEmLargura(Grafo g, int origem) {
        this.grafo = g;
        this.origem = origem;

        visitados = new boolean[g.getnVertices()];
        anteriores = new int[g.getnVertices()];
        distancia = new int[g.getnVertices()];

        for (int i = 0; i < g.getnVertices(); i++) {
            anteriores[i] = -1;
            distancia[i] = 0;
        }

        buscarEmLargura();

    }
    private void buscarEmLargura() {
        Queue<Integer> fila = new LinkedList<>();
        fila.add(origem);
        visitados[origem] = true;
        while (!fila.isEmpty()) {
            int vertice = fila.poll();
            for(Integer adjacente: grafo.adjacentes(vertice)) {
                if(!visitados[adjacente]) {
                    fila.add(adjacente);
                    visitados[adjacente] = true;
                    anteriores[adjacente] = vertice;
                    distancia[adjacente] = distancia[vertice] + 1;
                }
            }
        }
    }

    public void mostrarResultados() {
        System.out.println("vertice;visitado;anteriores;distancia");
        for (int v = 0; v < grafo.getnVertices(); v++) {
            System.out.println(v + "  " + visitados[v] + "  " + anteriores[v] + "  " + distancia[v]);
        }
    }

}
