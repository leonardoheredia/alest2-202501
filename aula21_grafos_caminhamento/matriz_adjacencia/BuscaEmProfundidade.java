package aula21_grafos_caminhamento.matriz_adjacencia;

import aula20_grafos.Grafo;

import java.util.ArrayList;
import java.util.Stack;

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

        //  anterior[destino]  <- anterior[destino] <- destino
        System.out.println();
        int[] caminho = new int[anteriores.length];
        for(int i =0; i<caminho.length;i++) caminho[i] = -1;
        int t = 0;
        while(destino!=origem) {
            //System.out.print(destino + " ");
            caminho[t] = destino;
            t++;
            destino = anteriores[destino];
        }
        caminho[t] = origem;

        for (int i = caminho.length-1; i >=0 ; i--) {
            System.out.println(caminho[i]);
        }



    }

    public void mostrarResultado() {
        for (int v = 0; v < anteriores.length; v++) {
            System.out.println(v + "  " + percorridos[v] + " " + anteriores[v]);
        }
    }
}








