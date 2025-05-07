package aula20_grafos;

public class App {
    public static void main(String[] args) {
        Grafo g = new Grafo(4);
        g.adicionarAresta(0,1);
        g.adicionarAresta(0,3);
        g.adicionarAresta(2,3);
        System.out.println(g.gerarDot());
    }
}
