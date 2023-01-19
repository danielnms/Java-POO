package aula14a;
    // Classe de Agregação
public class Visualizacao {
    // Atributos
    private Gafanhoto espectador;
    private Video filme;
    
    
    // Método Construtor
    public Visualizacao(Gafanhoto espec, Video filme){
        this.espectador = espec;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    // Métodos Getters (Acessores)
    public Gafanhoto getEspectador(){
        return this.espectador;
    }
    public Video getVideo(){
        return this.filme;
    }
    
    // Métodos Setters (Modificadores
    public void setEspectador(Gafanhoto e){
        this.espectador = e;
    }
    public void setFilme(Video f){
        this.filme = f;
    }
    
    // Métodos Públicos/Sobrecarga
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    // Método toString
    @Override
    public String toString(){
        return "Visualização{ " + "\n Espectador: " + espectador +
                "\n Filme: " + filme + '}';
    }
}
