package aula14a;
public class Aula14a {
    public static void main(String[] args) {
        // Programa Principal
        Video v[] = new Video[2];
        v[0] = new Video("Aula 3 de POO");
        v[1] = new Video("Aula 10 de PHP");
        v[1].play();
        v[1].like();
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Daniel", 23, 'M', "daninms");
        g[1] = new Gafanhoto("Laura", 17, 'F', "laurinha123");
        g[1].ganharExp();
        
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(g[1], v[1]);
        vis[0].avaliar(8);
        System.out.println(vis[0].toString());

        
        /*System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
