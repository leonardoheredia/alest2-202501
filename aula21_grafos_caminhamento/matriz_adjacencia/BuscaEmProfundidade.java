package aula21_grafos_caminhamento.matriz_adjacencia;

import aula20_grafos.Grafo;

import java.util.ArrayList;

public class BuscaEmProfundidade {
    private Grafo grafo;
    private int origem;
    private boolean[] percorridos;
    private int[] anteriores;

    public BuscaEmProfundidade(Grafo g, int origem) {
        this.grafo = g;
        this.origem = origem;
        percorridos = new boolean[g.getnVertices()];
        anteriores = new int[g.getnVertices()];
        for(int i = 0; i<anteriores.length; i++) anteriores[i] = -1;
        buscarEmProfundidadeRecursivo(this.grafo, this.origem);
    }

    private void buscarEmProfundidadeRecursivo(Grafo g, int v) {
        percorridos[v] = true;
        ArrayList<Integer> adjacentesDoV = g.adjacentes(v);
        for(Integer w:adjacentesDoV) {
            if(!percorridos[w]) {
                anteriores[w] = v;
                buscarEmProfundidadeRecursivo(g, w);
            }
        }
    }

    public void caminhoPara(int destino) {
        //mostrar o caminho do vertice origem para o destino
        //lembrar que a origem esta em uma propriedade da classe

    }

    public void mostrarResultado() {
        for (int v = 0; v < anteriores.length; v++) {
            System.out.println(v + "  " + percorridos[v] + " " + anteriores[v]);
        }
    }
}








