package aula26_grafos_trabalho;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> verticesNomes = new HashMap<>();
        String nomeArquivo = "c:\\temp\\10_arestas.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] nomes = linha.split("--");
                nomes[0] = nomes[0].trim();
                nomes[1] = nomes[1].trim();
                int n = verticesNomes.size();
                if(!verticesNomes.containsValue(nomes[0])) verticesNomes.put(n, nomes[0]);
                n = verticesNomes.size();
                if(!verticesNomes.containsValue(nomes[1])) verticesNomes.put(n, nomes[1]);

            }
            System.out.println("Arquivo carregado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        //tamnho do grafo = verticesNomes.size()
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] nomes = linha.split("--");
                nomes[0] = nomes[0].trim();
                nomes[1] = nomes[1].trim();
 //
            }
            System.out.println("Arquivo carregado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        for(Map.Entry<Integer, String> e: verticesNomes.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }



    }

}
