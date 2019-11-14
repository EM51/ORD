package Projeto;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Grafo g = new Grafo("dij10.txt");
        
        g.ListaAdj = g.crialistAdj(g.matrizAdj);        
        g.preencheVertice();
        g.dijkstra(g.vertices[0]);
    }
}
