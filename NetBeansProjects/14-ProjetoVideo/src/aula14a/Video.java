package aula14a;
public class Video implements AcoesVideo{
    // Atributos
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;
    
    // Método Construtor
    public Video(String t){
        this.titulo = t;
        this.avaliacao = 0;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
    }
    
    // Métodos Getters (Acessores)
    public String getTitulo(){
        return this.titulo;
    }
    public int getAvaliacao(){
        return this.avaliacao;
    }
    public int getViews(){
        return this.views;
    }
    public int getCurtidas(){
        return this.curtidas;
    }
    public boolean getReproduzindo(){
        return this.reproduzindo;
    }
    
    // Métodos Setters (Modificadores)
    public void setTitulo(String t){
        this.titulo = t;
    }
    public void setAvaliacao(int a){
        int nova;
        nova = (int) ((this.avaliacao + a) / this.views);
        this.avaliacao = nova;
    }
    public void setViews(int v){
        this.views = v;
    }
    public void setCurtidas(int c){
        this.curtidas = c;
    }
    public void setReproduzindo(boolean r){
        this.reproduzindo = r;
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
    }
    @Override
    public void like() {
        if (reproduzindo) {
            this.setCurtidas(this.getCurtidas()+1);
        } else {
            System.out.println("Para curtir, favor dar play no vídeo!");
        }
    }
    
    // Método toString

    @Override
    public String toString() {
        return "[titulo: " + titulo + "] [avaliacao: " +
                avaliacao + "] [views: " + views + "] [curtidas: " +
                curtidas + "] [reproduzindo: " + reproduzindo + '}' + "\n";
    }
    
}
