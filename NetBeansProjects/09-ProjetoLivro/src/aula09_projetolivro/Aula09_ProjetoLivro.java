package aula09_projetolivro;
public class Aula09_ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Daniel", 23, 'H');
        p[1] = new Pessoa("Julia", 27, 'M');
        
        l[0] = new Livro("Algoritmos", "Julio Alves", 300, p[0]);
        l[1] = new Livro("Java Básico", "Gustavo Guanabara", 500, p[1]);
        l[2] = new Livro("Java POO", "Ana Guimarães", 650, p[0]);
        
        l[2].abrir();
        l[2].folhear(600);
        l[2].voltarPag();
        l[2].avancarPag();
        System.out.println(l[2].detalhes());
    }
    
}
