package aula25_grafos_ponderados;

public class App {
    public static void main(String[] args) {
        GrafoPonderado gp =  new GrafoPonderado(4);
        gp.adicionarAresta(0, 1, 30);
        gp.adicionarAresta(0, 2, 60);
        gp.adicionarAresta(1, 2, 90);
        gp.adicionarAresta(2, 3, 13);

        gp.imprimir();
    }
}
