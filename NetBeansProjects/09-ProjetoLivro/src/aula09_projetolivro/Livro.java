package aula09_projetolivro;
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos Getters(Acessores)
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    
    //Métodos Setters(Modificadores)
    public void setTitulo(String t){
        this.titulo = t;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public void setTotPaginas(int tp){
        this.totPaginas = tp;
    }
    public void setPagAtual(int pa){
        this.pagAtual = pa;
    }
    public void setAberto(boolean a){
        this.aberto = a;
    }
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }
    
    //Método Construtor
    public Livro(String titulo, String autor, int totPag, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPag);
        this.setLeitor(leitor);
        this.setAberto(false);
    }
    
    //Métodos Públicos
    public String detalhes() {
        return "Livro{" + "\n * titulo = " + titulo + ", autor = "
                + autor + "\n * totPaginas = " + totPaginas 
                + ", pagAtual = "+ pagAtual + ", aberto = " 
                + aberto + "\n * leitor = " + leitor.getNome() 
                + ", Idade = " + leitor.getIdade() + ", Sexo = "
                + leitor.getSexo() + '}';
    }

    
    //Métodos Abstratos
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (aberto && p>=0 && p<=this.totPaginas) {
            this.setPagAtual(p);
        } else if(p<0 || p>this.totPaginas) {
            System.out.println("Impossível folhear (Página não existe)");
        } else{
            System.out.println("Impossível folhear (livro fechado)");
        }
    }

    @Override
    public void avancarPag() {
        if (aberto && this.pagAtual < this.totPaginas) {
            this.setPagAtual(this.getPagAtual()+1);
        } else if (this.pagAtual == this.totPaginas){
            System.out.println("Impossível avançar, livro finalizado");
        } else{
            System.out.println("Impossível avançar página (livro fechado)");
        }
    }

    @Override
    public void voltarPag() {
        if (aberto && this.pagAtual > 0) {
            this.setPagAtual(this.getPagAtual()-1);
        } else if (this.pagAtual == 0) {
            System.out.println("Impossível voltar");
        } else{
            System.out.println("Impossível voltar página (livro fechado)");
        }
    }
    
}
