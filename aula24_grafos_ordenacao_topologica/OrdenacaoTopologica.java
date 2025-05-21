package aula24_grafos_ordenacao_topologica;

import aula23_grafos_lista_adjacencia.GrafoListaAdjacencia;

import java.util.Stack;

public class OrdenacaoTopologica {
    private GrafoListaAdjacencia grafo;
    private boolean[] percorridos;
    private Stack<Integer> pilha;

    public OrdenacaoTopologica(GrafoListaAdjacencia grafo) {
        this.grafo = grafo;
        percorridos = new boolean[this.grafo.getNumVertices()];
        pilha = new Stack<>();

        if(contemCiclo()) return;

        for(int v=0;v<this.grafo.getNumVertices();v++) {
            if (!percorridos[v]) {
                buscarProfundidade(v);
                pilha.add(v);
            }

        }

    }

    private void buscarProfundidade(int v) {
        percorridos[v] = true;
        for(Integer w:grafo.obterAdjacentes(v)) {
            if(!percorridos[w]) {
                buscarProfundidade(w);
                pilha.add(w);
            }
        }
    }

    private boolean contemCiclo() {
        //vamos implementar em aula
        return false;
    }

    public void mostrarResultado() {
        while (!pilha.empty()) System.out.println(pilha.pop());
    }
}
