package aula11_tabelasimbolos;

public class App {
    public static void main(String[] args) {
        TabelaSimbolo<Integer, String> ts = new TabelaSimbolo<>();
        ts.atualizar(1, "notebook");
        ts.atualizar(2,"impressora");
        ts.atualizar(888, "monitor");
        System.out.println(ts);
    }
}