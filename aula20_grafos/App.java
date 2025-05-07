package aula20_grafos;

public class App {
    public static void main(String[] args) {
        Grafo g = new Grafo(4);
        g.adicionarAresta(0,1);
        g.adicionarAresta(0,3);
        g.adicionarAresta(2,3);
        System.out.println(g.gerarDot());
        System.out.println(g.obterGrau(0));
        System.out.println(g.adjacentes(0).toString());

        Digrafo dg = new Digrafo(4);
        dg.adicionarAresta(0,1);
        dg.adicionarAresta(0,3);
        dg.adicionarAresta(2,3);
        System.out.println(dg.gerarDot());
    }
}
